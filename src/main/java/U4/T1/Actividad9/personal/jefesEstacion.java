package U4.T1.Actividad9.personal;

public class jefesEstacion {
    private String nombreCompleto;
    private String dni;

    public jefesEstacion(String nombreCompleto, String dni){
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
