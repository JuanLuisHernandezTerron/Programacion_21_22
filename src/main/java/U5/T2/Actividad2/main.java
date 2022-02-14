package U5.T2.Actividad2;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        cliente c1 = new cliente("2956314A","Pedro",25,2500.0);
        cliente c2 = new cliente("2956314C","Andres",22,2520.0);
        cliente c3 = new cliente("2956217B","Jose",21,2000.0);
        cliente c4 = new cliente("2956314D","Chema",26,1090.0);
        cliente c5 = new cliente("2956314E","Joze luí",30,2500.0);
        c1.meterClientes(c2);
        c1.meterClientes(c3);
        c1.meterClientes(c4);
        c1.meterClientes(c5);

        Arrays.sort(c1.getArrayClientes(),new comparatorClientesNombre());

        System.out.println(c1);
    }
}
