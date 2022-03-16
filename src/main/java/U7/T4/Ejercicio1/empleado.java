package U7.T4.Ejercicio1;

import java.util.Arrays;

public class empleado extends persona{
    private int sueldo;
    private static empleado [] arrayEmple = new empleado[0];
    private int contadorEmple = 0;
    public empleado(String nombre, String dni, int edad, double estatura,int sueldo) {
        super(nombre, dni, edad, estatura);
        this.sueldo = sueldo;
    }

    public void introducirEmpleado(empleado empleadoAUX){
        arrayEmple = Arrays.copyOf(arrayEmple,arrayEmple.length+1);
        arrayEmple[contadorEmple++] = empleadoAUX;
    }
}
