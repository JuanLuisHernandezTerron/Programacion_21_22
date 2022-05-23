package U9.RepasosExamen.ExamenRepaso2;

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

public class ModificacionDOM {
    public void anadirLibroNuevo(){
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document root = db.parse(new File("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U9/RepasosExamen/ExamenRepaso2/libros.xml"));
            Node libro = root.createElement("libro");
            root.appendChild(libro);
            Node titulo = root.createElement("titulo");
            titulo.setTextContent("Como ser programador en 3 sencillos pasos");
            libro.appendChild(titulo);
            Node autor = root.createElement("Juan Luis Hernández");

        }catch (SAXException | ParserConfigurationException | IOException ex){
            ex.printStackTrace();
        }
    }
}
