package U5.EjerciciosRepaso.HerenciasInterfaces2021;

public interface comportamientoLuchar {
    default void luchar() {
        System.out.println("Voy a pelear!");
    }
}
