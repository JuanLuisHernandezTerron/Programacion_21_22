package U5.EjerciciosRepaso.HerenciasInterfaces2021;

public class pais implements Comparable{
    private String nombrePais;
    private int numeroParticipantes;

    public pais(String nombrePais, int numeroParticipantes) {
        this.nombrePais = nombrePais;
        this.numeroParticipantes = numeroParticipantes;
    }

    @Override
    public String toString() {
        return "pais{" +
                "nombrePais='" + nombrePais + '\'' +
                ", numeroParticipantes=" + numeroParticipantes +
                '}';
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public int getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public void setNumeroParticipantes(int numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }

    @Override
    public int compareTo(Object o) {
        pais t1 = (pais) o;
        return t1.getNombrePais().compareTo(this.getNombrePais());
    }
}
