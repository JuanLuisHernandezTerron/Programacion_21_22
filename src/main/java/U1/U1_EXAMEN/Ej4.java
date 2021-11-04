package U1.U1_EXAMEN;

import java.util.Scanner;

//La tienda Carbonita Volando vende figuras personalizadas mediante impresión 3D.
// Lo hace mediante un configurador online que permite calcular el precio de cada figura
// dependiendo del peso total, del tipo de material (ABS, PLA, Madera, flexible, etc.) y de si se
// pide un posprocesado de la figura o no. Las tarifas son las siguientes:
//
//0.2 céntimos por gramo si se hace con ABS
//0.3 céntimos por gramo si se hace con PLA
//0.5 céntimos por gramo si se hace con Madera
//0.7 céntimos por gramo si se hace con material flexible
//Aplicar una posprocesado, implica incrementar el coste total de la figura en 3 euros adicionales,
// independientemente del material y del tamaño de la figura.
//
//Si se pertenece al programa de fidelización Enjuto3D Premium, no se cobran los gastos de envío
// que son de 2 euros.
//
//Elabora un programa que pregunte por los datos necesarios y calcule el coste total de la figura.
//
//Ejemplo 1:
//
//Bienvenido a Carbonita Volando
//Introduzca el peso de su figura en gramos: 345
//Introduzca el tipo de material (1=ABS, 2=PLA, 3=Madera, 4=Flexible): 3
//¿Quiere posprocesado? (1=si, 2=no): 1
//¿Pertenece a Enjuto3D Premium? (1=si, 2=no): 1
//
//El coste total de la pieza es: 175.5 €
public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a Carbonita Volando");
        System.out.println("Introduzca el peso de su figura en gramos: ");
        double peso_figura = teclado.nextDouble();
        System.out.println("Introduzca el tipo de material (1=ABS, 2=PLA, 3=Madera, 4=Flexible): ");
        int tipo_material = teclado.nextInt();
        System.out.println("¿Quiere posprocesado? (1=si, 2=no): ");
        int pospocesado = teclado.nextInt();
        System.out.println("¿Pertenece a Enjuto3D Premium? (1=si, 2=no): ");
        int perteneciente = teclado.nextInt();

        double abs = 0.20;
        double pla = 0.30;
        double madera = 0.50;
        double material_flexible = 0.70;
        double precio_final = 0;
        double precio_envio = 2.00;


        switch (tipo_material){
            case 1:
                    precio_final = peso_figura * abs;
                        if (pospocesado == 1){
                                precio_final = precio_final + 3.00;
                        }else if (perteneciente == 2){
                            precio_final = precio_final + precio_envio;
                        }
                        System.out.println("El precio final de la figura sería: "+precio_final+"€");
                break;
            case 2:
                    precio_final = pla * peso_figura;
                    if (pospocesado == 1){
                        precio_final = precio_final + 3.00;
                    }else if (perteneciente == 2){
                        precio_final = precio_final + precio_envio;
                    }
                    System.out.println("El precio final de la figura sería: "+precio_final+"€");
                break;
            case 3:
                precio_final = peso_figura * madera;
                if (pospocesado == 1){
                    precio_final = precio_final +3.00;
                }else if (perteneciente == 2){
                    precio_final = precio_final + precio_envio;
                }
                System.out.println("El precio final de la figura sería: "+precio_final+"€");
                break;
            case 4:
                precio_final = peso_figura * material_flexible;
                if (pospocesado == 1){
                    precio_final = precio_final + 3.00;
                }else if (perteneciente == 2){
                    precio_final = precio_final + precio_envio;
                }
                System.out.println("El precio final de la figura sería: "+precio_final+"€");
                break;
        }
    }
}
