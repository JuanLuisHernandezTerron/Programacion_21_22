package U7.EjerciciosRepaso.Examen2021Manana;

import java.io.*;
import java.util.*;

public class maraton implements Serializable {
    private static String nombreMaraton = "Castilleja de la cuesta";
    private Map<atleta.categorias,Set<atleta>> mapAtleta = new LinkedHashMap<>();

    public void inscribirAtleta(atleta.categorias categoriasAUX,atleta atletaAUX){
        if (! mapAtleta.containsKey(categoriasAUX)){
            Set<atleta> setAUX = new HashSet<>();
            setAUX.add(atletaAUX);
            mapAtleta.put(categoriasAUX,setAUX);
        }else{
            mapAtleta.get(categoriasAUX).add(atletaAUX);
        }
    }

    public void BorrarAtletas(int dorsalAtleta){
        Iterator<atleta.categorias> it0 = mapAtleta.keySet().iterator();
        while (it0.hasNext()){
            atleta.categorias categoriasAUX = it0.next();
            Set<atleta> setAtleta = mapAtleta.get(categoriasAUX);
            Iterator<atleta> it1 = setAtleta.iterator();
            while (it1.hasNext()){
                atleta atletaAUX = it1.next();
                if (atletaAUX.getDorsal() == dorsalAtleta){
                    it1.remove();
                }
            }
        }
    }

    public void guardarTiempo(int dorsalAtleta, double tiempo){
      Iterator<atleta.categorias> it0 = mapAtleta.keySet().iterator();
      while(it0.hasNext()){
        atleta.categorias categoriaAUX = it0.next();
        Set<atleta> listaAtleta = mapAtleta.get(categoriaAUX);
        Iterator<atleta> it1 = listaAtleta.iterator();
        while (it1.hasNext()){
            atleta atletaAUX = it1.next();
            if (atletaAUX.getDorsal() == dorsalAtleta){
                atletaAUX.setMarcaRealizada(tiempo);
                atletaAUX.setAcabadoPrueba(true);
            }
        }
      }
    }

    public void mostrarListaFinishers(){
        Set<atleta> atletas = new TreeSet<>(new Comparator<atleta>() {
            @Override
            public int compare(atleta o1, atleta o2) {
                if (o1.getMarcaRealizada() > o2.getMarcaRealizada()){
                    return 1;
                }else if(o1.getMarcaRealizada() < o2.getMarcaRealizada()){
                    return -1;
                }
                return 0;
            }
        });

        Iterator<atleta.categorias> it0 = mapAtleta.keySet().iterator();
        while (it0.hasNext()){
            atleta.categorias categoriasAUX = it0.next();
            Set<atleta> listaAtleta =mapAtleta.get(categoriasAUX);
            Iterator<atleta> it1 = listaAtleta.iterator();
            while (it1.hasNext()){
                atleta atletaAUX = it1.next();
                if (atletaAUX.isAcabadoPrueba()){
                    System.out.println(atletaAUX);
                }
            }
        }
    }

    public void mostrarListaCategorias(atleta.categorias categoriasAUX){
        Set<atleta> listaAtletaCategoria =  mapAtleta.get(categoriasAUX);
        TreeSet<atleta> listaAtleta = new TreeSet<>(listaAtletaCategoria); //Lo ordena por defecto
        Iterator<atleta> it0 = listaAtleta.iterator();
        while (it0.hasNext()){
            System.out.println(it0.next());
        }
    }

    public int participacionPorPais(String pais){
        int contadorPais =0;
        Iterator<atleta.categorias> it0 = mapAtleta.keySet().iterator();
        while (it0.hasNext()){
            atleta.categorias categoriasAUX = it0.next();
            Set<atleta> listaAtleta = mapAtleta.get(categoriasAUX);
            Iterator<atleta> it1 = listaAtleta.iterator();
            while (it1.hasNext()){
                atleta atletaAUX = it1.next();
                if (atletaAUX.getPais().equalsIgnoreCase(pais)){
                    contadorPais++;
                }
            }
        }
        return contadorPais;
    }

    public void guardarArchivos(){
        try(ObjectOutputStream guardarFichero = new ObjectOutputStream(new FileOutputStream("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U7\\EjerciciosRepaso\\Examen2021Manana\\participantes.dat"))){
            guardarFichero.writeObject(mapAtleta);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public void cargarArchivos(){
        try(ObjectInputStream leerFichero = new ObjectInputStream(new FileInputStream("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U7\\EjerciciosRepaso\\Examen2021Manana\\participantes.dat"))){
            mapAtleta.clear();
            mapAtleta = (Map<atleta.categorias, Set<atleta>>) leerFichero.readObject();
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
