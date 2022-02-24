package U5.U4U5_Entregable;

import java.util.Arrays;


public class Serie extends multimedia implements Reproducible{
    private String creadorSerie;
    private int numeroTemporadas;
    private String [] arrayCapitulos = new String[0];
    private int contadorCapitulos =0;

    public Serie(String titulo,int ano_publicacion,String creadorSerie,int numeroTemporadas) {
        super(titulo, ano_publicacion);
        this.creadorSerie = creadorSerie;
        this.numeroTemporadas = numeroTemporadas;
    }

    public void add_capitulo(String capitulo){
        arrayCapitulos = Arrays.copyOf(arrayCapitulos,arrayCapitulos.length+1);
        arrayCapitulos[contadorCapitulos++] = capitulo;
    }

    public boolean eliminar_capitulo(String capitulo){
        String [] arrayAUX = new String[0];
        int contadorAUX = 0;
        contadorCapitulos--;
        boolean NoCapitulo = false;

        for (int i = 0; i < arrayCapitulos.length; i++) {
            if (!arrayCapitulos[i].equals(capitulo)){
                arrayAUX = Arrays.copyOf(arrayAUX,arrayAUX.length+1);
                arrayAUX[contadorAUX++] = arrayCapitulos[i];
            }
        }
        contadorAUX=0;
        arrayCapitulos = Arrays.copyOf(arrayAUX,arrayAUX.length);
        for (int i = 0; i < arrayAUX.length; i++) {
            arrayCapitulos[i] = arrayAUX[i];
            if (arrayAUX[i].equalsIgnoreCase(capitulo)){
                contadorAUX++;
            }
        }
        if (contadorAUX  == 0){
            NoCapitulo = true;
        }

        return NoCapitulo;
    }

    public void mostrarArrayCapitulos(){
        for (int i = 0; i < arrayCapitulos.length; i++) {
            System.out.println(arrayCapitulos[i]);
        }
    }

    public String getArrayCapitulosAleatorios() {
        int numeroRandom= (int) (Math.random()*arrayCapitulos.length);
        return arrayCapitulos[numeroRandom];
    }


    @Override
    public void dar_por_finalizado() {
        System.out.println("Se da por finalizado la serie "+this.getTitulo());
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo la serie "+this.getTitulo() + "Y el capitulo "+getArrayCapitulosAleatorios());
    }

    @Override
    public void pause() {
        System.out.println("Pausando la serie "+this.getTitulo() + "Y el capitulo"+getArrayCapitulosAleatorios());
    }

    @Override
    public void stop() {
        System.out.println("Pausando serie "+this.getTitulo()+", capítulo "+getArrayCapitulosAleatorios());
    }

    @Override
    public String toString() {
        return "Serie{" +
                super.toString()+
                "creadorSerie='" + creadorSerie + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", arrayCapitulos=" + Arrays.toString(arrayCapitulos) +
                ", contadorCapitulos=" + contadorCapitulos +
                '}'+"\n";
    }

    public String getCreadorSerie() {
        return creadorSerie;
    }

    public void setCreadorSerie(String creadorSerie) {
        this.creadorSerie = creadorSerie;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String[] getArrayCapitulos() {
        return arrayCapitulos;
    }

    public void setArrayCapitulos(String[] arrayCapitulos) {
        this.arrayCapitulos = arrayCapitulos;
    }


    public int getContadorCapitulos() {
        return contadorCapitulos;
    }

    public void setContadorCapitulos(int contadorCapitulos) {
        this.contadorCapitulos = contadorCapitulos;
    }
}
