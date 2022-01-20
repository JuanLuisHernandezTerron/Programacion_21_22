package U4.T2;

import java.util.Arrays;

public class mainLista {
    public static void main(String[] args) {
    lista lis1 = new lista();

    lis1.insertarPrincipio(2);
    lis1.insertarPrincipio(4);
    lis1.insertarPrincipio(48);
    lis1.insertarPrincipio(5);

    System.out.println(Arrays.toString(lis1.getArray()));
    System.out.println(Arrays.toString(lis1.getArrayAux()));
    }
}
