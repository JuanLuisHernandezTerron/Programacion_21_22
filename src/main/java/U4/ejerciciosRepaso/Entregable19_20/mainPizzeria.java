package U4.ejerciciosRepaso.Entregable19_20;

public class mainPizzeria {
    public static void main(String[] args) {
        pizza pizza1 = new pizza();
        pizza pizza2 = new pizza(pizza.tamanoPizza.MEDIANA);
        Ingrediente ingre1 = new Ingrediente("Peperoni",100);
        Ingrediente ingre2 = new Ingrediente("Atun",150);
        Ingrediente ingre3 = new Ingrediente("Bacon",110);
        Ingrediente ingre4 = new Ingrediente("Jamon",120);
        Ingrediente ingre5 = new Ingrediente("Queso",100);
        pedidos pedido1 = new pedidos(pizza1);
        pizzeria pizzeria1 = new pizzeria();
        pizzeria pizzeria2 = new pizzeria();

        for(pizza.tamanoPizza pizza: pizza.tamanoPizza.values()){
            System.out.println("El tamaño puede ser: "+pizza);
        }
        pizza1.anadirIngredientes(ingre1);
        pizza1.anadirIngredientes(ingre3);
        System.out.println();
        pizza1.getInformacionPizza();
        System.out.println();
        pizzeria1.anadirPedidos(pedido1);
        System.out.println();
        pizzeria1.getInformarcionPedidos();
        System.out.println();
        pizzeria2.getInformarcionPedidos();

    }
}
