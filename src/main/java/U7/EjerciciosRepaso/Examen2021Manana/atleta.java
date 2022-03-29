package U7.EjerciciosRepaso.Examen2021Manana;

import java.io.Serializable;

public class atleta implements Serializable,Comparable<atleta> {
    private String nombre;
    private String pais;
    private double marcaRealizada;
    private categorias categoriasAtleta;
    private boolean AcabadoPrueba;
    private static int contador = 0;
    private int dorsal;

    public atleta(String nombre, String pais, double marcaRealizada, categorias categoriasAtleta, boolean acabadoPrueba) {
        setNombre(nombre);
        setPais(pais);
        setMarcaRealizada(marcaRealizada);
        setCategoriasAtleta(categoriasAtleta);
        setAcabadoPrueba(acabadoPrueba);
        this.dorsal = contador++;
    }

    @Override
    public String toString() {
        return "atleta{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", marcaRealizada=" + marcaRealizada +
                ", categoriasAtleta=" + categoriasAtleta +
                ", AcabadoPrueba=" + AcabadoPrueba +
                ", dorsal=" + dorsal +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getMarcaRealizada() {
        return marcaRealizada;
    }

    public void setMarcaRealizada(double marcaRealizada) {
        this.marcaRealizada = marcaRealizada;
    }

    public categorias getCategoriasAtleta() {
        return categoriasAtleta;
    }

    public void setCategoriasAtleta(categorias categoriasAtleta) {
        this.categoriasAtleta = categoriasAtleta;
    }

    public boolean isAcabadoPrueba() {
        return AcabadoPrueba;
    }

    public void setAcabadoPrueba(boolean acabadoPrueba) {
        AcabadoPrueba = acabadoPrueba;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public int compareTo(atleta o) {
        if (this.getMarcaRealizada() < o.getMarcaRealizada()){
            return -1;
        }else if(this.getMarcaRealizada() > o.getMarcaRealizada()){
            return 1;
        }
        return 0;
    }

    public enum categorias{
        SENIOR,
        JUNIOR,
        VETERANO
    }
}
