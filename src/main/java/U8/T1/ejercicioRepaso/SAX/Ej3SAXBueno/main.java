package U8.T1.ejercicioRepaso.SAX.Ej3SAXBueno;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        try{
            SAXParserFactory dbf = SAXParserFactory.newInstance();
            SAXParser db = dbf.newSAXParser();
            DefaultHandler comidaSax = new comidaSAX();
            db.parse(new File("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U8\\T1\\ejercicioRepaso\\SAX\\Ej1\\Ej3SAXBueno\\almuerzo.xml"),comidaSax); //cojer el absolute path
        }catch (SAXException | IOException | ParserConfigurationException ex){
            System.out.println(ex.getStackTrace());
        }
        comidaSAX.recorrerArray();
    }
}
