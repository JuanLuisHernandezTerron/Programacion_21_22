package U7.EjerciciosRepaso.Examen1220Tarde;

import java.io.*;
import java.util.*;

public class coronavirus implements Serializable {
    private static final String nombreCientifico = "COVID-19";
    private static final String localidadVirus = "WUHAN";
    private static int contador = 0;
    private int codigoCepa=0;
    private static List<paciente> ListaPaciente= new ArrayList<>();
    private static Map<Integer,List<paciente>> mapaCovid = new HashMap<>();

    public coronavirus() {
        this.codigoCepa = contador++;
    }

    public void mostrarMapa(){
        Iterator<Integer> it0 = mapaCovid.keySet().iterator();
        while (it0.hasNext()){
            Integer numeroCepa = it0.next();
            System.out.println(mapaCovid.get(numeroCepa));
        }
    }

    public void addPaciente(int codigoCepa,paciente pacienteAUX){
        if (!mapaCovid.containsKey(codigoCepa)){
            if (this.codigoCepa == pacienteAUX.getCodigoCepa()) {
                ArrayList<paciente> listaAUX = new ArrayList<>();
                listaAUX.add(pacienteAUX);
                mapaCovid.put(codigoCepa, listaAUX);
                ListaPaciente.add(pacienteAUX);
            }else{
                System.out.println("Estas introduciendo un paciente que no es correcto su cepa");
            }
        }else{
            if (this.codigoCepa == pacienteAUX.getCodigoCepa()) {
                mapaCovid.get(codigoCepa).add(pacienteAUX);
                ListaPaciente.add(pacienteAUX);
            }else{
                System.out.println("Estas introduciendo un paciente que no es correcto su cepa");
            }
        }
    }

    public void darDeAltaPaciente(paciente pacienteAUX){
        Iterator<Integer> it0 = mapaCovid.keySet().iterator();
        boolean es_encontrado = false;
        while (it0.hasNext()){
            Integer codigoAUX = it0.next();
            List<paciente> listaPaciente = mapaCovid.get(codigoAUX);
            Iterator<paciente> it1 = listaPaciente.iterator();
            while (it1.hasNext()){
                paciente pacienteListaAUX = it1.next();
                if (pacienteListaAUX.equals(pacienteAUX)){
                    it1.remove();
                    es_encontrado = true;
                }
            }
        }

        if (!es_encontrado){
            System.out.println("El paciente no ha sido encontrado");
        }
    }

    public void pacientePorPeso(Integer codigoCepa){
        List<paciente> listaPaciente = mapaCovid.get(codigoCepa);
        Collections.sort(listaPaciente,new ordenarPorPeso());
        mostrarMapa();
    }

    public void pacientePorEdad(Integer codigoCepa){
        List<paciente> listaPaciente = mapaCovid.get(codigoCepa);
        Collections.sort(listaPaciente,new ordenarPorEdad());
        mostrarMapa();
    }

    public void pacientesDeUnDoctor(int numeroColegiado){
        Iterator<Integer> it0 = mapaCovid.keySet().iterator();
        boolean esta_Paciente = false;
        while (it0.hasNext()){
            int CodigoCepaAUX = it0.next();
            List<paciente> listaPaciente = mapaCovid.get(CodigoCepaAUX);
            Iterator<paciente> it1 = listaPaciente.iterator();
            while (it1.hasNext()){
                paciente pacienteAUX = it1.next();
                if (pacienteAUX.getMedico().getNumeroColegiado() == numeroColegiado){
                    System.out.println(pacienteAUX);
                    esta_Paciente = true;
                }
            }
        }
        if (!esta_Paciente){
            System.out.println("Este medico no lleva ningun paciente");
        }
    }

    public void guardarDatos(){
        try(ObjectOutputStream guardarFicheros = new ObjectOutputStream(new FileOutputStream("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U7\\EjerciciosRepaso\\Examen1220Tarde\\pacientes.dat",true))){
            Iterator<Integer> it0 = mapaCovid.keySet().iterator();
            while (it0.hasNext()){
                Integer cepaAUX = it0.next();
                ListaPaciente.addAll(mapaCovid.get(cepaAUX));
            }
            guardarFicheros.writeObject(ListaPaciente);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public void cargarDatos(){
        try(ObjectInputStream LeerFichero = new ObjectInputStream(new FileInputStream("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U7\\EjerciciosRepaso\\Examen1220Tarde\\pacientes.dat"))){
            mapaCovid.clear();
            List<paciente> listaPaciente = (List<paciente>) LeerFichero.readObject();
            System.out.println("Se procede a borrar el mapa");
            Iterator<paciente> it0 = listaPaciente.iterator();
            while (it0.hasNext()){
                paciente pacienteAUX = it0.next();
                addPaciente(pacienteAUX.getCodigoCepa(),pacienteAUX);
            }
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }

    public int getCodigoCepa() {
        return codigoCepa;
    }

    public void setCodigoCepa(int codigoCepa) {
        this.codigoCepa = codigoCepa;
    }

    public List<paciente> getListaPaciente() {
        return ListaPaciente;
    }

    public void setListaMario(List<paciente> listaMario) {
        ListaPaciente = listaMario;
    }
}
