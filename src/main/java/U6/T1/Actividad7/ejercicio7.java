package U6.T1.Actividad7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            BufferedReader out = new BufferedReader(new FileReader("C:\\Users\\juanlu\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\T1\\Actividad7\\more.txt"));
            String texto = "";
            boolean siRepetir = false;
            int contadorMore = 24;

            do {
                for (int i = 0; i < contadorMore; i++) {
                    texto = out.readLine();
                    System.out.println(texto);
                }
                System.out.println("Quieres ver mas?");
                String respuesta = teclado.next();
                if (respuesta.equalsIgnoreCase("si")){
                    siRepetir = true;
                }else{
                    siRepetir = false;
                }
            }while (siRepetir);
            out.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }

}
