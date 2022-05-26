package U9.U8U9_Examen.Ejercicio2;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RecorridoSTAX {
    public static void mostrarPilotoMAXCampe() {
        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U9/U8U9_Examen/Ejercicio2/ejercicio1.xml"));
            Characters characters = null;
            StartElement startElement = null;
            String etiqueta = null;
            String nombre = "";
            String nombreAUX = "";
            int edad = 0;
            int edadAUX = 0;
            String escuderia = "";
            String escuderiaAUX = "";
            int campeonatos = 0;
            int campeonatosAUX = 0;
            while (xmlEventReader.hasNext()) {
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    startElement = xmlEvent.asStartElement();
                    etiqueta = startElement.getName().getLocalPart();
                } else if (xmlEvent.isCharacters()) {
                    if (etiqueta.equalsIgnoreCase("nombre")) {
                        characters = xmlEvent.asCharacters();
                        nombre = characters.getData();
                        etiqueta = "";
                    } else if (etiqueta.equalsIgnoreCase("edad")) {
                        characters = xmlEvent.asCharacters();
                        edad = Integer.parseInt(characters.getData());
                        etiqueta = "";
                    } else if (etiqueta.equalsIgnoreCase("escuderia")) {
                        characters = xmlEvent.asCharacters();
                        escuderia = characters.getData();
                        etiqueta = "";
                    } else if (etiqueta.equalsIgnoreCase("campeonatos")) {
                        characters = xmlEvent.asCharacters();
                        campeonatos = Integer.parseInt(characters.getData());
                        etiqueta = "";
                    }

                    if (campeonatos > campeonatosAUX) {
                        nombreAUX = nombre;
                        edadAUX = edad;
                        escuderiaAUX = escuderia;
                        campeonatosAUX = campeonatos;
                    }
                }
            }
            System.out.println(nombreAUX + " tiene " + edadAUX + " años, su escuderia es " + escuderiaAUX + ", y tiene " + campeonatosAUX + " campeonatos");
        } catch (FileNotFoundException | XMLStreamException ex) {
            ex.printStackTrace();
        }
    }

    public static void numeroPilotosEscu(String escuderia) {
        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U9/U8U9_Examen/Ejercicio2/ejercicio1.xml"));
            Characters characters = null;
            StartElement startElement = null;
            String etiqueta = null;
            int contadorPilotos = 0;
            while (xmlEventReader.hasNext()) {
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    startElement = xmlEvent.asStartElement();
                    etiqueta = startElement.getName().getLocalPart();
                } else if (xmlEvent.isCharacters()) {
                    if (etiqueta.equalsIgnoreCase("escuderia")){
                        characters = xmlEvent.asCharacters();
                        if (characters.getData().equalsIgnoreCase(escuderia)){
                            contadorPilotos ++;
                        }
                    }
                }
            }
            System.out.println("La escuderia "+escuderia + ", tiene "+contadorPilotos +" pilotos");
        } catch (FileNotFoundException | XMLStreamException ex) {
            ex.printStackTrace();
        }
    }
}
