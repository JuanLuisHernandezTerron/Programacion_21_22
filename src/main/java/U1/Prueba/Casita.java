package U1.Prueba;
//CASA CON 10 DE ALTURA
public class Casita {
    public static void main(String[] args) {
        int altura = 15;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if ((i == 0) && (j == altura / 2)) {
                    System.out.print("*");
                }else if (j == altura/2-i) {
                    System.out.print("*");
                }else if(j == altura/2+i){
                    System.out.print("*");
                }else if(i == altura/2){
                    System.out.print("*");
                }else if((i >= altura/2) && (j == 0)){
                    System.out.print("*");
                }else if((i >= altura/2) && (j == altura -1)){
                    System.out.print("*");
                }else if (i == altura-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
