package U9.U9_Entregable;

public class mainPrincipal {
    public static void main(String[] args) {
        consultas.FiltroPrecio();
        System.out.println("-------------------");
        consultas.InfoPagos();
        System.out.println("-------------------");
        consultas.informeCategorias();
        System.out.println("-------------------");

        Transacciones.insertarEmpleClient();
        Transacciones.insertOfiActuEmple();
    }
}
