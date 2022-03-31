package U7.EjerciciosRepaso.EjercicioPreEntre2;

import java.io.*;
import java.util.*;

public class productora {
    private String nombre_Productora;
    private Map<pelicula, Set<actor>> mapaProductoras = new LinkedHashMap<>();

    public productora(String nombre_Productora) {
        this.nombre_Productora = nombre_Productora;
    }

    public void mostrarMapa(){
        System.out.println(mapaProductoras);
    }

    public void addPelicula(pelicula peliculaAUX, actor ActorAUX){
        if (!mapaProductoras.containsKey(peliculaAUX)){
            Set<actor> listaActor = new HashSet<>();
            listaActor.add(ActorAUX);
            mapaProductoras.put(peliculaAUX,listaActor);
        }else{
            mapaProductoras.get(peliculaAUX).add(ActorAUX);
        }
    }

    public void guardarFicheros(){
        try(ObjectOutputStream EscribirFichero = new ObjectOutputStream(new FileOutputStream("src/main/java/U7/EjerciciosRepaso/EjercicioPreEntre2/fichero.dat"))){
            EscribirFichero.writeObject(mapaProductoras);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public void cargarFicheros(){
        try (ObjectInputStream leerFichero = new ObjectInputStream(new FileInputStream("src/main/java/U7/EjerciciosRepaso/EjercicioPreEntre2/fichero.dat"))){
            mapaProductoras = (Map<pelicula, Set<actor>>) leerFichero.readObject();
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }

    public void ordenarDuracion(){
        Set<pelicula> listaPelis = new TreeSet<>(new Comparator<pelicula>() {
            @Override
            public int compare(pelicula o1, pelicula o2) {
                if (o1.getDuracion() > o2.getDuracion()){
                    return 1;
                }else if(o1.getDuracion() < o2.getDuracion()){
                    return -1;
                }
                return 0;
            }
        });
        //        listaPelis.addAll(mapaProductoras.keySet()); TAMBIEN ESTÁ DE ESTA FORMA
        Iterator<pelicula> it0 = mapaProductoras.keySet().iterator();
        while (it0.hasNext()){
            pelicula peliculaAUX = it0.next();
            listaPelis.add(peliculaAUX);
        }
        System.out.println(listaPelis);
    }

    public void sacarMAXDuracion(){
        Iterator<pelicula> it0 = mapaProductoras.keySet().iterator();
        double duracionAUX = 0;
        pelicula peliculaAUX2 = null;
        while (it0.hasNext()){
            pelicula peliculaAUX = it0.next();
            if (peliculaAUX.getDuracion() > duracionAUX){
                duracionAUX = peliculaAUX.getDuracion();
                peliculaAUX2 = peliculaAUX;
            }
        }
        System.out.println("La duracion de la pelicula es de "+duracionAUX + " y su pelicula es"+peliculaAUX2);
    }

    public String getNombre_Productora() {
        return nombre_Productora;
    }

    public void setNombre_Productora(String nombre_Productora) {
        this.nombre_Productora = nombre_Productora;
    }
}
