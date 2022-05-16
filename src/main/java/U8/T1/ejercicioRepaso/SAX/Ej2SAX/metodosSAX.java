package U8.T1.ejercicioRepaso.SAX.Ej2SAX;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class metodosSAX extends DefaultHandler {
    private String stringAUX;
    private static ArrayList<tienda> arrayTienda = new ArrayList<>();
    private int contadorElementos = 0;

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("Comienza el parseo");
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        System.out.println("Termina el parseo");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
       if (attributes != null){
           for (int i = 0; i < attributes.getLength(); i++) {
               System.out.println("El "+attributes.getQName(i) + " es "+attributes.getValue(i));
           }
       }

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
        tienda t1 = new tienda();
        arrayTienda.add(t1);
        if (qName.equalsIgnoreCase("nombre")){
            arrayTienda.get(contadorElementos).setNombre(stringAUX);
        }else if (qName.equalsIgnoreCase("localidad")){
            arrayTienda.get(contadorElementos).setLocalidad(stringAUX);
        }else if (qName.equalsIgnoreCase("establecimientos")){
            arrayTienda.get(contadorElementos++).setEstablecimientos(Integer.parseInt(stringAUX));
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
        stringAUX = new String(ch,start,length);
    }

    @Override
    public String toString() {
        return "metodosSAX{" +
                "stringAUX='" + stringAUX + '\'' +
                ", arrayTienda=" + arrayTienda +
                ", contadorElementos=" + contadorElementos +
                '}';
    }

    public String getStringAUX() {
        return stringAUX;
    }

    public void setStringAUX(String stringAUX) {
        this.stringAUX = stringAUX;
    }

    public ArrayList<tienda> getArrayTienda() {
        return arrayTienda;
    }

    public void setArrayTienda(ArrayList<tienda> arrayTienda) {
        metodosSAX.arrayTienda = arrayTienda;
    }
    public static void recorrerArray(){
        System.out.println(arrayTienda);
    }
}
