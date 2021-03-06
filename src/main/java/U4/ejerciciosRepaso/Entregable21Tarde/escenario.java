package U4.ejerciciosRepaso.Entregable21Tarde;

import java.util.Arrays;

public class escenario {
    private int altura;
    private int longitud;
    private int numeroAnillos;
    private int gemas;
    private int contadorEnemigos =0;

    private enemigo.tipoEnemigo [] arrayTiposEnemigos = new enemigo.tipoEnemigo[5];
    private enemigo [] arrayEnemigo = new enemigo[0];
    public escenario(enemigo.tipoEnemigo[] arrayTipo){
        this.arrayTiposEnemigos = arrayTipo;
        this.altura=100;
        this.longitud=100;
        this.numeroAnillos=500;
        this.gemas=2;
    }

    public void generarEnemigos(){
        int numeroAleatorioEspacios = (int) (0+Math.random()*arrayTiposEnemigos.length);

        if (arrayEnemigo.length <=10) {
            arrayEnemigo = Arrays.copyOf(arrayEnemigo, arrayEnemigo.length + 1);
            enemigo.tipoEnemigo enemigoTipoAUX = arrayTiposEnemigos[numeroAleatorioEspacios];
            enemigo enemigoAUX = new enemigo(enemigoTipoAUX);
            arrayEnemigo[contadorEnemigos++] = enemigoAUX;
        }
    }
    public void eliminarEnemigos(int posicionEliminar){ //Este metodo sirve para avanzar las casillas a la izquierda y eliminar la ultima
        for (int i = 0; i < arrayEnemigo.length-1; i++) {
            if ( i >= posicionEliminar){
                arrayEnemigo[i] = arrayEnemigo[i+1];
            }
        }
        arrayEnemigo = Arrays.copyOf(arrayEnemigo,arrayEnemigo.length-1);
    }

    public void getInformacionEscenario(){
        System.out.println("La altura del escenario es:"+getAltura());
        System.out.println("La longintud del escenario es: "+getLongitud());
        System.out.println("El escenario tiene "+getNumeroAnillos()+" anillos");
        System.out.println("El escenario tiene " + arrayTiposEnemigos.length + " de tipos de enemigos");
        getArrayInfoEnemigo();
    }

    public void getArrayTiposEnemigos() {
        for (int i = 0; i < arrayTiposEnemigos.length; i++) {
            System.out.println(arrayTiposEnemigos[i]);
        }
    }

    public void getArrayInfoEnemigo() {
        for (int i = 0; i < arrayEnemigo.length; i++) {
            System.out.println(arrayEnemigo[i].getEnemigoNombre());
        }
    }

    public int getContadorEnemigos() {
        return contadorEnemigos;
    }

    public void setContadorEnemigos(int contadorEnemigos) {
        this.contadorEnemigos = contadorEnemigos;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getNumeroAnillos() {
        return numeroAnillos;
    }

    public void setNumeroAnillos(int numeroAnillos) {
        this.numeroAnillos = numeroAnillos;
    }

    public int getGemas() {
        return gemas;
    }

    public void setGemas(int gemas) {
        this.gemas = gemas;
    }

}
