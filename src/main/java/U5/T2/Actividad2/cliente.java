package U5.T2.Actividad2;

import java.util.Arrays;
import java.util.Objects;

public class cliente {
    private String dni;
    private String nombre;
    private int edad;
    private double saldo;

    cliente [] arrayClientes = new cliente[5];

    int contadorClientes = 0;
    public cliente(String dni, String nombre, int edad, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
    }

    public void meterClientes (cliente clienteAUX){
        arrayClientes[contadorClientes++] = clienteAUX;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        cliente cliente = (cliente) that;
        return Objects.equals(dni, cliente.dni);
    }

    @Override
    public String toString() {
        return "cliente{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", saldo=" + saldo +
                '}';
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public cliente[] getArrayClientes() {
        return arrayClientes;
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
