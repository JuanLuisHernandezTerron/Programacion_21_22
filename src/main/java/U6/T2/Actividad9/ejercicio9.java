package U6.T2.Actividad9;
import U4.T1.Actividad9.maquinaria.locomotoras;
import U4.T1.Actividad9.maquinaria.trenes;
import U4.T1.Actividad9.personal.maquinista;
import U4.T1.Actividad9.personal.mecanicos;

import java.io.*;


public class ejercicio9 implements Serializable{
    public static void main(String[] args) {

        maquinista maqui1 = new maquinista("Pedro","1234567B",1500,"R1");
        mecanicos meca1 = new mecanicos("Jose",6302158, mecanicos.tipoEspecialidad.FRENOS);
        locomotoras loco1 = new locomotoras("126598NMD",500,2015,meca1);
        trenes tren1 = new trenes(loco1,maqui1);
        trenes tren2 = new trenes(loco1,maqui1);
        trenes tren3 = new trenes(loco1,maqui1);

        try{
            ObjectOutputStream fichero=new ObjectOutputStream(new FileOutputStream("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U6/T2/Actividad9/trenesBinario.dat",true));
            fichero.writeObject(tren1);
            fichero.writeObject(tren2);
            fichero.writeObject(tren3);
            fichero.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }

        try{
            ObjectInputStream fichero1 = new ObjectInputStream(new FileInputStream("/home/juanlu/Escritorio/Programacion_21_22/src/main/java/U6/T2/Actividad9/trenesBinario.dat"));
            trenes trn1 = (trenes) fichero1.readObject();
            while (true){
                System.out.println(trn1);
                trn1 = (trenes) fichero1.readObject();
            }
        }catch (IOException | ClassNotFoundException ex){
            System.out.println("Fin fichero");
        }
    }
}
