package U7.U6U7_Entregable;

import java.io.Serializable;

public abstract class divisa implements Serializable {
    private String nombre;
    private String simboloDivisa;
    private static int contador = 0;
    private int idDivisa=0;

    public divisa(String nombre, String simboloDivisa) {
        setNombre(nombre);
        setSimmboloDivisa(simboloDivisa);
        this.idDivisa = contador++;
    }


    @Override
    public String toString() {
        return "divisa{" +
                "nombre='" + nombre + '\'' +
                ", simboloDivisa='" + simboloDivisa + '\'' +
                ", idDivisa=" + idDivisa +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSimmboloDivisa() {
        return simboloDivisa;
    }

    public void setSimmboloDivisa(String simmboloDivisa) {
        this.simboloDivisa = simmboloDivisa;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        divisa.contador = contador;
    }

    public int getIdDivisa() {
        return idDivisa;
    }

    public void setIdDivisa(int idDivisa) {
        this.idDivisa = idDivisa;
    }
}
