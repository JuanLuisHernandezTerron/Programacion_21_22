package U5.EjerciciosRepaso.HerenciasInterfaces2021;

public interface comportamientoCorrer {
    default void correr() {
        System.out.println("Voy a correr");
    }
}
