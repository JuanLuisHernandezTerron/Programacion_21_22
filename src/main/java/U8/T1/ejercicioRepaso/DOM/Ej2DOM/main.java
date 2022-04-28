package U8.T1.ejercicioRepaso.DOM.Ej2DOM;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<persona> arrayPersona = new ArrayList<>();
        int contadorPersona = 0;
        int contadorAtributos = 0;
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("src/main/java/U8/T1/ejercicioRepaso/Ej2/personas.xml"));

            Element root = doc.getDocumentElement();
            NodeList nl = root.getChildNodes();

            for (int i = 0; i < nl.getLength(); i++) {
                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    contadorAtributos = 0;
                    persona p1 = new persona();
                    arrayPersona.add(p1);
                    contadorPersona++;
                    NodeList nodeHijos = nl.item(i).getChildNodes();
                    for (int j = 0; j < nodeHijos.getLength(); j++) {
                        if (nl.item(j).getNodeType() == Node.TEXT_NODE) {
                            Text texto = (Text) nl.item(j);
                            if (contadorAtributos == 0) {
                                contadorAtributos++;
                                String nombre = texto.getNodeValue();
                                arrayPersona.get(contadorAtributos).setNombre(nombre);
                            } else if (contadorAtributos == 1) {
                                int edad = Integer.parseInt(texto.getNodeValue());
                                arrayPersona.get(contadorPersona).setEdad(edad);
                            }
                        }
                    }
                }
            }
        } catch (ParserConfigurationException | IOException | SAXException ex) {
            System.out.println(ex.getStackTrace());
        }
        System.out.println(arrayPersona);
    }
}
