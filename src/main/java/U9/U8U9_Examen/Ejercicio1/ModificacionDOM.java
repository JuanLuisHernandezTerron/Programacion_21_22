package U9.U8U9_Examen.Ejercicio1;

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

public class ModificacionDOM {
    private static Scanner teclado = new Scanner(System.in);
    public static void anadirPilotoNuevo(){
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U9/U8U9_Examen/Ejercicio1/pilotos.xml"));
            System.out.println("Dime el nombre del piloto");
            String nombrePiloto = teclado.nextLine();
            System.out.println("Dime la edad del piloto");
            int edadPiloto = teclado.nextInt();
            System.out.println("Dime la escuderia del piloto");
            String escuderiaPiloto = teclado.next();
            System.out.println("Dime cuantos campeonatos tiene el piloto");
            int campeonatosPiloto = teclado.nextInt();

            Element root = doc.getDocumentElement();
            Node piloto = doc.createElement("piloto");
            root.appendChild(piloto);

            Node nombre = doc.createElement("nombre");
            nombre.setTextContent(nombrePiloto);
            piloto.appendChild(nombre);

            Node edad = doc.createElement("edad");
            edad.setTextContent(String.valueOf(edadPiloto));
            piloto.appendChild(edad);

            Node escuderia = doc.createElement("escuderia");
            escuderia.setTextContent(escuderiaPiloto);
            piloto.appendChild(escuderia);

            Node campeonatos = doc.createElement("campeonatos");
            campeonatos.setTextContent(String.valueOf(campeonatosPiloto));
            piloto.appendChild(campeonatos);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            DOMSource domSource = new DOMSource(root);

            File file = new File("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U9/U8U9_Examen/Ejercicio1/ejercicio1.xml");
            StreamResult streamResult = new StreamResult(file);

            transformer.transform(domSource,streamResult);
        }catch (ParserConfigurationException | SAXException | IOException ex){
            ex.printStackTrace();
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertarNodoOrigen(){
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U9/U8U9_Examen/Ejercicio1/ejercicio1.xml"));

            NodeList listaPilotos = doc.getElementsByTagName("piloto");

            for (int i = 0; i < listaPilotos.getLength(); i++) {
                Node pais = doc.createElement("PaisOrigen");
                pais.setTextContent("Espana");
                listaPilotos.item(i).appendChild(pais);
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            Element root = doc.getDocumentElement();
            DOMSource domSource = new DOMSource(root);

            File file = new File("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U9/U8U9_Examen/Ejercicio1/ejercicio1.xml");
            StreamResult streamResult = new StreamResult(file);

            transformer.transform(domSource,streamResult);
        }catch (IOException | ParserConfigurationException | SAXException ex){
            ex.printStackTrace();
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
    }
}
