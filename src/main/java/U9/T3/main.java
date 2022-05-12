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
                    System.out.println("Dime un id de empleado");
                    int id_emple = sc.nextInt();
                    System.out.println("Dime un id de cliente");
                    int id_cliente = sc.nextInt();
                    gestorActualizar.asignarEmple(id_emple,id_cliente);
                    break;
                case 3:
                    System.out.println("Dime un id de pedido");
                    int id_pedido = sc.nextInt();
                    System.out.println("Dime un id de producto");
                    String id_producto = sc.next();
                    System.out.println("Dime la cantidad que quieres ingresar");
                    int cantidadIngresar = sc.nextInt();
                    gestorActualizar.asignarProductoPedido(id_pedido,id_producto,cantidadIngresar);
                    break;
                case 4:
                    System.out.println("Dime el id de un pedido");
                    int id_pedidoAUX = sc.nextInt();
                    gestorPedido.getDetalles(id_pedidoAUX);
                    break;
            }
        } while (numeroHacer != 5);
    }
}
