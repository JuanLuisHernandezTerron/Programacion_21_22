package U5.T1.Actividad4;

public class television extends electrodomestico{
    private int pulgadas;
    private boolean tdt;

    public television(int precioBase, color colorElec, consumoEne consumo, int peso,int pulgadas, boolean tdt) {
        super(precioBase, colorElec, consumo, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    public television(int precioBase, int peso,int pulgadas,boolean tdt) {
        super(precioBase, peso);
        this.pulgadas = 20;
        this.tdt = false;
    }

    public double getPrecioFinalTV(){
        double precioFinal = super.getPrecioFinal();
        if (this.pulgadas > 40){
            precioFinal += super.getPrecioFinal()*(0.3);
        }

        if (isTdt()){
            precioFinal += 50;
        }

        return precioFinal;
    }

    @Override
    public String toString() {
        return "electrodomestico{" +
                "precioBase=" + precioBase +
                ", colorElec=" + colorElec +
                ", consumo=" + consumo +
                ", peso=" + peso +
                ", precio final es: "+ getPrecioFinalTV()+
                '}';
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }
}
