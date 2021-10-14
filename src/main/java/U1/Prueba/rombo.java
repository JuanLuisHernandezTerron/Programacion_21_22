package U1.Prueba;

public class rombo {
    public static void main(String[] args) {
        String palabraRandom = "pepito";
        String palabraInversa = "";
        int longitudPalabra = palabraRandom.length();
        for (int i = longitudPalabra-2; i >= 0; i--) {
            palabraInversa = palabraInversa.concat(String.valueOf(palabraRandom.charAt(i)));
        }
        int longitudPalabrainversa = palabraInversa.length();

        for (int i = 0; i < longitudPalabra * 2; i++) {
            for (int j = 0; j < longitudPalabra * 2; j++) {
                if (j == longitudPalabra - i) {
                    for (int k = 0; k < i; k++) {
                        System.out.print(palabraRandom.charAt(k));
                    }
                } else if (i == longitudPalabra + j) {
                    System.out.print(palabraRandom.substring(0, longitudPalabra - j));
                } else if (j == longitudPalabra){
                    for (int z = longitudPalabrainversa-i; z < longitudPalabrainversa; z++) {
                        System.out.print(palabraInversa.charAt(z));
                    }
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
