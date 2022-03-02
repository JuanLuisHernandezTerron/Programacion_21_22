package U4.T1.Actividad9.personal;

import java.io.Serializable;

public class mecanicos implements Serializable {
    private String nombreCompleto;
    private int telefono;
    private tipoEspecialidad especialidad;

    public mecanicos (String nombreCompleto , int telefono, tipoEspecialidad especialidad){
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }
    public enum tipoEspecialidad{
        FRENOS,
        HIDRAULICA,
        MOTOR,
        RUEDAS,
        CRISTALES
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getTelefono() {
        return telefono;
    }

    public tipoEspecialidad getEspecialidad() {
        return especialidad;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = tipoEspecialidad.valueOf(especialidad);
    }
}
