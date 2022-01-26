package U4.ejerciciosRepaso.Entregable19_20;

import java.lang.reflect.Array;
import java.util.Arrays;

public class pizza {
    private tamanoPizza tamano;
    private int contadorIngrediente = 0;

    private Ingrediente[] ingredientesArray = new Ingrediente[0];

    public pizza(tamanoPizza pizza){
        this.tamano = pizza;
    }

    public pizza(){
        this.tamano = tamanoPizza.FAMILIAR;
    }

    public void mostrarTamanos(){
        System.out.println("Los tipos de tamaño de pizza son "+ tamanoPizza.FAMILIAR + " y "+tamanoPizza.MEDIANA);
    }

    public static enum tamanoPizza{
        MEDIANA,
        FAMILIAR;

    }

    public boolean anadirIngredientes(Ingrediente ingrediente){
        ingredientesArray = Arrays.copyOf(ingredientesArray,ingredientesArray.length+1);
        ingredientesArray[contadorIngrediente++] = ingrediente;
        boolean pizzaLlena = false;
        if (ingredientesArray.length < 3){
            pizzaLlena = true;
        }
        return pizzaLlena;
    }

    public int getContadorIngrediente() {
        return contadorIngrediente;
    }

    public void getInformacionPizza(){
        System.out.println("La pizza tiene "+getContadorIngrediente()+" ingredientes");
        System.out.println("El tamaño de la pizza es: "+getTamano());
        for (int i = 0; i < ingredientesArray.length; i++) {
            ingredientesArray[i].ingredientesArray();
        }
    }

    public tamanoPizza getTamano() {
        return tamano;
    }

    public void setTamano(tamanoPizza tamano) {
        this.tamano = tamano;
    }

    public Ingrediente[] getIngredientesArray() {
        return ingredientesArray;
    }
}
