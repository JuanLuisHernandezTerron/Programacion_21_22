package U4.ejerciciosRepaso.Entregable19_20;

import java.util.Arrays;

public class pizzeria {
    private int tamanoPedidosArray;
    pedidos [] arrayPedidos;
    private int contadorPedidos = 0;

    public pizzeria(int tamanoArray){
        this.arrayPedidos = new pedidos[tamanoPedidosArray];
    }

    public pizzeria(){
        this.arrayPedidos = new pedidos[5];
    }

    public void anadirPedidos(pedidos pedido){
        if (this.contadorPedidos >= tamanoPedidosArray){
            arrayPedidos = Arrays.copyOf(arrayPedidos,arrayPedidos.length+1);
        }
        arrayPedidos[contadorPedidos++] = pedido;
    }

    public void getInformarcionPedidos(){
        System.out.println("En esta pizzeria han pedido "+ contadorPedidos + " pedidos");
        for (int i = 0; i < contadorPedidos; i++) {
            System.out.println("La fecha del pedido es " + arrayPedidos[i].getFechaPedido());
            arrayPedidos[i].getPizzaPedido().getInformacionPizza();
        }
    }
}
