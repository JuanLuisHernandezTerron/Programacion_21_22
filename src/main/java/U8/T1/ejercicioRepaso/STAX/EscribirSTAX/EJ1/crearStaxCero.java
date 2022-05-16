package U8.T1.ejercicioRepaso.STAX.EscribirSTAX.EJ1;

import U8.T1.ejercicioRepaso.DOM.Entregable1920Modificacion.parte2.formula1;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class crearStaxCero {
    public static void main(String[] args) {
        formula1 mercedes = new formula1("Mercedes-AMG-Petronas", "GranBretaña", "Petronas", 2);
        formula1 ferrari = new formula1("Ferrari", "Italia", "Santander Banco", 2);
        formula1 alpine = new formula1("Alpine F1 BTW", "Francia", "BTW", 2);
        formula1 redbull = new formula1("RedBull", "GranBretaña", "RedBull", 2);
        formula1 alphaTauri = new formula1("AlphaTauri F1", "Italia", "AlphaTauri Moda", 2);
        formula1 AstonMartin = new formula1("AsontMartin F1", "GranBretaña", "Aramco", 2);
        formula1 Williams = new formula1("Williams F1 Team", "GranBretaña", "Lavazza", 2);
        formula1 Haas = new formula1("HaasF1 Team", "GranBretaña", "1&1", 2);

        try {
            XMLOutputFactory xmlSalida = XMLOutputFactory.newInstance();
            XMLEventWriter xmlWriter = xmlSalida.createXMLEventWriter(new FileOutputStream("src/main/java/U8/T1/ejercicioRepaso/STAX/Ej1/EscribirSTAX/EJ1/XMLcero.xml"));

            //Creo el inicio del documento y lo añado al xml
            XMLEventFactory eventFactory = XMLEventFactory.newInstance();
            StartDocument inicioDocument = eventFactory.createStartDocument();
            xmlWriter.add(inicioDocument);

            //Creamos el evento necesario para la etiqueta raiz
            StartElement inicioElemento = eventFactory.createStartElement("", "", "escuderias");
            xmlWriter.add(inicioElemento);

            //Recorremos el array para crear los nodos
            for (int i = 0; i < formula1.getArrayF1().size(); i++) {
                //Creamos las etiquetas de inicio
                StartElement escuderiaIni = eventFactory.createStartElement("", "", "escuderia");
                StartElement nombreEscuderiaIni = eventFactory.createStartElement("", "", "nombreEscuderia");
                StartElement paisSedeIni = eventFactory.createStartElement("", "", "paisSede");
                StartElement patrocinadorPrincipalIni = eventFactory.createStartElement("", "", "patrocinadorPrincipal");
                StartElement pilotosIni = eventFactory.createStartElement("", "", "pilotos");
                //Creamos las etiquetas de fin
                EndElement escuderiaFin = eventFactory.createEndElement("", "", "escuderia");
                EndElement nombreEscuderiaFin = eventFactory.createEndElement("", "", "nombreEscuderia");
                EndElement paisSedeFin = eventFactory.createEndElement("", "", "paisSede");
                EndElement patrocinadorPrincipalFin = eventFactory.createEndElement("", "", "patrocinadorPrincipal");
                EndElement pilotosFin = eventFactory.createEndElement("", "", "pilotos");
                //Creamos los nodos de texto donde estará la información
                Characters nombre = eventFactory.createCharacters(formula1.getArrayF1().get(i).getNombreEscuderia());
                Characters sede = eventFactory.createCharacters(formula1.getArrayF1().get(i).getPaisSede());
                Characters patrocinador = eventFactory.createCharacters(formula1.getArrayF1().get(i).getPatrocinadorPrincipal());
                Characters pilotos = eventFactory.createCharacters(String.valueOf(formula1.getArrayF1().get(i).getNumeroPilotos()));
                //vamos insertando al xml ordenadamente
                xmlWriter.add(escuderiaIni);
                xmlWriter.add(nombreEscuderiaIni);
                xmlWriter.add(nombre);
                xmlWriter.add(nombreEscuderiaFin);
                xmlWriter.add(paisSedeIni);
                xmlWriter.add(sede);
                xmlWriter.add(paisSedeFin);
                xmlWriter.add(patrocinadorPrincipalIni);
                xmlWriter.add(patrocinador);
                xmlWriter.add(patrocinadorPrincipalFin);
                xmlWriter.add(pilotosIni);
                xmlWriter.add(pilotos);
                xmlWriter.add(pilotosFin);
                xmlWriter.add(escuderiaFin);
            }
            //creamos la etiqueta de cierre de la escuderia
            EndElement escuderiasFin = eventFactory.createEndElement("","","escuderias");
            xmlWriter.add(escuderiasFin);
            //creamos la etiqueta de cierre del xml
            EndDocument documentoFin = eventFactory.createEndDocument();
            xmlWriter.add(documentoFin);
        } catch (XMLStreamException | FileNotFoundException ex) {
            System.out.println(ex.getStackTrace());
        }
    }
}
