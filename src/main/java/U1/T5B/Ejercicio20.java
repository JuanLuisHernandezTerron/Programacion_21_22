package U1.T5B;
// Escribe un programa que calcule el precio final de un producto según su base imponible (precio
// antes de impuestos), el tipo de IVA aplicado (general, reducido o superreducido) y el código
// promocional. Los tipos de IVA general, reducido y superreducido son del 21%, 10% y 4%
// respectivamente. Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
// respectivamente que no se aplica promoción, el precio se reduce a la mitad, se descuentan 5 euros
// o se descuenta el 5%. El ejercicio se da por bueno si se muestran los valores correctos, aunque
// los números no estén  tabulados.
//
//
// Ejemplo:
// Introduzca la base imponible: 25
// Introduzca el tipo de IVA (general, reducido o superreducido): reducido
// Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
// Base imponible


// IVA (10%)
// Precio con IVA
// 25.00
// 2.50
// 27.50
// Cód. promo. (mitad): -13.75
// TOTAL
// 13.75
import java.util.Scanner;

public class Ejercicio20 {
  public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la base imponible: ");
        double baseImponible = teclado.nextDouble();

        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String tipoIVA = teclado.next();

        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codigoPromo = teclado.next();

        double ivaGeneral = (baseImponible) * 0.21;
        double ivaReducido = (baseImponible) * 0.10;
        double sumaIva = ivaGeneral + baseImponible;
        double sumaGeneral = ivaReducido + baseImponible;
        double ivaSuperreducido = (baseImponible) * 0.04;

        if ((tipoIVA.equals("general")) && (codigoPromo.equals("nopro"))){
            System.out.println("La base imponible es: "+baseImponible);
            System.out.println("La suma con IVA incluido y sin promocion sería: "+sumaIva);
        } else if ((tipoIVA.equals("general")) && (codigoPromo.equals("mitad"))){
            System.out.println("La base imponible es: "+baseImponible);
            System.out.println("La suma con IVA incluido y con promocion de mitad sería: "+sumaIva /2);
        }else if ((tipoIVA.equals("general")) && (codigoPromo.equals("meno5"))){
            System.out.println("La base imponible es: "+baseImponible);
            System.out.println("La suma con IVA incluido y con promocion de 5 euros de descuento sería: "+(sumaIva - 5));
        }else if((tipoIVA.equals("general")) && (codigoPromo.equals("5porc"))){
            System.out.println("La base imponible es: "+baseImponible);
            System.out.println("La suma con IVA incluido y con promocion de 5 euros de descuento sería: "+sumaIva * 0.5);
        }

      if ((tipoIVA.equals("reducido")) && (codigoPromo.equals("nopro"))){
          System.out.println("La base imponible es: "+baseImponible);
          System.out.println("La suma con IVA incluido y sin promocion sería: "+sumaGeneral);
      } else if ((tipoIVA.equals("reducido")) && (codigoPromo.equals("mitad"))){
          System.out.println("La base imponible es: "+baseImponible);
          System.out.println("La suma con IVA incluido y con promocion de mitad sería: "+sumaGeneral /2);
      }else if ((tipoIVA.equals("reducido")) && (codigoPromo.equals("meno5"))){
          System.out.println("La base imponible es: "+baseImponible);
          System.out.println("La suma con IVA incluido y con promocion de 5 euros de descuento sería: "+(sumaGeneral - 5));
      }else if((tipoIVA.equals("reducido")) && (codigoPromo.equals("5porc"))){
          System.out.println("La base imponible es: "+baseImponible);
          System.out.println("La suma con IVA incluido y con promocion de 5 euros de descuento sería: "+sumaGeneral * 0.5);
      }

      if ((tipoIVA.equals("superreducido")) && (codigoPromo.equals("nopro"))){
          System.out.println("La base imponible es: "+baseImponible);
          System.out.println("La suma con IVA incluido y sin promocion sería: "+ivaSuperreducido);
      } else if ((tipoIVA.equals("superreducido")) && (codigoPromo.equals("mitad"))){
          System.out.println("La base imponible es: "+baseImponible);
          System.out.println("La suma con IVA incluido y con promocion de mitad sería: "+ivaSuperreducido /2);
      }else if ((tipoIVA.equals("superreducido")) && (codigoPromo.equals("meno5"))){
          System.out.println("La base imponible es: "+baseImponible);
          System.out.println("La suma con IVA incluido y con promocion de 5 euros de descuento sería: "+(ivaSuperreducido - 5));
      }else if((tipoIVA.equals("superreducido")) && (codigoPromo.equals("5porc"))){
          System.out.println("La base imponible es: "+baseImponible);
          System.out.println("La suma con IVA incluido y con promocion de 5 euros de descuento sería: "+ivaSuperreducido * 0.5);
      }
  }
}
