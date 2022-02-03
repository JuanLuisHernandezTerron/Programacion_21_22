package U5.T1.Actividad2;

import java.util.Arrays;

public class instrumento {
    private notas notasAUX;
    private notas [] arrayNotas = new notas[0];
    private int contadorNotas;

    public instrumento(){
    }

    public void add(notas notasAUX){
        arrayNotas = Arrays.copyOf(arrayNotas,arrayNotas.length+1);
        arrayNotas[contadorNotas++] = notasAUX;
    }
    public enum notas{
        DO,
        RE,
        MI,
        FA,
        SO,
        LA,
        SI
    }


}
