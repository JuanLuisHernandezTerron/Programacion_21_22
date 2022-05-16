package U8.T1.ejercicioRepaso.SAX.Ej1SAX;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws SAXException {
        System.out.println();
        try{
            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser saxParser = spf.newSAXParser();
            DefaultHandler personSax = new personSax();
            saxParser.parse("src/main/java/U8/T1/ejercicioRepaso/U8.T1.ejercicioRepaso.Ej1/personas.xml",personSax);
        }catch (ParserConfigurationException | IOException | SAXException ex){
            System.out.println(ex.getStackTrace());
        }
    }


}
