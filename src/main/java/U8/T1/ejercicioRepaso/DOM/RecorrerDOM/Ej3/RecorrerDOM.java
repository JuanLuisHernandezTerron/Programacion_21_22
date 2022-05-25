package U8.T1.ejercicioRepaso.DOM.RecorrerDOM.Ej3;

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

public class RecorrerDOM {
    public static void paginasTotal(){
        int paginas = 0;
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U8\\T1\\ejercicioRepaso\\DOM\\RecorrerDOM\\Ej3\\libro.xml"));
            NodeList libros = doc.getElementsByTagName("libro");

            for (int i = 0; i < libros.getLength(); i++) {
                NodeList atributos = libros.item(i).getChildNodes();
                for (int j = 0; j < atributos.getLength(); j++) {
                    if (atributos.item(j).getNodeType() == Node.ELEMENT_NODE){
                        Element el = (Element) atributos.item(j);
                        if (el.getTagName().equalsIgnoreCase("paginas")){
                            paginas += Integer.parseInt(el.getTextContent());
                        }
                    }
                }
            }
            System.out.println(paginas);
        }catch (ParserConfigurationException | SAXException | IOException ex){
            ex.printStackTrace();
        }
    }

    public static void cojerEditorial(String autor){
        String titulo = "";
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U8\\T1\\ejercicioRepaso\\DOM\\RecorrerDOM\\EJ1Bueno\\personas.xml"));
            NodeList listaNodo = doc.getElementsByTagName("libro");
            for (int i = 0; i < listaNodo.getLength(); i++) {
                NodeList lista = listaNodo.item(i).getChildNodes();
                for (int j = 0; j < lista.getLength(); j++) {
                    if (lista.item(j).getNodeType() == Node.ELEMENT_NODE) {
                        Element element = (Element) lista.item(j);
                        if (element.getTagName().equalsIgnoreCase("")){

                        }
                    }
                }
            }
        }catch (IOException | ParserConfigurationException | SAXException ex){
            ex.printStackTrace();
        }
    }
}
