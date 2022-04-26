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
        recorridoDOM.numNodosHijos();
        System.out.println();
        recorridoDOM.mostrarXMLDom();
        recorridoDOM.mostrarContenidoEtiqueta("tienda");
    }
}
