package U8.T1.ejercicioRepaso.Entregable1920;

import U8.T1.ejercicioRepaso.Ej1SAX.personSax;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.security.sasl.SaslException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        try{
            SAXParserFactory dbf = SAXParserFactory.newInstance();
            SAXParser saxParser = dbf.newSAXParser();
            DefaultHandler tiendaSax = new tiendaSAX();
            saxParser.parse(new File("src/main/java/U8/T1/ejercicioRepaso/Entregable1920/personas.xml"),tiendaSax);
        }catch (ParserConfigurationException | SAXException | IOException ex){
            System.out.println(ex.getStackTrace());
        }
        tiendaSAX.mostrarTiendas();
    }
}
