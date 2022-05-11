package U9.T3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroHacer;
        do {
            System.out.println("Que quieres hacer:");
            System.out.println("1.InsertarCliente");
            System.out.println("2.Asignar empleado a cliente");
            System.out.println("3.Anadir productor a pedido");
            System.out.println("4.Mostrar con detalle un pedido");
            numeroHacer = sc.nextInt();
            switch (numeroHacer) {
                case 1:
                    gestorInserccion.insertarCliente();
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        } while (numeroHacer != 5);
    }
}
