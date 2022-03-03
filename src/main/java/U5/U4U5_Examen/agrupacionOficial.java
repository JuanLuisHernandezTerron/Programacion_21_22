package U5.U4U5_Examen;

import java.util.Arrays;

public abstract class agrupacionOficial extends agrupacion{
    private int puntosObtenidos;
    private integrante [] integrantesArray = new integrante[0];
    private int contadorIntegrantes=0;
    public agrupacionOficial(String nombre, String autor, String autorMusica, String autorLetras, String tipo, int puntosObtenidos) {
        super(nombre, autor, autorMusica, autorLetras, tipo);
        this.puntosObtenidos = puntosObtenidos;
    }


    public void insertarIntegrante(integrante integranteAUX){
        integrantesArray = Arrays.copyOf(integrantesArray,integrantesArray.length+1);
        integrantesArray[contadorIntegrantes++] = integranteAUX;
    }

    public void mostrarArrayIntegrante(){
        for (int i = 0; i < integrantesArray.length; i++) {
            System.out.println(integrantesArray[i]);
        }
    }

    public abstract void caminito_del_falla();

    public boolean eliminarIntegrantes(integrante integranteAUX){
        int contadorArray=0;
        boolean es_borrado = false;
        contadorIntegrantes--;
        integrante [] arrayAUX = new integrante[0];
        for (int i = 0; i < integrantesArray.length; i++) {
            if (integrantesArray[i] != integranteAUX){
                arrayAUX = Arrays.copyOf(arrayAUX,arrayAUX.length+1);
                arrayAUX[contadorArray++]=integrantesArray[i];
            }
        }
        integrantesArray = Arrays.copyOf(arrayAUX,arrayAUX.length);
        contadorArray =0;
        for (int i = 0; i < arrayAUX.length; i++) {
            integrantesArray[i] = arrayAUX[i];
            if (arrayAUX[i] == integranteAUX){
                contadorArray++;
            }
        }

        if (contadorArray ==0){
            es_borrado = true;
        }

        return es_borrado;
    }

    public String nombreAgrupa(){
        return getNombre();
    }

    public int getPuntosObtenidos() {
        return puntosObtenidos;
    }

    @Override
    public String toString() {
        return "agrupacionOficial{" +
                "nombreAgrupacion"+super.getNombre()+
                " ,puntosObtenidos=" + puntosObtenidos +
                ", integrantesArray=" + Arrays.toString(integrantesArray) +
                ", contadorIntegrantes=" + contadorIntegrantes +
                '}';
    }

    public void setPuntosObtenidos(int puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }

    public integrante[] getIntegrantesArray() {
        return integrantesArray;
    }

    public void setIntegrantesArray(integrante[] integrantesArray) {
        this.integrantesArray = integrantesArray;
    }

    public int getContadorIntegrantes() {
        return contadorIntegrantes;
    }

    public void setContadorIntegrantes(int contadorIntegrantes) {
        this.contadorIntegrantes = contadorIntegrantes;
    }
}
