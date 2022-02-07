package U5.T1.Actividad2;
import java.util.Arrays;
public abstract class instrumento {
    private notas [] arrayNotas;
    public instrumento(){
        this.arrayNotas = new notas[100];
    }

    public abstract void add(notas notasAUX);

    public abstract void interpretar();



    public enum notas{
        DO,
        RE,
        MI,
        FA,
        SO,
        LA,
        SI;
    }

    public notas[] getArrayNotas() {
        return arrayNotas;
    }

    public void setArrayNotas(notas[] arrayNotas) {
        this.arrayNotas = arrayNotas;
    }
}
