package U9.ExamenRepaso;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class RecorridoStax {

    public static void datosMaxLibro() {
        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileReader("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U9\\ExamenRepaso\\libros.xml"));
            String etiqueta = "";
            int paginas = 0;
            int paginaAUX = 0;
            String titulo = "";
            String tituloAUX = "";
            String autor = "";
            String autorAUX = "";
            String editorial = "";
            String editorialAUX = "";
            Characters caracter = null;
            StartElement startElement;
            while (xmlEventReader.hasNext()) {
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    startElement = xmlEvent.asStartElement();
                    etiqueta = startElement.getName().getLocalPart();
                } else if (xmlEvent.isCharacters()) {
                    if (etiqueta.equalsIgnoreCase("titulo")) {
                        caracter = xmlEvent.asCharacters();
                        titulo = caracter.getData();
                        etiqueta="";
                    } else if (etiqueta.equalsIgnoreCase("autor")) {
                        caracter = xmlEvent.asCharacters();
                        autor = caracter.getData();
                        etiqueta="";
                    } else if (etiqueta.equalsIgnoreCase("editorial")) {
                        caracter = xmlEvent.asCharacters();
                        editorial = caracter.getData();
                        etiqueta="";
                    }
                    if (etiqueta.equalsIgnoreCase("paginas")) {
                        caracter = xmlEvent.asCharacters();
                        paginas = Integer.parseInt(caracter.getData());
                        if (paginas > paginaAUX) {
                            paginaAUX = paginas;
                            tituloAUX = titulo;
                            autorAUX = autor;
                            editorialAUX = editorial;
                        }
                        etiqueta="";
                    }
                }
            }
            System.out.println("El titulo del libro con mas paginas es "+tituloAUX+", el autor es "+autorAUX+", su editorial es "+editorialAUX+" y tiene "+paginaAUX+" paginas");
        } catch (XMLStreamException | FileNotFoundException ex) {
            System.out.println(ex.getStackTrace());
        }
    }

    public static void mostrarNumeroLibros(String editorial){
        int contadorLibros = 0;
        try{
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileReader("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U9\\ExamenRepaso\\libros.xml"));
            StartElement startElement;
            String etiqueta = "";
            Characters caracter =  null;
            while (xmlEventReader.hasNext()){
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if (xmlEvent.isStartElement()){
                    startElement = xmlEvent.asStartElement();
                    etiqueta = startElement.getName().getLocalPart();
                }else if(xmlEvent.isCharacters()){
                    if (etiqueta.equalsIgnoreCase("editorial")){
                        caracter=xmlEvent.asCharacters();
                        if (caracter.getData().equalsIgnoreCase(editorial)){
                            contadorLibros++;
                        }
                    }
                }
            }
        }catch (FileNotFoundException | XMLStreamException ex){
            System.out.println(ex.getStackTrace());
        }
        System.out.println("La editorial "+editorial+" tiene "+contadorLibros+ " libros");
    }
}
