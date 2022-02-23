package U5.EjerciciosRepaso.Examen19_20;

import java.util.Arrays;

public class Minecraft {
    private static int contadorMaterial=0;

    private  material [] arrayMateriales = new material[0];

    public void meterMaterial(material materialAUX){
            if (contadorMaterial !=11){
                arrayMateriales = Arrays.copyOf(arrayMateriales,arrayMateriales.length+1);
                arrayMateriales[contadorMaterial++]=materialAUX;
            }else{
                System.out.println("El array esta lleno");
            }
    }

    public void borrarMaterialMasa(){
        for (int i = 0; i < arrayMateriales.length; i++) {
            if (arrayMateriales[i].getMasa() == 0){
                arrayMateriales[i]=arrayMateriales[i+1];
                arrayMateriales = Arrays.copyOf(arrayMateriales,arrayMateriales.length-1);
            }
        }
    }

    public void getArrayMateriales() {
        System.out.println(Arrays.toString(arrayMateriales));
    }

}
