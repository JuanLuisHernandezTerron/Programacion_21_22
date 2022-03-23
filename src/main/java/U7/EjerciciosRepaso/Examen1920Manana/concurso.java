package U7.EjerciciosRepaso.Examen1920Manana;

import java.util.*;

public class concurso {
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
    }

    public void disqualifyDog(perro perroAUX){
        if (mapaConcurso.containsValue(perroAUX)){
            Set <Map.Entry<perro.raza,ArrayList<perro>>> guardarValores = mapaConcurso.entrySet();
            System.out.println(guardarValores);
            Iterator<Map.Entry<perro.raza,ArrayList<perro>>> it0 = guardarValores.iterator();
            while (it0.hasNext()){
                Map.Entry<perro.raza, ArrayList<perro>> entrada = it0.next();
                if (entrada.equals(perroAUX)){
                    it0.remove();
                }
            }
        }else{
            System.out.println("El perro no esta registrado en el concurso");
        }
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
