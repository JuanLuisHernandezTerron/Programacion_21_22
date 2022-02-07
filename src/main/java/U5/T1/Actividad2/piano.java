package U5.T1.Actividad2;

public class piano extends instrumento {
    private int contadorNotas = 0;

    public piano(){
    }

    @Override
    public void add(notas nota1) {
        if (contadorNotas <= getArrayNotas().length){
            getArrayNotas()[contadorNotas++] = nota1;
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
