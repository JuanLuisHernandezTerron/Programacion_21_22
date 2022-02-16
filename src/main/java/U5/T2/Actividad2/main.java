package U5.T2.Actividad2;

import U5.T1.Actividad4.comparadorPrecioFinal;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        cliente [] arrayCliente = new cliente[5];

        cliente c1 = new cliente("2956314A","Pedro",25,2500.0);
        cliente c2 = new cliente("2956314C","Andres",22,2520.0);
        cliente c3 = new cliente("2956217B","Jose",21,2000.0);
        cliente c4 = new cliente("2956314D","Chema",26,1090.0);
        cliente c5 = new cliente("2956314E","Joze luí",30,2500.0);

       arrayCliente[0] = c1;
       arrayCliente[1] = c2;
       arrayCliente[2] = c3;
       arrayCliente[3] = c4;
       arrayCliente[4] = c5;
            //Cada vez que lo ordenemos, poner un sout para mostrar, ya que lo pisa si ponemos dos sort seguidos.
        Arrays.sort(arrayCliente,new comparatorClientesNombre());
        System.out.println(Arrays.toString(arrayCliente));
        System.out.println("/////////////////////////////////");
        Arrays.sort(arrayCliente,new comparatorClientesDNI());
        System.out.println(Arrays.toString(arrayCliente));
        System.out.println("///////////////////////////////");
        Arrays.sort(arrayCliente,new comparadorClientesEdad());
        System.out.println(Arrays.toString(arrayCliente));
    }
}
