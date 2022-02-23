package U5.EjerciciosRepaso.Examen19_20;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Minecraft mine1 = new Minecraft();
        Cristal cr1 = new Cristal("cristal",15,12,8,true, Cristal.tipoCristal.TRANSLUCIDO);
        Cristal cr2 = new Cristal("cristal2",1001,12,8,true, Cristal.tipoCristal.TRANSLUCIDO);
        Cristal cr3 = new Cristal("cristal3",11,12,8,true, Cristal.tipoCristal.TRANSLUCIDO);
        Cristal cr4 = new Cristal("cristal4",13,12,8,true, Cristal.tipoCristal.TRANSLUCIDO);
        Metal mt1 = new Metal("metal1",15,22,2,true,true);

        mine1.meterMaterial(cr1);
        mine1.meterMaterial(cr2);
        mine1.meterMaterial(cr3);
        mine1.meterMaterial(cr4);
        mine1.borrarMaterialMasa();

        mine1.mostrarEstado();
        System.out.println("**************");
        Arrays.sort(mine1.devolverArray());
        mine1.mostrarEstado();
        Arrays.sort(mine1.devolverArray(),new ordenarDiluirse());

        cr1.MezclarConMaterial(mt1);



    }
}
