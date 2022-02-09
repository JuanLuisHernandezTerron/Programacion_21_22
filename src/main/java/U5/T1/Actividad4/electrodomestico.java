package U5.T1.Actividad4;

public class electrodomestico {
    protected int precioBase;
    protected color colorElec;
    protected consumoEne consumo;
    protected int peso;

    public electrodomestico(int precioBase, color colorElec, consumoEne consumo, int peso) {
        this.precioBase = precioBase;
        this.colorElec = colorElec;
        this.consumo = consumo;
        this.peso = peso;
    }

    public electrodomestico(int precioBase,int peso) {
        this.precioBase = precioBase;
        this.colorElec = color.BLANCO;
        this.consumo = consumoEne.F;
        this.peso = peso;
    }

    public electrodomestico() {
        this.precioBase = 100;
        this.colorElec = color.BLANCO;
        this.consumo = consumoEne.F;
        this.peso = 5;
    }


    public enum consumoEne{
        A,
        B,
        C,
        D,
        E,
        F;
    }

    public enum color{
        BLANCO,
        NEGRO,
        ROJO,
        AZUL,
        GRIS;
    }
    public int getPrecioFinal(){
        int PrecioFinal = this.precioBase;
        switch (this.consumo){
            case A: PrecioFinal += 100;
            case B: PrecioFinal += 80;
            case C: PrecioFinal += 60;
            case D: PrecioFinal += 50;
            case E: PrecioFinal += 30;
            case F: PrecioFinal += 10;
        }
            if (this.peso>=0 && this.peso <= 29) {
                PrecioFinal += 10;
            }else if(this.peso >=30 && this.peso <=49){
                PrecioFinal += 60;
            }else if(this.peso >=50 && this.peso<=79){
                PrecioFinal += 80;
            }else if(this.peso > 80){
                PrecioFinal += 100;
            }
        return PrecioFinal;
        }

    public double getPrecioBase() {
        return precioBase;
    }

    public color getColorElec() {
        return colorElec;
    }

    public consumoEne getConsumo() {
        return consumo;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "electrodomestico{" +
                "precioBase=" + precioBase +
                ", colorElec=" + colorElec +
                ", consumo=" + consumo +
                ", peso=" + peso +
                ",precio final es"+ getPrecioFinal()+
                '}';
    }
}
