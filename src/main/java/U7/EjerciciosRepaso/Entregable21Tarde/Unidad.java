package U7.EjerciciosRepaso.Entregable21Tarde;

import java.util.ArrayList;

public class Unidad {
    private String nombreUnidad;
    private ArrayList<alumno> arrayAlumno = new ArrayList<>();

    public Unidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }

    @Override
    public String toString() {
        return "Unidad{" +
                "nombreUnidad='" + nombreUnidad + '\'' +
                '}';
    }
}
