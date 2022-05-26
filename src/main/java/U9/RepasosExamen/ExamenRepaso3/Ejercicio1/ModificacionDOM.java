package U9.RepasosExamen.ExamenRepaso3.Ejercicio1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificacionDOM {
    public static void anadirPista(){
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U9\\RepasosExamen\\ExamenRepaso3\\Ejercicio1\\F1.xml"));

            NodeList listaEscuderia = doc.getElementsByTagName("escuderia");
            for (int i = 0; i < listaEscuderia.getLength(); i++) {
                Node pista = doc.createElement("PistaPractica");
                pista.setTextContent("Mugello");
                listaEscuderia.item(i).appendChild(pista);
            }

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            /*ORIGEN DOM*/
            Element root = doc.getDocumentElement();
            DOMSource domSource = new DOMSource(root);

            /*DESTINO DOM*/
            File file = new File("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U9\\RepasosExamen\\ExamenRepaso3\\Ejercicio1\\F1AUX.xml");
            StreamResult streamResult = new StreamResult(file);

            transformer.transform(domSource,streamResult);
        } catch (SAXException | IOException | ParserConfigurationException | TransformerException ex){
            ex.printStackTrace();
        }
    }

    public static void crearEscuderia(){
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U9\\RepasosExamen\\ExamenRepaso3\\Ejercicio1\\F1AUX.xml"));

            Element root = doc.getDocumentElement();
            Node escuderia = doc.createElement("escuderia");
            root.appendChild(escuderia);
            Node nombreEscuderia = doc.createElement("nombreEscuderia");
            nombreEscuderia.setTextContent("HRT");
            escuderia.appendChild(nombreEscuderia);


            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            /*ORIGEN DOM*/
            DOMSource domSource = new DOMSource(root);

            /*DESTINO DOM*/
            File file = new File("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U9\\RepasosExamen\\ExamenRepaso3\\Ejercicio1\\F1AUX.xml");
            StreamResult streamResult = new StreamResult(file);

            transformer.transform(domSource,streamResult);
        } catch (SAXException | IOException | ParserConfigurationException | TransformerException ex){
            ex.printStackTrace();
        }
    }
}
