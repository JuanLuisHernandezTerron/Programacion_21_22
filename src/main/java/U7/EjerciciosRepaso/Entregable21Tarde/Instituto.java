package U7.EjerciciosRepaso.Entregable21Tarde;

import java.io.*;
import java.util.*;
// nombreMapa.get({Metemos la clave y nos devolvera la lista q es el valor}).add({introducimos el valor que queremos guardar})
public class Instituto {
    private String nombre;
    private Map <Unidad,ArrayList<alumno>> MapaAlumnos = new LinkedHashMap<>();

    public Instituto(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarAlumnosUnidad (Unidad unidadAUX){
        Iterator<Unidad> it = MapaAlumnos.keySet().iterator();
        while (it.hasNext()){
            Unidad unidadAUX2 = it.next();
            if (unidadAUX2.equals(unidadAUX)){
                System.out.println(unidadAUX);
            }
        }
    }

    public void obtenerUnidadAlumno(int idAUX){
        Iterator<Unidad> it = MapaAlumnos.keySet().iterator();
        while (it.hasNext()){
            Unidad unidadAux = it.next();
            ArrayList<alumno> valores2 = MapaAlumnos.get(unidadAux);
            Iterator<alumno> it2 = valores2.iterator();
            while (it2.hasNext()){
                alumno alumnoAUX = it2.next();
                if (alumnoAUX.getId() == idAUX){
                    System.out.println(unidadAux);
                }
            }
        }
    }

    public void addAlumnoUnidad(alumno alumnoAUX , Unidad UnidadAUX){
        if (MapaAlumnos.containsKey(UnidadAUX)){
            ArrayList<alumno> arrayalum = MapaAlumnos.get(UnidadAUX); //Hace la copia del array Alumnos original para luego añadirle el que queremos introducir
                                                                        // y se lo introducimos al mapa
            arrayalum.add(alumnoAUX);
            MapaAlumnos.put(UnidadAUX,arrayalum);
        }else{
            ArrayList<alumno> arrayAUX = new ArrayList<>();
            arrayAUX.add(alumnoAUX);
            MapaAlumnos.put(UnidadAUX,arrayAUX);
        }
    }

    public void mostrarTodosLosAlumnosOrdenados(){
        List <alumno> listaAlumnosAUX= new ArrayList<>();
        Iterator<Unidad> it = MapaAlumnos.keySet().iterator();
        while (it.hasNext()){
            Unidad unidadAux = it.next();
            ArrayList<alumno> valores2 = MapaAlumnos.get(unidadAux);
            Iterator<alumno> it2 = valores2.iterator();
            while (it2.hasNext()){
                alumno alumnoAUX = it2.next();
                listaAlumnosAUX.add(alumnoAUX);
            }
        }
        Collections.sort(listaAlumnosAUX,new ordenarApellidos());
        System.out.println(listaAlumnosAUX);
    }

    public void cargarAlumnos(){
        try{
            ObjectInputStream ficheroLeer = new ObjectInputStream(new FileInputStream("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U7\\EjerciciosRepaso\\Entregable21Tarde\\C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U7\\EjerciciosRepaso\\alumnos.dat"));
            Iterator<Unidad> it0 = MapaAlumnos.keySet().iterator();
            while(it0.hasNext()){
                Unidad unidadAUX= it0.next();
                ArrayList<alumno> alumnoArray = MapaAlumnos.get(unidadAUX);
                Iterator<alumno> it1 = alumnoArray.iterator();
                ArrayList<alumno> arrayListAUX = new ArrayList<>();
                while (it1.hasNext()){
                    alumno alumnoAUX = it1.next();
                    if (alumnoAUX.getUnidadAlum().equals(unidadAUX)){
                        arrayListAUX.add(alumnoAUX);
                    }
                }
                MapaAlumnos.put(unidadAUX,arrayListAUX);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public void guardarAlumnos(){
        try{
            ObjectOutputStream ficheroEscribir = new ObjectOutputStream(new FileOutputStream("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U7\\EjerciciosRepaso\\Entregable21Tarde\\C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U7\\EjerciciosRepaso\\alumnos.dat",true));
            Iterator<Unidad> it0 = MapaAlumnos.keySet().iterator();
            while(it0.hasNext()){
                Unidad unidadAUX = it0.next();
                ArrayList<alumno> alumnoArray = MapaAlumnos.get(unidadAUX);
                Iterator<alumno> it1 = alumnoArray.iterator();
                while (it1.hasNext()){
                    alumno alumnoAUX = it1.next();
                    ficheroEscribir.writeObject(alumnoAUX);
                }
            }
            ficheroEscribir.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Instituto{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
