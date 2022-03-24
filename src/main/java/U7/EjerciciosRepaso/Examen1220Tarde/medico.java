package U7.EjerciciosRepaso.Examen1220Tarde;

import java.io.Serializable;

public class medico implements Serializable {
    private String nombreMedico;
    private String apellidos;
    private static int contador =0;
    private int numeroColegiado;
    private String hospitalTrabaja;

    public medico(String nombreMedico, String apellidos,String hospitalTrabaja) {
        setNombreMedico(nombreMedico);
        setApellidos(apellidos);
        this.numeroColegiado = contador++;
        setHospitalTrabaja(hospitalTrabaja);
    }

    @Override
    public String toString() {
        return "nombreMedico='" + nombreMedico + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numeroColegiado=" + numeroColegiado +
                ", hospitalTrabaja='" + hospitalTrabaja;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        medico.contador = contador;
    }

    public int getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(int numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }

    public String getHospitalTrabaja() {
        return hospitalTrabaja;
    }

    public void setHospitalTrabaja(String hospitalTrabaja) {
        this.hospitalTrabaja = hospitalTrabaja;
    }
}
