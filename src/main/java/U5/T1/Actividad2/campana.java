package U5.T1.Actividad2;

public class campana extends instrumento {
    private int contadorNotas = 0;
    public campana(){
    }

    @Override
    public void add(notas notasAUX) {
        if (contadorNotas <= getArrayNotas().length){
            getArrayNotas()[contadorNotas++] = notasAUX;
        }
    }

    @Override
    public void interpretar() {
        for (int i = 0; i < contadorNotas; i++) {
            System.out.println("La notas que vamos a tocar es:");
            System.out.println(getArrayNotas()[i]);
        }
    }
}
