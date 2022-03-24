package U7.EjerciciosRepaso.Examen1220Tarde;

import java.io.Serializable;

public class paciente implements Serializable {
    private String nombrePaciente;
    private int edad;
    private double peso;
    private boolean vacunas;
    private medico medico;
    private int codigoCepa;

    public paciente(String nombrePaciente, int edad, double peso, boolean vacunas, medico medicoAUX, int codigoCepa) {
        setNombrePaciente(nombrePaciente);
        setEdad(edad);
        setPeso(peso);
        setVacunas(vacunas);
        setMedico(medicoAUX);
        setCodigoCepa(codigoCepa);
    }

    @Override
    public String toString() {
        return "nombrePaciente='" + nombrePaciente + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vacunas=" + vacunas +
                ", medico=" + medico +
                ", codigoCepa=" + codigoCepa;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isVacunas() {
        return vacunas;
    }

    public void setVacunas(boolean vacunas) {
        this.vacunas = vacunas;
    }

    public U7.EjerciciosRepaso.Examen1220Tarde.medico getMedico() {
        return medico;
    }

    public void setMedico(U7.EjerciciosRepaso.Examen1220Tarde.medico medico) {
        this.medico = medico;
    }

    public int getCodigoCepa() {
        return codigoCepa;
    }

    public void setCodigoCepa(int codigoCepa) {
        this.codigoCepa = codigoCepa;
    }
}
