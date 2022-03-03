package U5.EjerciciosRepaso.HerenciasInterfaces2021;

public class baloncesto extends deporte{
    private int numeroEquipos;
    public baloncesto(String nombreDeporte, String nombrePabellon,int numeroEquipos ) {
        super(nombreDeporte, nombrePabellon);
        this.numeroEquipos = numeroEquipos;
    }
}
