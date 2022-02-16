package U5.T2.Actividad3;

public abstract class poligonoRegular implements figura{
    protected int lado;
    public colores color;
    private static int contadorPoligonos = 0;

    public poligonoRegular(int lado, colores color){
        this.lado = lado;
        this.color = color;
    }

    public enum colores{
        AZUL,
        ROJO,
        VERDE,
        AMARILLO;
    }
    @Override
    public abstract void getArea();

    public static int getContadorPoligonos() {
        return contadorPoligonos;
    }

    public static void setContadorPoligonos(int contadorPoligonos) {
        poligonoRegular.contadorPoligonos = contadorPoligonos;
    }

    public colores getColor() {
        return color;
    }

}
