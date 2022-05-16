package U8.T1.ejercicioRepaso.SAX.Ej4SAXBueno;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class catalogoSAX extends DefaultHandler {
    private String stringAux;
    private static ArrayList<catalogo> arrayCatalogo = new ArrayList<>();
    catalogo c;
    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        if (qName.equalsIgnoreCase("cd")){
            c = new catalogo();
            if (attributes != null){
                for (int i = 0; i < attributes.getLength(); i++) {
                    System.out.println("Su "+ attributes.getQName(i)+ " es "+attributes.getValue(i));
                }
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
        if (qName.equalsIgnoreCase("titulo")){
            c.setTitulo(stringAux);
        }else if (qName.equalsIgnoreCase("artista")){
            c.setArtista(stringAux);
        }else if(qName.equalsIgnoreCase("origen")){
            c.setOrigen(stringAux);
        }else if(qName.equalsIgnoreCase("precio")){
            c.setPrecio(Double.parseDouble(stringAux));
        }else if(qName.equalsIgnoreCase("ano")){
            c.setAno(Integer.parseInt(stringAux));
        }else if(qName.equalsIgnoreCase("cd")){
            arrayCatalogo.add(c);
        }
    }

    public static void mostrarArray(){
        System.out.println(arrayCatalogo);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
        stringAux = new String( ch,  start, length);
    }
}
