package U8.T1.ejercicioRepaso.SAX.Ej1.Ej1SAX;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.ArrayList;

public class personSax extends DefaultHandler {
    private int contadorAtributo = 0;
    private int contadorPersona = 0;


    private ArrayList<persona> arrayPersonas = new ArrayList<>();

    public personSax() {
        super();
    }

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("Comienzo del parseado del documento personasXML.xml");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {
        super.startElement(uri, localName, qName, attributes);

        if (qName.equalsIgnoreCase("persona")){
            persona personaAUX = new persona();
            arrayPersonas.add(personaAUX);
            contadorPersona++;
        }
    }

//    @Override
//    public void characters(char[] ch, int start, int length) throws SAXException {
//        super.characters(ch, start, length);
//        String content = new String(ch, start, length);
//        contadorAtributo++;
//        if (contadorAtributo == 1){
//            arrayPersonas.get(contadorPersona).setNombre(content);
//        }else{
//            Integer edad = Integer.valueOf(content);
//            arrayPersonas.get(contadorPersona).setEdad(edad);
//        }
//    }


    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);

        System.out.print("</" + qName + ">");
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        System.out.println("Fin del parseado del documento personasXML.xml");
    }

    public ArrayList<persona> getArrayPersonas() {
        return arrayPersonas;
    }

    @Override
    public String toString() {
        return "personSax{" +
                "arrayPersonas=" + arrayPersonas +
                '}';
    }
}
