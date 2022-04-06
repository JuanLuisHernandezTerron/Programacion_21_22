package U7.U6U7_Examen;

import java.io.*;
import java.util.*;

public class Filmaffinity {
    private Set<pelicula> listaPelicula = new HashSet<>();
    private Set<actor> listaActores = new HashSet<>();
    private Map<pelicula,Set<actor>> mapaPelis = new HashMap<>();
    private Map<actor,Set<pelicula>> mapaActor = new HashMap<>();

    public void addPeliculaActor(pelicula peliculaAUX, actor actorAUX){
        listaActores.add(actorAUX);
        listaPelicula.add(peliculaAUX);
        if (!mapaPelis.containsKey(peliculaAUX)){
            Set<actor> listaActor = new HashSet<>();
            listaActor.add(actorAUX);
            mapaPelis.put(peliculaAUX,listaActor);
        }else{
            mapaPelis.get(peliculaAUX).add(actorAUX);
        }

        if (!mapaActor.containsKey(actorAUX)){
            Set<pelicula> listapeliculas = new HashSet<>();
            listapeliculas.add(peliculaAUX);
            mapaActor.put(actorAUX,listapeliculas);
        }else{
            mapaActor.get(actorAUX).add(peliculaAUX);
        }
    }

    public List<actor> getActores(pelicula p){
        List<actor> listaActoresPeliculas = new ArrayList<>();
        Iterator<pelicula> it0 = mapaPelis.keySet().iterator();
        while (it0.hasNext()){
            pelicula peliAUX = it0.next();
            Set<actor> actoresLista = mapaPelis.get(peliAUX);
            Iterator<actor> it1 = actoresLista.iterator();
            while (it1.hasNext()){
                actor actorAUX = it1.next();
                if (peliAUX.equals(p)){
                    listaActoresPeliculas.add(actorAUX);
                }
            }
        }
        Collections.sort(listaActoresPeliculas,new ordenarApellidosActor());
        return listaActoresPeliculas;
    }

    public List<pelicula> getPeliculas(actor a){
        List<pelicula> listaPelis = new ArrayList<>();
        Iterator<actor> it0 = mapaActor.keySet().iterator();
        while (it0.hasNext()){
            actor actorAUX = it0.next();
            Set<pelicula> listaPeliculas = mapaActor.get(actorAUX);
            Iterator<pelicula> it1 = listaPeliculas.iterator();
            while(it1.hasNext()){
                pelicula peliculaAUX = it1.next();
                if (actorAUX.equals(a)){
                    listaPelis.add(peliculaAUX);
                }
            }
        }
        Collections.sort(listaPelis,new OrdenarTitulo());
        return listaPelis;
    }

    public pelicula getPelicula(String titulo){
        Iterator<pelicula> it0 = listaPelicula.iterator();
        pelicula peliAUX2 = null;
        while (it0.hasNext()){
            pelicula peliAUX = it0.next();
            if (peliAUX.getTitulo().equalsIgnoreCase(titulo)){
                peliAUX2 = peliAUX;
            }
        }
        return peliAUX2;
    }

    public void removerPelicula(String titulo){
        Iterator<pelicula> it0 = mapaPelis.keySet().iterator();
        Iterator<actor>it0AUX = mapaActor.keySet().iterator();
        Iterator<pelicula> it0Lista = listaPelicula.iterator();
        while (it0.hasNext()){
            pelicula peliAUX = it0.next();
            if (peliAUX.getTitulo().equals(titulo)){
                it0.remove();
            }
        }

        while (it0AUX.hasNext()){
            actor actorAUX = it0AUX.next();
            Set<pelicula> listaPeli = mapaActor.get(actorAUX);
            Iterator<pelicula> it1 = listaPeli.iterator();
            while (it1.hasNext()){
                pelicula peliAUX = it1.next();
                if (peliAUX.getTitulo().equalsIgnoreCase(titulo)){
                    it1.remove();
                }
            }
        }

        while (it0Lista.hasNext()){
            pelicula peliAUX = it0Lista.next();
            if (peliAUX.getTitulo().equalsIgnoreCase(titulo)){
                it0Lista.remove();
            }
        }
    }

    public actor getActor(String nombre, String apellidos){
        actor ActorAUX = null;
        Iterator<actor> it0 = listaActores.iterator();
        while (it0.hasNext()){
            actor actorAUX2 = it0.next();
            if (actorAUX2.getNombre().equalsIgnoreCase(nombre) || actorAUX2.getApellidos().equalsIgnoreCase(apellidos)){
                ActorAUX = actorAUX2;
            }
        }
        return ActorAUX;
    }

    public void guardatDatos(){
        try(ObjectOutputStream EscribirFichero = new ObjectOutputStream(new FileOutputStream("src/main/java/U7/U6U7_Examen/filmaffinity.dat"))){
            EscribirFichero.writeObject(listaPelicula);
            EscribirFichero.writeObject(listaActores);
            EscribirFichero.writeObject(mapaPelis);
            EscribirFichero.writeObject(mapaActor);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public void cargarDatos(){
        try(ObjectInputStream LeerFichero = new ObjectInputStream(new FileInputStream("src/main/java/U7/U6U7_Examen/filmaffinity.dat"))){
            listaActores.clear();
            listaPelicula.clear();
            mapaPelis.clear();
            mapaActor.clear();
            listaPelicula = (Set<pelicula>) LeerFichero.readObject();
            listaActores = (Set<actor>) LeerFichero.readObject();
            mapaActor = (Map<actor, Set<pelicula>>) LeerFichero.readObject();
            mapaPelis = (Map<pelicula, Set<actor>>) LeerFichero.readObject();
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
