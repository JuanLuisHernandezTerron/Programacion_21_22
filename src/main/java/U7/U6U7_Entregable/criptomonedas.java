package U7.U6U7_Entregable;

import java.io.Serializable;

public class criptomonedas extends divisa implements Serializable {
    private double precioDolar;
    private double volumenTrasaccion;
    private String fechaCreacion;
    private int posicionExchange;

    public criptomonedas(String nombre, String simboloDivisa, double precioDolar, double volumenTrasaccion, String fecha, int posicionExchange) {
        super(nombre, simboloDivisa);
        setPrecioDolar(precioDolar);
        setVolumenTrasaccion(volumenTrasaccion);
        setFecha(fecha);
        setPosicionExchange(posicionExchange);
    }

    public double getPrecioDolar() {
        return precioDolar;
    }

    public void setPrecioDolar(double precioDolar) {
        this.precioDolar = precioDolar;
    }

    public double getVolumenTrasaccion() {
        return volumenTrasaccion;
    }

    public void setVolumenTrasaccion(double volumenTrasaccion) {
        this.volumenTrasaccion = volumenTrasaccion;
    }

    public String getFecha() {
        return fechaCreacion;
    }

    public void setFecha(String fecha) {
        this.fechaCreacion = fecha;
    }

    public int getPosicionExchange() {
        return posicionExchange;
    }

    public void setPosicionExchange(int posicionExchange) {
        this.posicionExchange = posicionExchange;
    }
}
