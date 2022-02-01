package U4.ejerciciosRepaso.Entregable20_21Manana;

import java.time.LocalDate;

public class empleado {
    private String nombreCompleto;

    private String numeroSS;
    private String numerotelef;
    private LocalDate fecha = LocalDate.now();
    private tipoEmpleado tipoEmple;
    private int contadorTrabajadores = 0;

    public empleado (String nombreCompleto, String numeroSS, String numerotelef,tipoEmpleado tipoEmple){
        this.nombreCompleto = nombreCompleto;
        this.numeroSS = numeroSS;
        this.numerotelef = numerotelef;
        this.tipoEmple = tipoEmple;
        contadorTrabajadores ++;
    }

    public empleado (String nombreCompleto, String numeroSS, String numerotelef){
        this.nombreCompleto = nombreCompleto;
        this.numeroSS = numeroSS;
        this.numerotelef = numerotelef;
        this.tipoEmple = tipoEmpleado.TECNICO;
        contadorTrabajadores ++;
    }

    public void mostrarDatosEmpleado(){
        System.out.println("El nombre del empleado es: " + this.nombreCompleto);
        System.out.println("El numero de la Seguridad Social del empleado es: " + this.numeroSS);
        System.out.println("El numero de telefono del empleado es: " + this.numerotelef);
        System.out.println("Fue contratado el: " + this.fecha);
        System.out.println("Su cargo en la empresa es: " + this.tipoEmple);
    }

    public enum tipoEmpleado{
        ADMINISTRATIVO,
        TECNICO,
        DIRECTIVO;

    }
    public void getNombreCompleto() {
        System.out.println("Su nombre es "+this.nombreCompleto);
        System.out.println("Su rol de trabajo es "+this.tipoEmple);
        System.out.println("Su numero social es: "+this.numeroSS);
        System.out.println("Su fecha de introduccion en la empresa es: "+this.fecha);
    }

    public void getContadorTrabajadores() {
        System.out.println(contadorTrabajadores+" trabajadores han utilizado nuestra aplicacion");
    }
}
