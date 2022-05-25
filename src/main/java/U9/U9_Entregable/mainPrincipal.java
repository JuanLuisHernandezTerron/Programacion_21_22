package U9.U9_Entregable;

import U9.T2.ConexionBBDD;

public class mainPrincipal {
    public static void main(String[] args) {
        consultas.FiltroPrecio();
        System.out.println("-------------------");
        consultas.InfoPagos();
        System.out.println("-------------------");
        consultas.informeCategorias();
        System.out.println("-------------------");
        Transacciones.insertarEmpleClient();
        System.out.println("-------------------");
        Transacciones.insertOfiActuEmple();
    }
}
