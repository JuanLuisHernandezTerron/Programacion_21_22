package U5.U4U5_Examen;

public class integrante {
    private int contadorParticipante =0;
    private String nombre;
    private int edad;
    private String localidad;

    public integrante(String nombre, int edad, String localidad) {
        setContadorParticipante();
        this.nombre = nombre;
        this.edad = edad;
        this.localidad = localidad;
    }

    public void setContadorParticipante() {
        this.contadorParticipante += 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "integrante{" +
                "contadorParticipante=" + contadorParticipante +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
