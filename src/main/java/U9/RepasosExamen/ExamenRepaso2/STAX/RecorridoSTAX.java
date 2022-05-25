package U9.RepasosExamen.ExamenRepaso2.STAX;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RecorridoSTAX {
    public static void librosMAXPag() {
        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U9/RepasosExamen/ExamenRepaso/libros.xml"));
            String etiqueta = null;
            Characters character = null;
            String titulo = "";
            String tituloAUX = "";
            String autor = "";
            String autorAUX = "";
            String editorial = "";
            String editorialAUX = "";
            int numeroPag = 0;
            int numeroPagAUX = 0;
            StartElement startElement = null;
            while (xmlEventReader.hasNext()) {
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    startElement = xmlEvent.asStartElement();
                    etiqueta = startElement.getName().getLocalPart();
                } else if (xmlEvent.isCharacters()) {
                    character = xmlEvent.asCharacters();
                    if (etiqueta.equalsIgnoreCase("titulo")) {
                        titulo = character.getData();
                        etiqueta = "";
                    } else if (etiqueta.equalsIgnoreCase("autor")) {
                        autor = character.getData();
                        etiqueta = "";
                    } else if (etiqueta.equalsIgnoreCase("editorial")) {
                        editorial = character.getData();
                        etiqueta = "";
                    } else if (etiqueta.equalsIgnoreCase("paginas")) {
                        numeroPag = Integer.parseInt(character.getData());
                        etiqueta = "";
                    }
                }

                if (numeroPag > numeroPagAUX){
                    tituloAUX = titulo;
                    autorAUX = autor;
                    editorialAUX = editorial;
                    numeroPagAUX = numeroPag;
                }
            }
            System.out.println("El libro con más paginas es: "+tituloAUX+", que su autor es "+autorAUX+", su editorial es "+editorialAUX + " y tiene "+numeroPagAUX+" paginas");
        } catch (XMLStreamException | FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static void numeroLibrosEditorial(String editorial){
        try{
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U9/RepasosExamen/ExamenRepaso2/libros.xml"));
            Characters character = null;
            String etiqueta = null;
            StartElement startElement = null;
            int contadorEditorial = 0;
            String editorialAUX = "";
            while (xmlEventReader.hasNext()){
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if (xmlEvent.isStartElement()){
                    startElement = xmlEvent.asStartElement();
                    etiqueta = startElement.getName().getLocalPart();
                }else if (xmlEvent.isCharacters()){
                    if (etiqueta.equalsIgnoreCase("editorial")){
                        character = xmlEvent.asCharacters();
                        editorialAUX = character.getData();
                        if (editorialAUX.equalsIgnoreCase(editorial)){
                            contadorEditorial++;
                        }
                    }
                }
            }
            System.out.println("La editorial "+editorial+ ", tiene "+contadorEditorial + " libros");
        }catch (FileNotFoundException | XMLStreamException ex){
            ex.printStackTrace();
        }
    }
}
