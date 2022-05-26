package U9.RepasosExamen.ExamenRepaso3.Ejercicio2;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class RecorridoSTAX {
    public static void cojerEscuderia(String escuderia){
        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileReader("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U9\\RepasosExamen\\ExamenRepaso3\\Ejercicio1\\F1.xml"));
            String etiqueta = null;
            Characters characters = null;
            StartElement startElement = null;
            String escuderiaAUX = "";
            String patrocinador = "";
            boolean esta_escuderia = false;

            while (xmlEventReader.hasNext()){
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if (xmlEvent.isStartElement()){
                    startElement = xmlEvent.asStartElement();
                    etiqueta = startElement.getName().getLocalPart();
                }else if (xmlEvent.isCharacters()){
                    if (etiqueta.equalsIgnoreCase("nombreEscuderia")){
                        characters = xmlEvent.asCharacters();
                        escuderiaAUX = characters.getData();
                        if (escuderiaAUX.equalsIgnoreCase(escuderia)){
                            esta_escuderia = true;
                        }
                        etiqueta = "";
                    }else if (etiqueta.equalsIgnoreCase("patrocinadorPrincipal")){
                        characters = xmlEvent.asCharacters();
                        if (esta_escuderia){
                            patrocinador = characters.getData();
                            esta_escuderia = false;
                        }
                        etiqueta = "";
                    }
                }
            }
            System.out.println("La escuderia "+escuderia + " tiene como patrocinador a "+patrocinador);
        }catch (XMLStreamException | FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
