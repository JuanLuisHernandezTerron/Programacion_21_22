package U8.U8_Entregable;

import com.google.gson.Gson;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProcessPosts {
    private static Document doc;
    static ArrayList<post> arrayPosts = new ArrayList<>();

    public static void main(String[] args) {
        parseDOM("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U8/U8_Entregable/posts.xml");
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime el titulo");
        String titulo = teclado.next();
        System.out.println("Dime el link");
        String link = teclado.next();
        System.out.println("Dime la descripcion");
        String descripcion = teclado.next();
        System.out.println("Dime un pubdate");
        String pubdate = teclado.next();
        System.out.println("Dime un identificador");
        String identificador = teclado.next();
        post ps1 = new post(titulo, link, descripcion, pubdate, identificador);
        addPost(ps1);
        arrayPosts = getPosts();
        System.out.println(arrayPosts);
        System.out.println("-------------------------------------");
        System.out.println(convertJSON());
        System.out.println("Hay "+numPostStax("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U8/U8_Entregable/posts.xml")+ " post");


    }

    public static int numPostStax(String filename) {
        int contadorPost = 0;
        String etiqueta ="";
        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U8/U8_Entregable/posts.xml"));
            while (xmlEventReader.hasNext()){
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if (xmlEvent.isStartElement()){
                    StartElement startElement = xmlEvent.asStartElement();
                    etiqueta = String.valueOf(startElement.getName().getLocalPart());
                    if (etiqueta.equalsIgnoreCase("post")){
                        contadorPost ++;
                    }
                }
            }
        }catch (FileNotFoundException | XMLStreamException ex){
            System.out.println(ex.getStackTrace());
        }
        return contadorPost;
    }

    public static String convertJSON() {
        Gson json = new Gson();
        String jsonCompleto = json.toJson(arrayPosts);

        try(BufferedWriter EscribirJSON = new BufferedWriter(new FileWriter("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U8/U8_Entregable/archivo.json"))){
            EscribirJSON.write(jsonCompleto);
        } catch (IOException ex) {
            System.out.println(ex.getStackTrace());
        }
        return jsonCompleto;
    }

    public static ArrayList<post> getPosts() {
        ArrayList<post> listaPosts = new ArrayList<>();
        NodeList nl = doc.getElementsByTagName("post");
        for (int i = 0; i < nl.getLength(); i++) {
            if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                post postAUX = new post();
                NodeList nl1 = nl.item(i).getChildNodes();
                for (int j = 0; j < nl1.getLength(); j++) {
                    if (nl1.item(j).getNodeType() == Node.ELEMENT_NODE) {
                        Element el = (Element) nl1.item(j);
                        if (el.getTagName().equalsIgnoreCase("title")) {
                            postAUX.setTitle(el.getTextContent());
                        } else if (el.getTagName().equalsIgnoreCase("link")) {
                            postAUX.setLink(el.getTextContent());
                        } else if (el.getTagName().equalsIgnoreCase("description")) {
                            postAUX.setDescription(el.getTextContent());
                        } else if (el.getTagName().equalsIgnoreCase("pubDate")) {
                            postAUX.setPubDate(el.getTextContent());
                        } else if (el.getTagName().equalsIgnoreCase("guid")) {
                            postAUX.setGuid(el.getTextContent());
                        }
                    }
                }
                listaPosts.add(postAUX);
            }
        }
        return listaPosts;
    }

    public static void addPost(post post) {
        Node root = doc.getDocumentElement();

        Node pos = doc.createElement("post");
        root.appendChild(pos);
        Node title = doc.createElement("title");
        title.setTextContent(post.getTitle());
        pos.appendChild(title);
        Node link = doc.createElement("link");
        link.setTextContent(post.getLink());
        pos.appendChild(link);
        Node description = doc.createElement("description");
        description.setTextContent(post.getDescription());
        pos.appendChild(description);
        Node pubdate = doc.createElement("pubdate");
        pubdate.setTextContent(post.getPubDate());
        pos.appendChild(pubdate);
        Node guid = doc.createElement("guid");
        guid.setTextContent(post.getGuid());
        pos.appendChild(guid);
    }

    public static void parseDOM(String filename) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.parse(new File(filename));
        } catch (ParserConfigurationException | IOException | SAXException ex) {
            System.out.println(ex.getStackTrace());
        }
    }

}
