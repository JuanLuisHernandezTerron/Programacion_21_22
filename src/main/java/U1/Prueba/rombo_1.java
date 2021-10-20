package U1.Prueba;

public class rombo_1 {
    public static void main(String[] args) {
        int altura = 6;

        for (int i = 1; i < altura; i++) {
            for (int j = 1; j <altura; j++) {
                if (j == altura/2+1 -i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
