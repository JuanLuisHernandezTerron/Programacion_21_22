package U8.T1.ejercicioRepaso.Entregable1920.DOM;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class recorridoDOM {
    private static int contadorNodosHijos;
    private int contadorTextos = 0;

    public static void numNodosHijos() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("src/main/java/U8/T1/ejercicioRepaso/Entregable1920/DOM/personas.xml"));
            Element root = doc.getDocumentElement();
            NodeList nl = root.getChildNodes();
            for (int i = 0; i < nl.getLength(); i++) {
                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    contadorNodosHijos++;
                }
            }
            System.out.println("Tiene " + contadorNodosHijos + " nodos");
        } catch (ParserConfigurationException | DOMException | SAXException | IOException ex) {
            System.out.println(ex.getStackTrace());
        }
    }

    public static void mostrarXMLDom() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("src/main/java/U8/T1/ejercicioRepaso/Entregable1920/DOM/personas.xml"));

            Element root = doc.getDocumentElement();
            NodeList nl = root.getChildNodes();

            for (int i = 0; i < nl.getLength(); i++) {
                System.out.println();
                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    Element e1 = (Element) nl.item(i);
                    if (e1.hasAttribute("id")) {
                        NamedNodeMap nodeMap = e1.getAttributes();
                        for (int j = 0; j < nodeMap.getLength(); j++) {
                            Node node = nodeMap.item(j);
                            Attr atributo = e1.getAttributeNode(node.getNodeName());
                            System.out.println("El " + atributo.getNodeName() + " de la tienda es " + atributo.getValue());
                        }
                    }
                    NodeList nl2 = e1.getChildNodes();
                    for (int j = 0; j < nl2.getLength(); j++) {
                        if (nl2.item(j).getNodeType() == Node.ELEMENT_NODE) {
                            Element e2 = (Element) nl2.item(j);
                            if (e2.getTagName().equalsIgnoreCase("nombre")) {
                                System.out.print("Su nombre es:");
                                System.out.println(e2.getTextContent());
                            } else if (e2.getTagName().equalsIgnoreCase("localidad")) {
                                System.out.print("Su localidad es: ");
                                System.out.println(e2.getTextContent());
                            } else if (e2.getTagName().equalsIgnoreCase("establecimientos")) {
                                System.out.print("Su establecimiento es:");
                                System.out.println(e2.getTextContent());
                            }
                        }
                    }
                }
            }
        } catch (ParserConfigurationException | IOException | SAXException ex) {
            System.out.println(ex.getStackTrace());
        }
    }

    public static void mostrarContenidoEtiqueta(String s) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("src/main/java/U8/T1/ejercicioRepaso/Entregable1920/DOM/personas.xml"));

            Element root = doc.getDocumentElement();
            NodeList nl = root.getChildNodes();

            for (int i = 0; i < nl.getLength(); i++) {
                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    Element e1 = (Element) nl.item(i);
                    if (nl.item(i).getNodeName().equalsIgnoreCase(s)) {
                        NodeList nlAUX = e1.getChildNodes();
                        for (int j = 0; j < nlAUX.getLength(); j++) {
                            if (nlAUX.item(j).getNodeType() == Node.ELEMENT_NODE) {
                                Element el2 = (Element) nlAUX.item(j);
                                if (el2.getTagName().equalsIgnoreCase("nombre")) {
                                    System.out.print(el2.getTagName() + ": ");
                                    System.out.println(el2.getTextContent());
                                }else if(el2.getTagName().equalsIgnoreCase("localidad")){
                                    System.out.print(el2.getTagName() + ": ");
                                    System.out.println(el2.getTextContent());
                                }else if(el2.getTagName().equalsIgnoreCase("establecimientos")){
                                    System.out.print(el2.getTagName() + ": ");
                                    System.out.println(el2.getTextContent());
                                }
                            }
                        }
                    }
                }
                System.out.println();
            }

        } catch (ParserConfigurationException | IOException | SAXException | DOMException ex) {
            System.out.println(ex.getStackTrace());
        }
    }
}
