package U7.EjerciciosRepaso.Entregable21Tarde;

public class alumno {
    private String nombre;
    private String apellidos;
    private String dni;
    private int id =0;
    private Unidad unidadAlum;

    public alumno(String nombre, String apellidos, String dni, Unidad unidadAlum) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.unidadAlum = unidadAlum;
        setId();
    }

    @Override
    public String toString() {
        return "alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", id=" + id +
                ", unidadAlum=" + unidadAlum +
                '}';
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id ++ ;
    }

    public Unidad getUnidadAlum() {
        return unidadAlum;
    }

    public void setUnidadAlum(Unidad unidadAlum) {
        this.unidadAlum = unidadAlum;
    }
}
