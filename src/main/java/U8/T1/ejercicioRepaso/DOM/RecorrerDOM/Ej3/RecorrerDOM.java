package U8.T1.ejercicioRepaso.DOM.RecorrerDOM.Ej3;

import com.google.gson.Gson;
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
import java.util.Scanner;

public class RecorrerDOM {
    private static Scanner teclado = new Scanner(System.in);

    public static void paginasTotal() {
        int paginas = 0;
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U8\\T1\\ejercicioRepaso\\DOM\\RecorrerDOM\\Ej3\\libro.xml"));
            NodeList libros = doc.getElementsByTagName("libro");

            for (int i = 0; i < libros.getLength(); i++) {
                NodeList atributos = libros.item(i).getChildNodes();
                for (int j = 0; j < atributos.getLength(); j++) {
                    if (atributos.item(j).getNodeType() == Node.ELEMENT_NODE) {
                        Element el = (Element) atributos.item(j);
                        if (el.getTagName().equalsIgnoreCase("paginas")) {
                            paginas += Integer.parseInt(el.getTextContent());
                        }
                    }
                }
            }
            System.out.println(paginas);
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void cojerEditorial(String autor) {
        String editorial = "";
        int contador = 0;
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U8/T1/ejercicioRepaso/DOM/RecorrerDOM/Ej3/libro.xml"));
            NodeList listaNodo = doc.getElementsByTagName("libro");
            for (int i = 0; i < listaNodo.getLength(); i++) {
                NodeList lista = listaNodo.item(i).getChildNodes();
                for (int j = 0; j < lista.getLength(); j++) {
                    if (lista.item(j).getNodeType() == Node.ELEMENT_NODE) {
                        Element element = (Element) lista.item(j);
                        if (element.getTagName().equalsIgnoreCase("autor")) {
                            if (element.getTextContent().equalsIgnoreCase(autor)) {
                                contador++;
                            }
                        } else if (element.getTagName().equalsIgnoreCase("editorial")) {
                            if (contador == 1) {
                                editorial = element.getTextContent();
                                contador = 0;
                            }
                        }
                    }
                }
            }
            System.out.println("La editorial del libro del autor " + autor + " es " + editorial);
        } catch (IOException | ParserConfigurationException | SAXException ex) {
            ex.printStackTrace();
        }
    }

    public static void anadirNodo() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U8/T1/ejercicioRepaso/DOM/RecorrerDOM/Ej3/libro.xml"));

            NodeList listaLibro = doc.getElementsByTagName("libro");
            for (int i = 0; i < listaLibro.getLength(); i++) {
                Node capitulos = doc.createElement("capitulos");
                capitulos.setTextContent("6");
                listaLibro.item(i).appendChild(capitulos);
            }

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            /*OrigenDOM*/
            Node root = doc.getDocumentElement();
            DOMSource domSource = new DOMSource(root);

            /*DESTINO DOM*/
            File file = new File("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U8/T1/ejercicioRepaso/DOM/RecorrerDOM/Ej3/CopiasLibro.xml");
            StreamResult streamResult = new StreamResult(file);

            /*Ejecutamos para que escriba la copia en xml*/
            transformer.transform(domSource, streamResult);

        } catch (IOException | ParserConfigurationException | SAXException ex) {
            ex.printStackTrace();
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
    }

    public static void crearLibro(){
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U8/T1/ejercicioRepaso/DOM/RecorrerDOM/Ej3/CopiasLibro.xml"));
            Element root = doc.getDocumentElement();
            Node libro = doc.createElement("libro");
            root.appendChild(libro);
            Node titulo = doc.createElement("titulo");
            titulo.setTextContent("JoseRodríguez");
            libro.appendChild(titulo);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            DOMSource domSource = new DOMSource(root);

            File file = new File("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U8/T1/ejercicioRepaso/DOM/RecorrerDOM/Ej3/CopiasLibro.xml");
            StreamResult streamResult = new StreamResult(file);

            transformer.transform(domSource,streamResult);

        }catch (ParserConfigurationException | SAXException | IOException ex){
            ex.printStackTrace();
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
    }
}
