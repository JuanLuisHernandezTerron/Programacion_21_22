package U5.EjerciciosRepaso.HerenciasInterfaces2021;

public class judo extends deporte{
    private int  numeroTatamis;

    public judo(String nombreDeporte, String nombrePabellon, int numeroTatamis) {
        super(nombreDeporte, nombrePabellon);
        this.numeroTatamis = numeroTatamis;
    }
}
