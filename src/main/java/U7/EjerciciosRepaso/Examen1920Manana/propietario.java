package U7.EjerciciosRepaso.Examen1920Manana;

public class propietario {
    private String nombre;
    private String apellidos;
    private int contador = 0;
    private static int numeroSocio = 0;
    private String paisOrigen;

    public propietario(String nombre, String apellidos, long numeroSocio, String paisOrigen) {
        setNombre(nombre);
        setApellidos(apellidos);
        setNumeroSocio();
        setPaisOrigen(paisOrigen);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public long getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio() {
        this.numeroSocio = contador++;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}
