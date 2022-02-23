package U5.EjerciciosRepaso.Examen19_20;

import java.util.Arrays;

public class Minecraft{
    private static int contadorMaterial=0;
    private  material [] arrayMateriales = new material[0];

    private int contadorArrayAUX = 0;

    public void meterMaterial(material materialAUX){
            if (contadorMaterial !=11){
                arrayMateriales = Arrays.copyOf(arrayMateriales,arrayMateriales.length+1);
                arrayMateriales[contadorMaterial++]=materialAUX;
            }else{
                System.out.println("El array esta lleno");
            }
    }

    public void ultimoMaterialQueQueda(){
        int contadorSinMasa =0;
        for (int i = 0; i < arrayMateriales.length; i++) {
            if (arrayMateriales[i].getMasa() == 0){
                contadorSinMasa++;
            }
        }
        if (contadorSinMasa ==1){
            for (int i = 0; i < arrayMateriales.length; i++) {
                if (arrayMateriales[i].getMasa() == 0){
                    System.out.println(arrayMateriales[i].toString());
                }
            }
        }
    }

    public void borrarMaterialMasa(){
        material [] arrayAUXMat = new material[0];
        for (int i = 0; i < arrayMateriales.length; i++) {
            if (arrayMateriales[i].getMasa() != 0){
                arrayAUXMat=Arrays.copyOf(arrayAUXMat,arrayAUXMat.length+1);
                arrayAUXMat[contadorArrayAUX++]=arrayMateriales[i];
            }else{
                contadorMaterial--;
            }
        }
        arrayMateriales = Arrays.copyOf(arrayAUXMat,arrayAUXMat.length);
        for (int i = 0; i < arrayAUXMat.length; i++) {
            arrayMateriales[i] = arrayMateriales[i];
        }
    }


    public void mostrarEstado() {
        System.out.println(this); //Llama al toString de material.
    }

    public material [] devolverArray(){
        return arrayMateriales;
    }

}
