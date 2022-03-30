package U7.EjerciciosRepaso.EjercicioPreEntre;

import java.io.*;
import java.util.*;

public class EstacionMeteorologica implements Serializable{
    private List<Medicion> listaMedicion = new LinkedList<>();
    private Coordenada coordenada;

    public EstacionMeteorologica(Coordenada coordenada, String nombreFicheroMediciones) {
        setCoordenada(coordenada);
        cargarFicherosLista(nombreFicheroMediciones);
    }
    public EstacionMeteorologica(Coordenada coordenada) {
        setCoordenada(coordenada);
    }

    public void mostrarLista(){
        System.out.println(listaMedicion);
    }

    public void addMedicion(Medicion medicionAUX){
        listaMedicion.add(medicionAUX);
    }

    public void ordenarTemperaturaASC(){
        Collections.sort(listaMedicion);
        System.out.println(listaMedicion);
    }

    public boolean buscaMedicion(Medicion medicionAUX){
        boolean es_encontrado = false;
        Iterator<Medicion> it0 = listaMedicion.listIterator();
        while (it0.hasNext()){
            Medicion medicionAUX1 = it0.next();
            if (medicionAUX1.equals(medicionAUX)){
                es_encontrado = true;
            }
        }
        return es_encontrado;
    }

    public void presionMaxima(){
        Medicion medicionAux;
        int presion = 0;
        Iterator<Medicion> it0 = listaMedicion.listIterator();
        while (it0.hasNext()){
            Medicion medicionAUX1 = it0.next();
            if (medicionAUX1.getPresion() > presion){
                presion = medicionAUX1.getPresion();
                medicionAux = medicionAUX1;
            }
        }
    }

    public void guardarFichero(String nombreFichero){
        try(ObjectOutputStream GuardarFichero = new ObjectOutputStream(new FileOutputStream(nombreFichero))){
        GuardarFichero.writeObject(listaMedicion);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public void ordenarHumedadDESC(){
        Set<Medicion> setMedi = new TreeSet<>(new Comparator<Medicion>() {
            @Override
            public int compare(Medicion medicion, Medicion t1) {
                if (medicion.getHumedad() < t1.getHumedad()){
                    return 1;
                }else if(medicion.getHumedad() > t1.getHumedad()){
                    return -1;
                }
                return 0;
            }
        });
        setMedi.addAll(listaMedicion);
        System.out.println(setMedi);
    }
    private void cargarFicherosLista(String nombreFicheroMediciones) {
        try(ObjectInputStream leerFichero = new ObjectInputStream(new FileInputStream(nombreFicheroMediciones))){
            listaMedicion = (List<Medicion>) leerFichero.readObject();
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }

    public Coordenada getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(Coordenada coordenada) {
        this.coordenada = coordenada;
    }

}
