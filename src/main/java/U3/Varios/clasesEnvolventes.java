package U3.Varios;

public class clasesEnvolventes {
    public static void main(String[] args) {
     String frase = "hola pepito";
     int longitudFrase = frase.length();
     String espacio = " ";

        for (int i = 0; i < longitudFrase; i++) {
            char recorrerFrase = frase.charAt(i);
            int ascii = recorrerFrase;
            Character c1 = recorrerFrase;
                if (espacio.equalsIgnoreCase(String.valueOf(recorrerFrase))){
                    espacio = espacio + c1;
                }else{
                    System.out.println("El ascii de "+ recorrerFrase + " es "+ ascii);
                }
        }

    }
}
