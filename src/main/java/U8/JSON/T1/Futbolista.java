package U8.JSON.T1;

import java.util.Arrays;

public class Futbolista {
    private int dorsal;
    private String nombre;
    private String club;
    private String[] posicionJugadore;

    public Futbolista(int dorsal, String nombre, String club,String [] listaposi) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.club = club;
        this.posicionJugadore = listaposi;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String[] getPosicionJugadore() {
        return posicionJugadore;
    }

    public void setPosicionJugadore(String[] posicionJugadore) {
        this.posicionJugadore = posicionJugadore;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                ", club='" + club + '\'' +
                ", posicionJugadore=" + Arrays.toString(posicionJugadore) +
                '}';
    }
}
