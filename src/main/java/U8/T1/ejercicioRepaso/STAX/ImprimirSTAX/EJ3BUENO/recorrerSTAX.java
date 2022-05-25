package U8.T1.ejercicioRepaso.STAX.ImprimirSTAX.EJ3BUENO;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class recorrerSTAX {
    public static void sacarEdades(String nombre){
        try{
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U8/T1/ejercicioRepaso/STAX/ImprimirSTAX/EJ3BUENO/personas.xml"));
            Characters character = null;
            String etiqueta = null;
            StartElement startElement = null;
            int edadesSumadas = 0;
            boolean esMaria = false;
            while (xmlEventReader.hasNext()){
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if (xmlEvent.isStartElement()){
                    startElement = xmlEvent.asStartElement();
                    etiqueta = startElement.getName().getLocalPart();
                } else if (xmlEvent.isCharacters()) {
                    character = xmlEvent.asCharacters();
                    if (etiqueta.equalsIgnoreCase("nombre")){
                        if (character.getData().equalsIgnoreCase(nombre)){
                            esMaria = true;
                            etiqueta = "";
                        }
                    } else if (etiqueta.equalsIgnoreCase("edad")) {
                        if (esMaria){
                            edadesSumadas += Integer.parseInt(character.getData());
                            esMaria = false;
                        }
                    }
                }
            }
            System.out.println(edadesSumadas);
        }catch (FileNotFoundException | XMLStreamException ex){
            ex.printStackTrace();
        }
    }
}
