package U8.T1.ejercicioRepaso.STAX.ImprimirSTAX.EJ1;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class mostrarSTAX {
    public static void main(String[] args) {
        Characters caracter = null;
        int contadorTiendas = 0;
        try {
            //Obtenemos el objeto xmlEventReader
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReaderEvent = xmlInputFactory.createXMLEventReader(new FileInputStream("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U8\\T1\\ejercicioRepaso\\STAX\\ImprimirSTAX\\EJ1\\tiendas.xml"));
            String etiquetaActual = "";
            //Iteramos sobre la lista de nodos,es decir vamos a estar pidiendo nodos, hasta que finalize.
            while (xmlReaderEvent.hasNext()) {
                //nos devuelve el nodo (pull)
                XMLEvent xmlReader = xmlReaderEvent.nextEvent();
                if (xmlReader.isStartDocument()) {
                    System.out.println("Inicio del parseo");
                } else if (xmlReader.isEndDocument()) {
                    System.out.println("Fin del parseo");
                } else if (xmlReader.isStartElement()) {
                    StartElement etiquetaAbrir = xmlReader.asStartElement();
                    String nombreEtiquetaAbrir = etiquetaAbrir.getName().getLocalPart();
                    switch (nombreEtiquetaAbrir) {
                        case "tienda":
                            etiquetaActual = "tienda";
                            System.out.println("<" + nombreEtiquetaAbrir + ">");
                            contadorTiendas++;
                            break;
                        case "nombre":
                            etiquetaActual = "nombre";
                            System.out.println("<" + nombreEtiquetaAbrir);
                            break;
                        case "localidad":
                            etiquetaActual = "localidad";
                            System.out.println("<" + nombreEtiquetaAbrir + ">");
                            break;
                        case "establecimientos":
                            etiquetaActual = "establecimientos";
                            System.out.println("<" + nombreEtiquetaAbrir + ">");
                            break;
                    }
                } else if (xmlReader.isCharacters()) {
                    caracter = xmlReader.asCharacters();
                    if (!caracter.getData().contains("\n")) {
                        String texto = caracter.getData();
                        switch (etiquetaActual) {
                            case "nombre":
                                System.out.println(texto);
                                break;
                            case "localidad":
                                System.out.println(texto);
                                break;
                            case "establecimientos":
                                System.out.println(texto);
                                break;
                        }
                    }
                } else if (xmlReader.isEndElement()) {
                    EndElement etiquetaCerrar = xmlReader.asEndElement();
                    String nombreEtiquetaCerrar = etiquetaCerrar.getName().getLocalPart();
                    System.out.println("</" + nombreEtiquetaCerrar + ">");
                } else if (xmlReader.isAttribute()) {

                }
            }
        } catch (FileNotFoundException | XMLStreamException ex) {
            System.out.println(ex.getStackTrace());
        }
    }
}
