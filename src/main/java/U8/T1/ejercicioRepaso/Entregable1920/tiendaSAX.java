package U8.T1.ejercicioRepaso.Entregable1920;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class tiendaSAX extends DefaultHandler {
    private static ArrayList<tienda> arrayTienda= new ArrayList<>();
    private String textoCONT;
    private int contadorTienda = 0;
    private int contadorElementos = 0;

    public tiendaSAX() {
        super();
    }

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("Se inicia el parseo");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        if(qName.equalsIgnoreCase("tienda")){
            for (int i = 0; i < attributes.getLength(); i++) {
                System.out.println("El atributo "+ attributes.getQName(i)+" es "+attributes.getValue(i));
            }
            tienda t1 = new tienda();
            arrayTienda.add(t1);
        }
    }

    public static void mostrarTiendas(){
        System.out.println(arrayTienda);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
        String texto = new String(ch,start,length);
        textoCONT = texto;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
        if (qName.equalsIgnoreCase("nombre")){
            arrayTienda.get(contadorTienda).setNombre(textoCONT);
        }else if (qName.equalsIgnoreCase("localidad")){
            arrayTienda.get(contadorTienda).setLocalidad(textoCONT);
        }else if (qName.equalsIgnoreCase("establecimientos")){
            Integer establecimiento = Integer.parseInt(textoCONT);
            arrayTienda.get(contadorTienda).setEstablecimientos(establecimiento);
            contadorTienda++;
        }
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        System.out.println("Se acaba el parseo");
    }

}
