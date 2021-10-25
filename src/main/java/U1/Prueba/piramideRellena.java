package U1.Prueba;

public class piramideRellena {
    public static void main(String[] args) {
        int altura = 7;
        //Primero dibujarlo hueco y luego rellenarlo.
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura * 2; j++) {
                if ((j >= altura - i) && (j <= altura + i)) {
                    System.out.print("*");
                } else if (( i == altura-1) && (j > 0)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
