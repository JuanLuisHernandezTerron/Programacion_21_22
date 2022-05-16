package U8.T1.ejercicioRepaso.DOM.Entregable1920Modificacion;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificarDOM {

    public static void main(String[] args) throws TransformerException {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("src/main/java/U8/T1/ejercicioRepaso/Entregable1920Modificacion/personas.xml"));

            /*Obtener un objetoTransformer*/
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            /*Origen del DOM*/
            Node root = doc.getDocumentElement();
            DOMSource OrigenDOM = new DOMSource(root);

            /*Destino del DOM*/
            File tiendas = new File("src/main/java/U8/T1/ejercicioRepaso/Entregable1920Modificacion/personas.xml");
            StreamResult Destino = new StreamResult(tiendas);

            NodeList nl = doc.getElementsByTagName("tienda");
            /*Para insertar un comentario primero tendremos que coger las etiquetas de los nodos de la etiqueta raiz, es decir las etiquetas de tiendas sin sus nodos hijas*/
            for (int i = 0; i < nl.getLength(); i++) { //INSERTAR COSAS DEPUES
                Node e2 = nl.item(i); //estamos guardando la etiqueta de tienda en un nodo
                Node nodoComent = doc.createComment(" COMENTARIO AÑADIDO DESDE DOM "); // estamos creando un nodo que estará guardando el comentario
                root.insertBefore(nodoComent, e2); // estamos insertando los comentarios antes de las etiquetas de tienda.
            }

            Node etiqueta = doc.createElement("tienda"); // creamos la etiqueta element principal que va a tener nuestro nodo
            root.appendChild(etiqueta);  //Estamos insertando al final otro nodo tienda
            Node nombre = doc.createElement("nombre"); //Creamos un elemento nombre
            nombre.setTextContent("Lidl");  // damos valor a ese elemento
            etiqueta.appendChild(nombre); //Insertamos dentro del nodo etiqueta, el nodo nombre que hemos creado que sera un nodo hijo.
            Node localidad = doc.createElement("localidad");
            localidad.setTextContent("Bollullos");
            etiqueta.appendChild(localidad);
            Node establicimientos = doc.createElement("establecimientos");
            establicimientos.setTextContent("3");
            etiqueta.appendChild(establicimientos);

            Node etiquetaAUX = doc.createElement("tienda");
            root.appendChild(etiquetaAUX);
            Node nombreAUX = doc.createElement("nombre");
            nombreAUX.setTextContent("SupeMas");
            etiquetaAUX.appendChild(nombreAUX);
            Node localidadAUX = doc.createElement("localidad");
            localidadAUX.setTextContent("Palomares");
            etiquetaAUX.appendChild(localidadAUX);
            Node establecimientosAUX = doc.createElement("establecimientos");
            establecimientosAUX.setTextContent("5");
            etiquetaAUX.appendChild(establecimientosAUX);

            Node reemplazar = nl.item(0); //No utilizar el doc, ya que no tiene nada en su interior, para eso
            //utilizamos el nl.item(0), que estaremos cogiendo el primer nodo de tienda, que queremos reemplazar.

            root.replaceChild(etiquetaAUX, reemplazar); //para hacer los cambios tendremos que utilizar simpre el root del origen del DOM para hacer las modificaciones

            transformer.transform(OrigenDOM, Destino);//Escribimos el fichero
        } catch (ParserConfigurationException | IOException | SAXException ex) {
            System.out.println(ex.getStackTrace());
        }
    }
}

//      insertar un nodo al final del elemento
//            Node anadirNombre = doc.createElement("nombre");
//            anadirNombre.setTextContent("Oscar");
//            Node anadirEdad = doc.createElement("edad");
//            anadirEdad.setTextContent("24");
//            root.getLastChild().appendChild(anadirNombre);
//            root.getLastChild().appendChild(anadirEdad);
