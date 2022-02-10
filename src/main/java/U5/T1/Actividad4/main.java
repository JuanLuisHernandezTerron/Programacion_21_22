package U5.T1.Actividad4;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        lavadora [] arrayAUX = new lavadora[3];
        electrodomestico [] arrayElec = new electrodomestico[10];

        lavadora lava1 = new lavadora(100, electrodomestico.color.GRIS, electrodomestico.consumoEne.A,100,50);
        lavadora lava2 = new lavadora(100,20);
        lavadora lava3 = new lavadora(120,20);

        television tele1 = new television(120, electrodomestico.color.NEGRO, electrodomestico.consumoEne.E,20,45,true);
        television tele2 = new television(150, electrodomestico.color.ROJO, electrodomestico.consumoEne.F,15,55,true);
        television tele3 = new television(120, electrodomestico.color.BLANCO, electrodomestico.consumoEne.B,20,30,false);
        arrayAUX[0] = lava1;
        arrayAUX[1] = lava2;
        arrayAUX[2] = lava3;
        //ARRAY ELECTRODOMESTICOS
        arrayElec[0] = lava1;
        arrayElec[1] = lava2;
        arrayElec[2] = lava3;
        arrayElec[3] = tele1;
        arrayElec[4] = tele2;
        arrayElec[5] = tele3;
        for (electrodomestico a: arrayElec) {
            System.out.println(a);
        }
        System.out.println("************************************");
        // ARRAY LAVADORA POR DEFECTO
        for (lavadora a: arrayAUX) {
            System.out.println(a);
        }
        System.out.println("---------------------");
        Arrays.sort(arrayAUX);
        // ARRAY LAVADORA ORDENADO POR CARGA
        for (lavadora a: arrayAUX) {
            System.out.println(a);
        }

        System.out.println("-------------------");
        // ARRAY LAVADORA ORDENADO POR PRECIO FINAL
        Arrays.sort(arrayAUX,new comparadorPrecioFinal());

        for (lavadora a: arrayAUX) {
            System.out.println(a);
        }

    }
}
