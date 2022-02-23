package U5.EjerciciosRepaso.Examen19_20;

public interface Minar {
    default void Hacer(material materialAUX){
        materialAUX.setMasa(materialAUX.getMasa()+100);
    }
    default void desHacer(material materialAUX){
        materialAUX.setMasa(materialAUX.getMasa()-100);
    }
}
