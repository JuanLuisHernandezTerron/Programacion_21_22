package U8.T1.ejercicioRepaso.DOM.RecorrerDOM.EJ1Bueno;

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
        ArrayList<comida> arraycomida = new ArrayList<>();
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U8\\T1\\ejercicioRepaso\\DOM\\RecorrerDOM\\EJ1\\personas.xml"));
            NodeList nl = doc.getElementsByTagName("comida"); //nos recoje toda las comidas

            for (int i = 0; i < nl.getLength(); i++) {
                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    NodeList nl1 = nl.item(i).getChildNodes();
                    comida c = new comida();
                    for (int j = 0; j < nl1.getLength(); j++) {
                        if (nl1.item(j).getNodeType() == Node.ELEMENT_NODE) {
                            Element e1 = (Element) nl1.item(j);
                            if (e1.getTagName().equalsIgnoreCase("nombre")) {
                                c.setNombre(e1.getTextContent());
                            } else if (e1.getTagName().equalsIgnoreCase("precio")) {
                                c.setPrecio(Integer.parseInt(e1.getTextContent()));
                            } else if (e1.getTagName().equalsIgnoreCase("descripcion")) {
                                c.setDescripcion(e1.getTextContent());
                            } else if (e1.getTagName().equalsIgnoreCase("calorias")) {
                                c.setCalorias(Integer.parseInt(e1.getTextContent()));
                            }
                        }
                    }
                    arraycomida.add(c);
                }
            }
        } catch (DOMException | ParserConfigurationException | SAXException |
                IOException ex) {
            System.out.println(ex.getStackTrace());
        }
        System.out.println(arraycomida);
    }
}
