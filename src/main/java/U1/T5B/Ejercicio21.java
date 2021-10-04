package U1.T5B;

import java.util.Scanner;

// Escribe un programa que genere la nómina (bien desglosada) de un empleado según las siguientes
// condiciones:
//
//
// • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto),
// los días que ha estado de viaje visitando clientes durante el mes y su estado civil (1 - Soltero,
// 2 - Casado).
// • El sueldo base según el cargo es de 950, 1200 y 1600 euros según si se trata de un prog.
// junior, un prog. senior o un jefe de proyecto respectivamente.
// • Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto de dietas. Al
// sueldo neto hay que restarle el IRPF, que será de un 25% en caso de estar soltero y un 20% en
// caso de estar casado.
//
//
// Ejemplo:
// 1 - Programador junior
// 2 - Prog. senior
// 3 - Jefe de proyecto
// Introduzca el cargo del empleado (1 - 3): 2
// ¿Cuántos días ha estado de viaje visitando clientes? 5
// Introduzca su estado civil (1 - Soltero, 2 - Casado): 2
//
//
// ----------------------------------
// | Sueldo base 1200,00 |
// | Dietas ( 5 viajes) 150,00 |
// |--------------------------------|
// | Sueldo bruto 1350,00 |
// | Retención IRPF (20%) 270,00 |
// |--------------------------------|
// | Sueldo neto 1080,00 |
// ---------------------------------
public class Ejercicio21 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        System.out.println("Nomina:");
        System.out.println("1 - Programador Junior");
        System.out.println("2 - Programador Senior");
        System.out.println("3 - Jefe de proyecto");
        System.out.print("Introduzca el cargo que ocupas: ");
        int numeroCargo = teclado.nextInt();
        System.out.print("Cuantos dias has estado de viaje visitando clientes? ");
        int numeroDias = teclado.nextInt();

        System.out.println("1 - Soltero");
        System.out.println("2 - Casado");
        System.out.print("Introduce su estado civil: ");
        int estadoCivil = teclado.nextInt();

        double salarioPj = 950;
        double salarioPs = 1200;
        double salarioJp = 1600;

        double viajesClientes = numeroDias * 30;



        switch (numeroCargo){
            case 1 :
                double sueldoBruto = salarioJp + viajesClientes;
                double soltero = (int) (sueldoBruto * 0.25);
                double casado = (int) (sueldoBruto * 0.20);
                System.out.println("El salario base es "+salarioPj+" mas la dieta sería: " + sueldoBruto);
                if (estadoCivil == 1){
                    System.out.print("Tu salario sería: " + (sueldoBruto - soltero));
                }else{
                    System.out.print("Tu salario sería: " + (sueldoBruto - casado));
                }
                break;
            case 2 :
                sueldoBruto = salarioPs + viajesClientes;
                soltero = (int) (sueldoBruto * 0.25);
                casado = (int) (sueldoBruto * 0.20);
                System.out.println("El salario base es "+salarioPs+" mas la dieta sería: " + sueldoBruto);
                if (estadoCivil == 1){
                    System.out.print("Tu salario sería: " + (sueldoBruto - soltero));
                }else{
                    System.out.print("Tu salario sería: " + (sueldoBruto - casado));
                }
                break;
            case 3:
                sueldoBruto = salarioJp + viajesClientes;
                soltero = (int) (sueldoBruto * 0.25);
                casado = (int) (sueldoBruto * 0.20);
                System.out.println("El salario base es "+salarioJp+" mas la dieta sería: " + sueldoBruto);
                if (estadoCivil == 1){
                    System.out.print("Tu salario sería: " + (sueldoBruto - soltero));
                }else{
                    System.out.print("Tu salario sería: " + (sueldoBruto - casado));
                }
                break;
        }
    }
}
