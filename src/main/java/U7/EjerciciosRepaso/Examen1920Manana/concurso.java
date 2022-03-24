package U7.EjerciciosRepaso.Examen1920Manana;

import java.io.*;
import java.util.*;

public class concurso implements Serializable {
    private String nombreConcurso;
    private String localidad;
    private List<perro> listaPerrosConcurso;
    private Map<perro.raza,ArrayList<perro>> mapaConcurso = new HashMap<>();

    public concurso(String nombreConcurso, String localidad) {
        setNombreConcurso(nombreConcurso);
        setLocalidad(localidad);
        this.listaPerrosConcurso = new ArrayList<>();
    }

    public void addDog(perro perroAUX, perro.raza razaPerro){
        listaPerrosConcurso.add(perroAUX);
        if (!mapaConcurso.containsKey(razaPerro)){
            ArrayList <perro> listaPerroAUX = new ArrayList<>();
            listaPerroAUX.add(perroAUX);
            mapaConcurso.put(razaPerro,listaPerroAUX);
        }else{
            mapaConcurso.get(razaPerro).add(perroAUX);
        }
        System.out.println(mapaConcurso);
    }

    public void disqualifyDog(perro perroAUX){
        boolean es_encontrado = false;
        Iterator<perro.raza> it0 = mapaConcurso.keySet().iterator();
        while (it0.hasNext()){
            perro.raza razaAUX = it0.next();
            ArrayList<perro> ListaPerro = mapaConcurso.get(razaAUX);
            Iterator<perro> it1 = ListaPerro.iterator();
            while (it1.hasNext()){
                perro perroAUXLista = it1.next();
                if (perroAUXLista.equals(perroAUX)){
                    it1.remove();
                    es_encontrado = true;
                }
            }
        }
        if (!es_encontrado){
            System.out.println("Perro no encontrado en el sistema");
        }
        System.out.println(mapaConcurso);
    }

    public void ownerDogs(int numeroSocio){
        Iterator<perro.raza> it0 = mapaConcurso.keySet().iterator();
        while (it0.hasNext()){
            perro.raza razaAUX = it0.next();
            List<perro> listaPerros = mapaConcurso.get(razaAUX);
            Iterator<perro> it1 = listaPerros.iterator();
            while (it1.hasNext()){
                perro perroAUX = it1.next();
                if (perroAUX.getPropietario().getNumeroSocio() == numeroSocio){
                    System.out.println(perroAUX);
                }
            }
        }
    }

    public void guardarFichero(){
        ArrayList<perro> listaTodosPerros = new ArrayList<>();
        Iterator<perro.raza> it0= mapaConcurso.keySet().iterator();
        while (it0.hasNext()){
            perro.raza razaAUX = it0.next();
            ArrayList<perro> listaPerros= mapaConcurso.get(razaAUX);
            listaTodosPerros.addAll(listaPerros); //Mete todos los valores de cada clave
        }

        try(ObjectOutputStream escribirFichero = new ObjectOutputStream(new FileOutputStream("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U7\\EjerciciosRepaso\\Examen1920Manana\\perros.dat",true))){
            escribirFichero.writeObject(listaTodosPerros);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public void cargarFicheros(){
        try(ObjectInputStream leerFichero = new ObjectInputStream((new FileInputStream("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U7\\EjerciciosRepaso\\Examen1920Manana\\perros.dat")))){
            List<perro> completa= (List<perro>) leerFichero.readObject();
            mapaConcurso.clear();
            System.out.println("Mapa borrado");
            Iterator<perro> it0 = completa.iterator();
            while (it0.hasNext()){
                perro perroAUX = it0.next();
                addDog(perroAUX,perroAUX.getRazaPerro());
            }
            System.out.println(mapaConcurso);
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }

    public void perrosPorPeso(perro.raza perroAUX){
        List <perro> listaPerros = new ArrayList<>();
        if (mapaConcurso.containsKey(perroAUX)){
            listaPerros = mapaConcurso.get(perroAUX);
        }
        Collections.sort(listaPerros,new ordenarPesoPerro());
        System.out.println(listaPerros);
    }

    public void perrosPorEdad(perro.raza perroAUX){
        List <perro> listaPerros = new ArrayList<>();
        if (mapaConcurso.containsKey(perroAUX)){
            listaPerros = mapaConcurso.get(perroAUX);
        }
        Collections.sort(listaPerros, new ordenarPorEdad());
        System.out.println(listaPerros);
    }

    public String getNombreConcurso() {
        return nombreConcurso;
    }

    public void setNombreConcurso(String nombreConcurso) {
        this.nombreConcurso = nombreConcurso;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public List<perro> getListaPerrosConcurso() {
        return listaPerrosConcurso;
    }

    public void setListaPerrosConcurso(List<perro> listaPerrosConcurso) {
        this.listaPerrosConcurso = listaPerrosConcurso;
    }
}
