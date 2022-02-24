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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public U5.EjerciciosRepaso.Examen2021Manana.conductor getConductor() {
        return conductor;
    }

    public void setConductor(U5.EjerciciosRepaso.Examen2021Manana.conductor conductor) {
        this.conductor = conductor;
    }

    public abstract void descargar(int cajasDescargar, int prendasDescargar);

}
