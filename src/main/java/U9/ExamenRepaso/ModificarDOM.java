package U9.ExamenRepaso;

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
import java.util.Scanner;

public class ModificarDOM {

    public static void insertarNodo() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U9\\ExamenRepaso\\libros.xml"));

            NodeList listaLibro = doc.getElementsByTagName("libro");
            for (int i = 0; i < listaLibro.getLength(); i++) {
                if (listaLibro.item(i).getNodeType() == Node.ELEMENT_NODE){
                    NodeList listaAtributos = (NodeList) listaLibro.item(i);
                    for (int j = 0; j < listaAtributos.getLength(); j++) {
                        if (listaAtributos.item(j).getNodeType() == Node.ELEMENT_NODE){
                            Element element = (Element) listaAtributos.item(j);
                            if (element.getTagName().equalsIgnoreCase("editorial")){
                                Element pais = doc.createElement("paisOrigen");
                                element.appendChild(pais);
                            }
                        }
                    }
                }
            }
        } catch (IOException | ParserConfigurationException | SAXException ex) {
            System.out.println(ex.getStackTrace());
        }
    }

    public static void escribirFichero(){

    }

    public static void anadirLibro() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U9\\ExamenRepaso\\libros.xml"));
            Libro libro = crearLibro();
            Node root = doc.getDocumentElement();
            Node libroAUX = doc.createElement("libro");
            root.appendChild(libroAUX);
            Node titulo = doc.createElement("titulo");
            titulo.setTextContent(libro.getTitulo());
            libroAUX.appendChild(titulo);
            Node autor = doc.createElement("autor");
            autor.setTextContent(libro.getAutor());
            libroAUX.appendChild(autor);
            Node editorial = doc.createElement("editorial");
            editorial.setTextContent(libro.getEditorial());
            libroAUX.appendChild(editorial);
            Node paginas = doc.createElement("paginas");
            paginas.setTextContent(String.valueOf(libro.getPaginas()));
            libroAUX.appendChild(paginas);
        } catch (ParserConfigurationException | IOException | SAXException ex) {
            System.out.println(ex.getStackTrace());
        }
    }

    public static Libro crearLibro() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el titulo del libro");
        String tiulo = teclado.next();
        System.out.println("Dime el autor del libro");
        String autor = teclado.next();
        System.out.println("Dime la editorial del libro");
        String editorial = teclado.next();
        System.out.println("Dime cuantas paginas tiene el libro");
        int numeroPag = teclado.nextInt();
        return new Libro(tiulo, autor, editorial, numeroPag);
    }
}
