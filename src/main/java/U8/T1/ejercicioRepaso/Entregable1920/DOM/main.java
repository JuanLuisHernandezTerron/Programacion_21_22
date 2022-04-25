package U8.T1.ejercicioRepaso.Entregable1920.DOM;


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

public class main {
    public static void main(String[] args) {

        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("src/main/java/U8/T1/ejercicioRepaso/Entregable1920/DOM/personas.xml"));

            Element root = doc.getDocumentElement();
            NodeList nl = root.getChildNodes();
            for (int i = 0; i < nl.getLength(); i++) {
                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE){
                    
                }
            }

        }catch (ParserConfigurationException | IOException | SAXException ex){
            System.out.println(ex.getStackTrace());
        }
    }
}
