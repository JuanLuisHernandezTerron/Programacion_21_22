package U1.Prueba;

public class rombo {
    public static void main(String[] args) {
        String palabraRandom = "pepito";
        String palabraInversa = "";
        int longitudPalabra = palabraRandom.length();
        for (int i = longitudPalabra-1; i >= 0; i--) {
            palabraInversa = palabraInversa.concat(String.valueOf(palabraRandom.charAt(i)));
        }

        for (int i = 0; i < longitudPalabra * 2; i++) {
            for (int j = 0; j < longitudPalabra * 2; j++) {
                if (j == longitudPalabra - i) {
                    System.out.print(palabraRandom.substring(0, i));
                }else if (i == longitudPalabra + j){
                    System.out.print(palabraRandom.substring(0, 6));
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
