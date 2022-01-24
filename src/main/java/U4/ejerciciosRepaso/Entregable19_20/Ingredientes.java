package U4.ejerciciosRepaso.Entregable19_20;

public class Ingredientes {
    private String ingrediente;

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    private int calorias;

    public Ingredientes(String ingrediente, int calorias){
        this.ingrediente = ingrediente;
        this.calorias = calorias;
    }

    public Ingredientes(){
        this.ingrediente = "Queso";
        this.calorias = 250;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }
}
