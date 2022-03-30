package U7.EjerciciosRepaso.EjercicioPreEntre;

public class main {
    public static void main(String[] args) {
        Coordenada c1 = new Coordenada(191,200);
        Medicion m1 = new Medicion(10,20,150);
        Medicion m2 = new Medicion(15,32,100);
        Medicion m3 = new Medicion(17,32,97);
        Medicion m4 = new Medicion(22,42,78);
        Medicion m5 = new Medicion(33,52,170);
        Medicion m6 = new Medicion(35,42,170);
        EstacionMeteorologica e2 = new EstacionMeteorologica(c1);
        e2.addMedicion(m1);
        e2.addMedicion(m2);
        e2.addMedicion(m3);
        e2.addMedicion(m4);
        e2.addMedicion(m5);
        e2.mostrarLista();
        System.out.println(e2.buscaMedicion(m2));
        System.out.println(e2.buscaMedicion(m6));
        e2.ordenarHumedadDESC();
        System.out.println();
        e2.ordenarTemperaturaASC();
        e2.guardarFichero("src/main/java/U7/EjerciciosRepaso/EjercicioPreEntre/datos.dat");

        EstacionMeteorologica e1 = new EstacionMeteorologica(c1,"src/main/java/U7/EjerciciosRepaso/EjercicioPreEntre/datos.dat");
        e1.mostrarLista();
    }
}
