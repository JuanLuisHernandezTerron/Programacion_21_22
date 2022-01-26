package U4.ejerciciosRepaso.Entregable19_20;

public class Ingrediente {
    private String ingrediente;
    private int calorias;

    public Ingrediente(String ingrediente, int calorias){
        this.ingrediente = ingrediente;
        this.calorias = calorias;
    }

    public Ingrediente(){
        this.ingrediente = "Queso";
        this.calorias = 250;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void ingredientesArray(){
        System.out.println("El ingrediente es "+ingrediente);
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
}
