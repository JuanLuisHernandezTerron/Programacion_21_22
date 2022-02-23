package U5.EjerciciosRepaso.Examen19_20;

public class main {
    public static void main(String[] args) {
        Minecraft mine1 = new Minecraft();
        Cristal cr1 = new Cristal("cristal",15,12,8,true, Cristal.tipoCristal.TRANSLUCIDO);
        Cristal cr2 = new Cristal("cristal",1001,12,8,true, Cristal.tipoCristal.TRANSLUCIDO);
        Cristal cr3 = new Cristal("cristal",11,12,8,true, Cristal.tipoCristal.TRANSLUCIDO);
        Cristal cr4 = new Cristal("cristal",13,12,8,true, Cristal.tipoCristal.TRANSLUCIDO);

        mine1.meterMaterial(cr1);
        mine1.meterMaterial(cr2);
        mine1.meterMaterial(cr3);
        mine1.meterMaterial(cr4);
        mine1.borrarMaterialMasa();
        mine1.getArrayMateriales();
    }
}
