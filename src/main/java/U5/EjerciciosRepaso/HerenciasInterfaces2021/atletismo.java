package U5.EjerciciosRepaso.HerenciasInterfaces2021;

public class atletismo extends deporte {
    private int numeroPruebas;

    public atletismo(String nombreDeporte, String nombrePabellon,int numeroPruebas) {
        super(nombreDeporte, nombrePabellon);
        this.numeroPruebas = numeroPruebas;
    }
}
