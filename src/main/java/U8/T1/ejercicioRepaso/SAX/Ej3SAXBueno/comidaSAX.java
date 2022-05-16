package U8.T1.ejercicioRepaso.SAX.Ej3SAXBueno;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class comidaSAX extends DefaultHandler {
    private static ArrayList<comida> arrayComida = new ArrayList<>();
    private String stringAUX;
    comida c1;

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
    }


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        if (qName.equalsIgnoreCase("comida")) {
            c1 = new comida();
            if (attributes != null) {
                for (int i = 0; i < attributes.getLength(); i++) {
                    c1.setId(Integer.parseInt(attributes.getValue(i)));
                }
            }
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
        stringAUX = new String(ch, start, length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);

        if (qName.equalsIgnoreCase("nombre")) {
            c1.setNombre(stringAUX);
        } else if (qName.equalsIgnoreCase("precio")) {
            c1.setPrecio(Integer.parseInt(stringAUX));
        } else if (qName.equalsIgnoreCase("descripcion")) {
            c1.setDescripcion(stringAUX);
        } else if (qName.equalsIgnoreCase("calorias")) {
            c1.setCalorias(Integer.parseInt(stringAUX));
        } else if (qName.equalsIgnoreCase("comida")) {
            arrayComida.add(c1);
        }
    }

    public static void recorrerArray() {
        System.out.println(arrayComida);
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
    }

}
