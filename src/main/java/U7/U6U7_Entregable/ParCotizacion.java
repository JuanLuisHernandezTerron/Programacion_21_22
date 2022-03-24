package U7.U6U7_Entregable;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ParCotizacion implements Serializable {
    private double precioEstablecido = 0;
    private double variacionPorcentual = 0;
    private divisa divisaBase;
    private divisa divisaDestino;

    public ParCotizacion(double precioEstablecido, double variacionPorcentual, divisa divisaBase, divisa divisaDestino) {
        setPrecioEstablecido(precioEstablecido);
        setVariacionPorcentual(variacionPorcentual);
        setDivisaBase(divisaBase);
        setDivisaDestino(divisaDestino);
    }

    public divisa getDivisaBase() {
        return divisaBase;
    }

    @Override
    public String toString() {
        return "ParCotizacion{" +
                "precioEstablecido=" + precioEstablecido +
                ", variacionPorcentual=" + variacionPorcentual +
                ", divisaBase=" + divisaBase +
                ", divisaDestino=" + divisaDestino +
                '}';
    }

    public void setDivisaBase(divisa divisaBase) {
        this.divisaBase = divisaBase;
    }

    public divisa getDivisaDestino() {
        return divisaDestino;
    }

    public void setDivisaDestino(divisa divisaDestino) {
        this.divisaDestino = divisaDestino;
    }

    public double getPrecioEstablecido() {
        return precioEstablecido;
    }

    public void setPrecioEstablecido(double precioEstablecido) {
        this.precioEstablecido = precioEstablecido;
    }

    public double getVariacionPorcentual() {
        return variacionPorcentual;
    }

    public void setVariacionPorcentual(double variacionPorcentual) {
        this.variacionPorcentual = variacionPorcentual;
    }
}
