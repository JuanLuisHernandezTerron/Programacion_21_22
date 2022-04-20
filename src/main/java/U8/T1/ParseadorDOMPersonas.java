package U8.T1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ParseadorDOMPersonas {
    public static void parse(String nomFile) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("src/main/java/U8/T1/" + nomFile));

            //Nos saca una lista de todos los hijos y podemos saber cuantos hay
            NodeList nl = doc.getElementsByTagName("persona");
            System.out.println("En este fichero tengo " + nl.getLength() + " etiquetas de personas");

            for (int i = 0; i < nl.getLength(); i++) {
                Node nodo = nl.item(i);
                Element e = (Element) nl.item(i);
                System.out.println("Estoy en una etiqueta: " + e.getTagName());
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    NodeList listaInterior = nodo.getChildNodes();
                    for (int j = 0; j < listaInterior.getLength(); j++) {
                        if (listaInterior.item(j).getNodeType() == Node.ELEMENT_NODE) {
                            Element ele1 = (Element) listaInterior.item(j);
                            System.out.println("Uno de los nodos hijos es la etiqueta " + ele1.getTagName());
                            System.out.println("Cuyo cotenido es " + ele1.getTextContent());
                        }
                    }
                }
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}

