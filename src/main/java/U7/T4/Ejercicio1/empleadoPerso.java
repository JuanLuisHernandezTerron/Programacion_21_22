package U7.T4.Ejercicio1;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class empleadoPerso extends persona implements Serializable {
    private int sueldo;
    private int contadorEmple = 0;
    private static Map<String, empleadoPerso> mapEmpleado= new HashMap<>();
    public empleadoPerso(String nombre, String dni, int edad, double estatura, int sueldo) {
        super(nombre, dni, edad, estatura);
        this.sueldo = sueldo;
        contadorEmple++;
    }

    public void introducirEmpleado(empleadoPerso empleadoAUX){
        mapEmpleado.put(empleadoAUX.getDni(),this);
    }

    public static void mostrarMapaEmpleado(){
        System.out.println(mapEmpleado);

    }

    public static void eliminarEmpleado(String dniAUX){
        mapEmpleado.remove(dniAUX);
        System.out.println(mapEmpleado);
    }

    public static void visualizarEmpleado(String dniAUX){
        System.out.println(mapEmpleado.get(dniAUX));
    }

    public static void realizarCambios(String dniAUX,empleadoPerso empleadoAUX){
        Iterator <String> it = mapEmpleado.keySet().iterator();
        while (it.hasNext()){
            String clave = it.next();
            if (clave.equalsIgnoreCase(dniAUX)){
                mapEmpleado.put(dniAUX,empleadoAUX);
            }
        }
    }
    public static void volcarBinario(){
        try{
            ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U7/T4/Ejercicio1/empleados.dat",true));
            fichero.writeObject(mapEmpleado);
            fichero.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
    public static void cargarMapa(){
        try{
            ObjectInputStream fichero = new ObjectInputStream(new FileInputStream("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U7/T4/Ejercicio1/empleados.dat"));
            mapEmpleado = (Map<String, empleadoPerso>) fichero.readObject();
            fichero.close();
        }catch (IOException | ClassNotFoundException ex){
         ex.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return  " {nombre:"+ super.getNombre() +
                ", edad:"+super.getEdad()+
                ", estatura:"+super.getEstatura()+
                ", sueldo:" + this.sueldo+"}";
    }

    public static Map<String, empleadoPerso> getMapEmpleado() {
        return mapEmpleado;
    }
}
