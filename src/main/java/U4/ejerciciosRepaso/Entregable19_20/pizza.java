package U4.ejerciciosRepaso.Entregable19_20;
public class pizza {
    private tamanoPizza tamano;

    private int contadorIngrediente = 0;

    private String [] ingredientesArray = new String[3];
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
    public boolean anadirIngredientes(String ingrediente , int calorias){
        ingredientesArray[contadorIngrediente++] = ingrediente;
        boolean pizzaLlena = false;
        if (ingredientesArray.length == 3){
            pizzaLlena = true;
        }
        return pizzaLlena;
    }

    public int getContadorIngrediente() {
        return contadorIngrediente;
    }

    public void getInformacionPizza(){
        System.out.println("El tamaño de la pizza es: "+getTamano());
        System.out.println("Tiene"+getContadorIngrediente()+" ingredientes la pizza");
    }

    public tamanoPizza getTamano() {
        return tamano;
    }

    public void setTamano(tamanoPizza tamano) {
        this.tamano = tamano;
    }
}
