package U8.T1.ejercicioRepaso.STAX.ImprimirSTAX.EJ2;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class mostrarSTAX {
    public static void main(String[] args) {
        int contador=0;
        long calorias =0;
        Characters caracter = null;
        String etiqueta = "";
        try{
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U8\\T1\\ejercicioRepaso\\STAX\\ImprimirSTAX\\EJ2\\menuComida.xml"));
            while (xmlEventReader.hasNext()){
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                System.out.println(xmlEvent); //Mostrar el arbol completo
                if (xmlEvent.isStartElement()){
                    StartElement etiquetaAbrir = xmlEvent.asStartElement();
                    etiqueta = String.valueOf(etiquetaAbrir.getName().getLocalPart());
                    if (etiqueta.equalsIgnoreCase("food")){
                        contador++;
                    }
                }else if(xmlEvent.isCharacters()){
                    if (etiqueta.equalsIgnoreCase("calories")){
                        caracter = xmlEvent.asCharacters();
                        String texto = caracter.getData();
                        calorias += Integer.parseInt(texto);
                        etiqueta="";
                    }
                }
            }
        }catch (FileNotFoundException | XMLStreamException ex){
            System.out.println(ex.getStackTrace());
        }

        System.out.println("Hay "+contador+" comidas");
        System.out.println("Hay un total de "+calorias+" en los platos");
    }
}
