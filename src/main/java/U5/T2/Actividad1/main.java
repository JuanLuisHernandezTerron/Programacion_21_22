package U5.T2.Actividad1;

public class main {
    public static void main(String[] args) {
        /*TABLA*/
        pilaTabla pila1 = new pilaTabla();
        pila1.apilar(5);
        pila1.apilar(6);
        pila1.apilar(7);
        pila1.apilar(7);
        pila1.apilar(9);
        pila1.apilar(2);
        System.out.println(pila1);
        pila1.desaPilar();
        pila1.desaPilar();
        pila1.desaPilar();
        System.out.println(pila1);

        /*Lista*/
    }
}
