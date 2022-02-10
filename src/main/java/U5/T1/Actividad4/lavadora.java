package U5.T1.Actividad4;

import java.util.Arrays;

public class lavadora extends electrodomestico implements Comparable {
    private int carga = 5;

    public lavadora(int precioBase, color colorElec, consumoEne consumo, int peso, int carga) {
        super(precioBase, colorElec, consumo, peso);
        this.carga = carga;
    }

    public lavadora(int precioBase, int peso) {
        super(precioBase, peso);
    }

    public int getPrecioFinalLavadora(){
        int precioFinalLavadora =0;
            if (this.carga > 30){
                return precioFinalLavadora=super.getPrecioFinal()+50;
            }else{
                return getPrecioFinal();
            }
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public String toString() {
        return "electrodomestico{" +
                "precioBase= " + precioBase +
                ", colorElec= " + colorElec +
                ", consumo= " + consumo +
                ", peso= " + peso +
                ",precio final es "+ getPrecioFinalLavadora()+
                " Y su carga es: "+ this.carga+
                '}';
    }

    @Override
    public int compareTo(Object o) {
        lavadora that = (lavadora) o;
        if (this.carga < that.carga){
            return 1;
        }else if(this.carga > that.carga){
            return -1;
        }
        return 0;
    }
}
