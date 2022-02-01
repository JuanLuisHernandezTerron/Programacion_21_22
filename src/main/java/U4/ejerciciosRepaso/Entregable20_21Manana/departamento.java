package U4.ejerciciosRepaso.Entregable20_21Manana;

import java.util.Arrays;

public class departamento {
    private String nombreDepart;
    private String sede;
    private String numeroTelf;

    private int contadorDepartamentos = 0;
    private empleado [] arrayEmpleados = new empleado[0];
    private int contadorEmpleados = 0;

    public departamento (String nombreDepart, String sede, String numeroTelf){
        this.nombreDepart = nombreDepart;
        this.sede = sede;
        this.numeroTelf = numeroTelf;
        contadorDepartamentos ++;
    }

    public departamento (String nombreDepart, String numeroTelf){
        this.nombreDepart = nombreDepart;
        this.sede = "Castilleja";
        this.numeroTelf = numeroTelf;
        contadorDepartamentos ++;
    }
    public void introducirEmpleado(empleado emple){
        this.arrayEmpleados = Arrays.copyOf(arrayEmpleados,arrayEmpleados.length+1);
        this.arrayEmpleados[contadorEmpleados++] = emple;
    }

    public void eliminarEmpleado(empleado empleEliminar){
        for (int i = 0; i < arrayEmpleados.length; i++) {
            if (arrayEmpleados[i] == empleEliminar){
                arrayEmpleados[i] = arrayEmpleados[i+1];
                arrayEmpleados = Arrays.copyOf(arrayEmpleados,arrayEmpleados.length-1);
            }
        }
    }

    public void getInfoTrabajadores(){
        System.out.println("Los trabajadores del departamento " +getNombreDepart() +" son:");
        for (int i = 0; i < arrayEmpleados.length; i++) {
            arrayEmpleados[i].getNombreCompleto();
        }
    }

    public String getNombreDepart() {
        return nombreDepart;
    }

    public void getContadorDepartamentos() {
        System.out.println(contadorDepartamentos+" departamentos han utilizado nuestra aplicacion");
    }

    public void setNombreDepart(String nombreDepart) {
        this.nombreDepart = nombreDepart;
    }

    public empleado[] getArrayEmpleados() {
        return arrayEmpleados;
    }

    public void setArrayEmpleados(empleado[] arrayEmpleados) {
        this.arrayEmpleados = arrayEmpleados;
    }
}
