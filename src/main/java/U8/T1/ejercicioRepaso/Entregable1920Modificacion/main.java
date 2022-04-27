package U8.T1.ejercicioRepaso.Entregable1920Modificacion;

import U8.T1.ejercicioRepaso.Entregable1920Modificacion.parte2.formula1;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        formula1 mercedes = new formula1("Mercedes-AMG-Petronas", "GranBretaña", "Petronas", 2);
        formula1 ferrari = new formula1("Ferrari", "Italia", "Santander Banco", 2);
        formula1 alpine = new formula1("Alpine F1 BTW", "Francia", "BTW", 2);
        formula1 redbull = new formula1("RedBull", "GranBretaña", "RedBull", 2);
        formula1 alphaTauri = new formula1("AlphaTauri F1", "Italia", "AlphaTauri Moda", 2);
        formula1 AstonMartin = new formula1("AsontMartin F1", "GranBretaña", "Aramco", 2);
        formula1 Williams = new formula1("Williams F1 Team", "GranBretaña", "Lavazza", 2);
        formula1 Haas = new formula1("HaasF1 Team", "GranBretaña", "1&1", 2);

        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("src/main/java/U8/T1/ejercicioRepaso/Entregable1920Modificacion/parte2/cero.xml"));

            TransformerFactory tfg = TransformerFactory.newInstance();
            Transformer transformer = tfg.newTransformer();

            Node root = doc.getDocumentElement();
            DOMSource origenDOM = new DOMSource(root);
            File f1XML = new File("src/main/java/U8/T1/ejercicioRepaso/Entregable1920Modificacion/parte2/cero.xml");
            StreamResult destino = new StreamResult(f1XML);

            for (int i = 0; i < formula1.getArrayF1().size(); i++) {
                Node f1 = doc.createElement("Escuderia");
                root.appendChild(f1);
                Node nombreEscuderia = doc.createElement("NombreEscuderia");
                nombreEscuderia.setTextContent(formula1.getArrayF1().get(i).getNombreEscuderia());
                f1.appendChild(nombreEscuderia);
                Node paisSede = doc.createElement("PaisSede");
                paisSede.setTextContent(formula1.getArrayF1().get(i).getPaisSede());
                f1.appendChild(paisSede);
                Node patrocinador = doc.createElement("PatrocinadorPrincipal");
                patrocinador.setTextContent(formula1.getArrayF1().get(i).getPatrocinadorPrincipal());
                f1.appendChild(patrocinador);
                Node numeroPilotos = doc.createElement("NumeroPilotos");
                numeroPilotos.setTextContent(String.valueOf(formula1.getArrayF1().get(i).getNumeroPilotos()));
                f1.appendChild(numeroPilotos);
            }
            transformer.transform(origenDOM, destino);
        }catch (ParserConfigurationException | IOException | SAXException | TransformerConfigurationException ex){
            System.out.println(ex.getStackTrace());
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
    }
}
