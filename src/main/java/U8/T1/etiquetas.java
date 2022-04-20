package U8.T1;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class etiquetas extends DefaultHandler {
    public etiquetas(){
        super();
    }

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("Comienzo del parseo del documento");
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        System.out.println("Finalizacion del parseo del documento");
    }


}
