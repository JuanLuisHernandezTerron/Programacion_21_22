package U9.RepasosExamen.ExamenRepaso2;

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
import java.sql.SQLException;
import java.util.Scanner;

public class ModificacionDOM {
    private static Scanner teclado = new Scanner(System.in);

    public static void anadirLibroNuevo() {
        System.out.println("Dime el titulo del libro");
        String tituloLibro = teclado.nextLine();
        System.out.println("Dime el autor del libro");
        String autorLibro = teclado.nextLine();
        System.out.println("Dime la editorial del libro");
        String editorialLibro = teclado.nextLine();
        System.out.println("Dime las paginas ");
        int paginasLibro = teclado.nextInt();

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U9\\RepasosExamen\\ExamenRepaso2\\libros.xml"));

            Node root = doc.getDocumentElement();
            Node libro = doc.createElement("libro"); //Creamos el nodo libro
            root.appendChild(libro);
            Node titulo = doc.createElement("titulo");
            titulo.setTextContent(tituloLibro);
            libro.appendChild(titulo);
            Node autor = doc.createElement("autor");
            autor.setTextContent(autorLibro);
            libro.appendChild(autor);
            Node editorial = doc.createElement("editorial");
            editorial.setTextContent(editorialLibro);
            libro.appendChild(editorial);
            Node paginas = doc.createElement("paginas");
            paginas.setTextContent(String.valueOf(paginasLibro));
            libro.appendChild(paginas);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            /*ORIGEN DOM*/
            root = doc.getDocumentElement();
            DOMSource origenDOM = new DOMSource(root);

            /*DESTINO DOM*/
            File librosAUX = new File("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U9\\RepasosExamen\\ExamenRepaso2\\xmlAUX.xml");
            StreamResult streamResult = new StreamResult(librosAUX);
            transformer.transform(origenDOM,streamResult);

        } catch (SAXException | ParserConfigurationException | IOException | TransformerException ex) {
            ex.printStackTrace();
        }
    }

    public static void insertarNodo() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U9\\RepasosExamen\\ExamenRepaso2\\xmlAUX.xml"));
            NodeList editorial = doc.getElementsByTagName("editorial"); //Cojemos la informacion que hay dentro de editorial (en este caso ninguna)

            for (int i = 0; i < editorial.getLength(); i++) {
                Node pais = doc.createElement("PaisOrigen");
                editorial.item(i).appendChild(pais);
                pais.setTextContent("Venezuela");
            }

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            /*ORIGEN DOM*/
            Node root = doc.getDocumentElement();
            DOMSource origenDOM = new DOMSource(root);

            /*DESTINO DOM*/
            File librosAUX = new File("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U9\\RepasosExamen\\ExamenRepaso2\\xmlAUX.xml");
            StreamResult streamResult = new StreamResult(librosAUX);
            transformer.transform(origenDOM,streamResult);

        } catch (IOException | ParserConfigurationException | SAXException | TransformerException ex) {
            ex.printStackTrace();
        }
    }

}
