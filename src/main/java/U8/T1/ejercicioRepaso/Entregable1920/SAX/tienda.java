package U8.T1.ejercicioRepaso.Entregable1920.SAX;

public class tienda {
    private String nombre;
    private String localidad;
    private int establecimientos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getEstablecimientos() {
        return establecimientos;
    }

    public void setEstablecimientos(int establecimientos) {
        this.establecimientos = establecimientos;
    }

    @Override
    public String toString() {
        return "tienda{" +
                "nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                ", establecimientos=" + establecimientos +
                '}';
    }
}
