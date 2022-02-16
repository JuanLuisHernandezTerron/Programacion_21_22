package U5.T2.Actividad3;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        poligonoRegular [] arrayPoligono = new poligonoRegular[5];

        circulo cir1 = new circulo(2, poligonoRegular.colores.AMARILLO,12);
        circulo cir2 = new circulo();
        triangulo tri1 = new triangulo();
        triangulo tri2 = new triangulo(10, poligonoRegular.colores.ROJO,3);
        triangulo tri3 = new triangulo(12, poligonoRegular.colores.VERDE,4);
        cuadrado cuadra1 = new cuadrado(4, poligonoRegular.colores.ROJO);
        cuadrado cuadra2 = new cuadrado();

        arrayPoligono[0] = cir1;
        arrayPoligono[1] = cir2;
        arrayPoligono[2] = tri1;
        arrayPoligono[3] = cuadra1;
        arrayPoligono[4] = cuadra2;

        System.out.println(Arrays.toString(arrayPoligono));
        System.out.println(poligonoRegular.getContadorPoligonos());

        triangulo [] arrayTrian = new triangulo[3];
        arrayTrian[0] = tri1;
        arrayTrian[1] = tri2;
        arrayTrian[2] = tri3;

        Arrays.sort(arrayTrian);
        System.out.println(Arrays.toString(arrayTrian));
        System.out.println("////////////");
        Arrays.sort(arrayTrian,new compararTriangulosColores());
        System.out.println(Arrays.toString(arrayTrian));
    }
}
