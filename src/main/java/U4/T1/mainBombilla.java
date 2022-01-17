package U4.T1;
//Simplemente llamaremos a los metodos desde esta clase.
public class mainBombilla {
    public static void main(String[] args) {
        bombilla bomb1 = new bombilla(true);
        bombilla bomb2 = new bombilla(false);
        bombilla bomb3 = new bombilla(false);
        bombilla bomb4 = new bombilla(true);
        System.out.println(bomb1.isEstado());
        System.out.println(bomb2.isEstado());
        System.out.println(bomb3.isEstado());
        System.out.println(bomb4.isEstado());
        bombilla.apagon();

        System.out.println();
        System.out.println(bomb1.isEstado());
        System.out.println(bomb2.isEstado());
        System.out.println(bomb3.isEstado());
        System.out.println(bomb4.isEstado());

        System.out.println();
        bombilla.arreglado();

        System.out.println(bomb1.isEstado());
        System.out.println(bomb2.isEstado());
        System.out.println(bomb3.isEstado());
        System.out.println(bomb4.isEstado());
    }
}
