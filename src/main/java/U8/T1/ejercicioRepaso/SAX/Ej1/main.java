package U8.T1.ejercicioRepaso.SAX.Ej1;

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
            //Primero parseamos a SAX
            SAXParserFactory dbf = SAXParserFactory.newDefaultInstance();
            SAXParser db = dbf.newSAXParser();
            //Creamos un objeto DefaultHandler y llamaremos al parse(db), y podremos la ruta y el objeto defaultHandler creado
            DefaultHandler tienda = new metodosSAX();
            db.parse(new File("src/main/java/U8/T1/ejercicioRepaso/SAX/Ej1/tiendas.xml"),tienda);
            metodosSAX.recorrerArray();
        }catch (ParserConfigurationException | IOException | SAXException ex){
            System.out.println(ex.getStackTrace());
        }
    }

}
