package U7.T4.Ejercicio1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main implements Serializable {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int decision = 0;
        System.out.println("Que deseas hacer, cargar archivos o introducirlos manualmente (responda con 1 para cargar o 2 para manualmente):");
        int respuesta = teclado.nextInt();

        switch (respuesta){
            case 1:
                Map <String , empleadoPerso> mapAUX = new HashMap<>();
                empleadoPerso empleado1 = new empleadoPerso("Pedro","12345678S",18,1.56,8500);
                empleadoPerso empleado2 = new empleadoPerso("Jose","45236874T",25,1.42,8500);
                empleadoPerso empleado3 = new empleadoPerso("Oscar","21364987F",32,1.98,8500);
                empleadoPerso empleado4 = new empleadoPerso("Juanlu","23659877G",22,1.72,8500);
                mapAUX.put(empleado1.getDni(),empleado1);
                mapAUX.put(empleado2.getDni(),empleado2);
                mapAUX.put(empleado3.getDni(),empleado3);
                mapAUX.put(empleado4.getDni(),empleado4);
                try {
                    ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U7/T4/Ejercicio1/empleados.dat",true));
                    fichero.writeObject(mapAUX);
                    fichero.close();
                }catch (IOException ex){
                    ex.printStackTrace();
                }
                empleadoPerso.cargarMapa();
                break;
            case 2:
                System.out.println("Quieres seguir metiendo a empleados? ");
                String respu = teclado.next();
                    do {
                        System.out.println("Dime tu nombre:");
                        String nombre = teclado.next();
                        System.out.println("Dime tu dni:");
                        String dni = teclado.next();
                        System.out.println("Dime tu edad");
                        int edad = teclado.nextInt();
                        System.out.println("Dime tu estatura:");
                        double estatura = teclado.nextDouble();
                        System.out.println("Dime tu sueldo");
                        int sueldo = teclado.nextInt();
                        empleadoPerso empleado = new empleadoPerso(nombre,dni,edad,estatura,sueldo);
                        empleado.introducirEmpleado(empleado);
                        System.out.println("Quieres seguir metiendo a empleados? ");
                        respu = teclado.next();
                    }while (!respu.equalsIgnoreCase("no"));
                break;
        }
        do {
            System.out.println("Ya están cargados los datos, que quieres hacer?");
            System.out.println("1. Visualizar listado");
            System.out.println("2. Borrar empleados");
            System.out.println("3. Visualizar empleado");
            System.out.println("4. Modificar empleado");
            System.out.println("5. Insertar empleado");
            System.out.println("6. Finalizar programa");
            decision = teclado.nextInt();
            switch (decision){
                case 1:
                    empleadoPerso.mostrarMapaEmpleado();
                    break;
                case 2:
                    System.out.println("Quieres seguir? (1 para sí, 2 para no)");
                    int respuAUX = teclado.nextInt();
                    do {
                        System.out.println("Dime un DNI");
                        String dniAUX = teclado.next();
                        System.out.println("Se procede a borra el empleado con dni "+ dniAUX);
                        empleadoPerso.eliminarEmpleado(dniAUX);
                        System.out.println("Quieres seguir? (1 para sí, 2 para no)");
                        respuAUX = teclado.nextInt();
                    }while (respuAUX != 2);
                    break;
                case 3:
                    System.out.println("Dime el dni del empleado que quieres visualizar");
                    String dniAUX = teclado.next();
                    empleadoPerso.visualizarEmpleado(dniAUX);
                    break;
                case 4:
                    System.out.println("Dime el dni del empleado que deseas cambiar sus datos");
                    dniAUX = teclado.next();
                    System.out.println("Dime el nombre que quieres poner nuevo: ");
                    String nombre = teclado.next();
                    System.out.println("Dime la estatura que quieres poner de nuevo: ");
                    double estaturaAUX = teclado.nextDouble();
                    System.out.println("Dime la edad que quieres poner de nuevo: ");
                    int edad = teclado.nextInt();
                    System.out.println("Dime el sueldo que quieres poner de nuevo: ");
                    int salario = teclado.nextInt();
                    empleadoPerso empleado = new empleadoPerso(nombre,dniAUX,edad,estaturaAUX,salario);
                    empleadoPerso.realizarCambios(dniAUX,empleado);
                    break;
                case 5:
                    System.out.println("Dime el dni del empleado que deseas insertar");
                    dniAUX = teclado.next();
                    System.out.println("Dime el nombre del empleado: ");
                    nombre = teclado.next();
                    System.out.println("Dime la estatura del empleado: ");
                    estaturaAUX = teclado.nextDouble();
                    System.out.println("Dime la edad del empleado: ");
                    edad = teclado.nextInt();
                    System.out.println("Dime el sueldo del empleado: ");
                    salario = teclado.nextInt();
                    empleado = new empleadoPerso(nombre,dniAUX,edad,estaturaAUX,salario);
                    empleado.introducirEmpleado(empleado);
                    break;
            }
        }while (decision !=6);
        System.out.println("Gracias por utiliza el programa!");
        empleadoPerso.volcarBinario();
    }
}
