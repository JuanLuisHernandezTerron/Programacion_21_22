package U4.T2.Actividad2;

import java.util.Arrays;

public class pilaTabla {
    private Integer [] arrayInteger = new Integer[0];
    int contadorIntroducir = 0;

    public pilaTabla(){

    }

    public void apilar(){
        this.arrayInteger = Arrays.copyOf(this.arrayInteger,this.arrayInteger.length+1);
        this.arrayInteger[this.contadorIntroducir++] = (int)(Math.random()*10);
    }

    public void desapilar(){
        this.arrayInteger[arrayInteger.length-1] = 0;
        this.arrayInteger = Arrays.copyOf(arrayInteger,arrayInteger.length-1);
    }

    public Integer cima(){
        return this.arrayInteger[arrayInteger.length-1];
    }

    public Integer[] getArrayInteger() {
        return arrayInteger;
    }

    public void setArrayInteger(Integer[] arrayInteger) {
        this.arrayInteger = arrayInteger;
    }
}
