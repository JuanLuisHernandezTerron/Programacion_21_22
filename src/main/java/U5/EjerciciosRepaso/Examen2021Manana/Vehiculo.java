package U5.EjerciciosRepaso.Examen2021Manana;

public abstract class Vehiculo {
    private String matricula;
    private int cargaMax;
    private conductor conductor;

    public Vehiculo(String matricula, int cargaMax, conductor conductor) {
        this.matricula = matricula;
        this.cargaMax = cargaMax;
        this.conductor = conductor;
    }

    public void descargar(){

    }
}
