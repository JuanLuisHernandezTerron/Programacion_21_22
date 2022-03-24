package U7.EjerciciosRepaso.Examen1920Manana;

import java.io.Serializable;
import java.util.Objects;

public class perro implements Serializable {
    private String nombre;
    private Integer edad;
    private double pesoPerro;
    private boolean vacunas;
    private propietario propietario;
    private raza razaPerro;


    public perro(String nombre, Integer edad, double pesoPerro, boolean vacunas, U7.EjerciciosRepaso.Examen1920Manana.propietario propietario, raza razaPerro) {
        setNombre(nombre);
        setEdad(edad);
        setPesoPerro(pesoPerro);
        setVacunas(vacunas);
        setPropietario(propietario);
        setRazaPerro(razaPerro);
    }

    public enum raza{
        BULLDOG,
        PASTORALEMAN,
        CHIHUAHUA,
        BOXER,
        LABRADO,
        COLLIE,
        SALCHICHA,
        HUSKI
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", pesoPerro=" + pesoPerro +
                ", vacunas=" + vacunas +
                ", propietario=" + propietario +
                ", razaPerro=" + razaPerro;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, pesoPerro, vacunas, propietario, razaPerro);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public double getPesoPerro() {
        return pesoPerro;
    }

    public void setPesoPerro(double pesoPerro) {
        this.pesoPerro = pesoPerro;
    }

    public boolean isVacunas() {
        return vacunas;
    }

    public void setVacunas(boolean vacunas) {
        this.vacunas = vacunas;
    }

    public U7.EjerciciosRepaso.Examen1920Manana.propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(U7.EjerciciosRepaso.Examen1920Manana.propietario propietario) {
        this.propietario = propietario;
    }

    public raza getRazaPerro() {
        return razaPerro;
    }

    public void setRazaPerro(raza razaPerro) {
        this.razaPerro = razaPerro;
    }
}
