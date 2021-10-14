package U1.Prueba;

public class letraA {
    public static void main(String[] args) {
        int altura = 7;

        for (int i = 0; i < altura*2; i++) {
            for (int j = 0; j <= altura*2; j++) {
                if ((j == altura) && ( i == 0)){
                    System.out.print("*");
                }else if(j == altura -i){
                    System.out.print("*");
                }else if(j == altura + i){
                    System.out.print("*");
                }else if((i == altura/2) && (j > altura-i) && (j < altura +i)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
