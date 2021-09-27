package U1.T8;
//Diseñar un programa que muestre el producto de los 10 primeros números impares.
public class Ejercicio7 {
    public static void main(String[] args) {
        int contadorImpar = 1;
        int productoImpares = 1;
        for (int i = 1; i < 20; i++) { //Recorre hasta el numero 20
            if (i % 2 != 0) { //Del for de arriba nos saca los que no tenga resto cero (los que no son divisibles) y para sacar el producto entero,
                productoImpares = productoImpares * i; // lo multiplicamos por la variable i.
            }
        }
        System.out.print(productoImpares);
    }
}
