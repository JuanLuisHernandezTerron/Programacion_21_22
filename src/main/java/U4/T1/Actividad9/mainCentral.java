package U4.T1.Actividad9;
import U4.T1.Actividad9.maquinaria.locomotoras;
import U4.T1.Actividad9.maquinaria.trenes;
import U4.T1.Actividad9.personal.mecanicos;
import U4.T1.Actividad9.personal.maquinista;


public class mainCentral {
    public static void main(String[] args) {
        mecanicos meca1 = new mecanicos("Andrés",236514782,"frenos");
        locomotoras loco1 = new locomotoras("2364BMD",200,2009,meca1);
        maquinista maq1 = new maquinista("PedroJosé","12365478A",1500,"Alto");
        trenes tren1 = new trenes(loco1,maq1);

        System.out.println(tren1.getPilotoLocomotora());

    }
}
