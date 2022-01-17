package U4.T1;

public class banco {
    public String nombre_banco;
    private long capital = 5200000;
    private String direccionCentral;

    public banco(String nombre_banco, long capital, String direccionCentral){
        this.nombre_banco = nombre_banco;
        this.capital = capital;
        this.direccionCentral = direccionCentral;
    }

    public void setDireccionCentral(String direccionCentral) {
        this.direccionCentral = direccionCentral;
    }

    public void setCapital(long capital) {
        this.capital = capital;
    }

}
