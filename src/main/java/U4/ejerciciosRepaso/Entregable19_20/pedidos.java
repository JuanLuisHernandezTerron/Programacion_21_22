package U4.ejerciciosRepaso.Entregable19_20;

import java.time.LocalDateTime;

public class pedidos {
    private pizza pizzaPedido;
    private LocalDateTime fechaPedido;

    public pedidos(pizza pizzaPedido){
        this.pizzaPedido = pizzaPedido;
        this.fechaPedido = LocalDateTime.now();
    }

    public pedidos(){
        pizza pizzaEspecial = new pizza(pizza.tamanoPizza.FAMILIAR);
        Ingrediente ingre4 = new Ingrediente("Jamon",120);
        Ingrediente ingre5 = new Ingrediente("Queso",100);
        pizzaEspecial.anadirIngredientes(ingre4);
        pizzaEspecial.anadirIngredientes(ingre5);
        this.fechaPedido = LocalDateTime.now();
    }

    public LocalDateTime getFechaPedido() {
        return fechaPedido;
    }

    public pizza getPizzaPedido() {
        return pizzaPedido;
    }
}
