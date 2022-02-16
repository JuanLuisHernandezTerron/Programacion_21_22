package U5.T2.Actividad3;

public class circulo extends poligonoRegular{
    private int radio;

    public circulo(int lado, colores color, int radio) {
        super(lado, color);
        this.radio = radio;
    }

    public circulo() {
        super(10, colores.AZUL);
        this.radio = 10;
    }

    @Override
    public void getArea() {
        int area = (int) (Math.PI*(radio*2));
        System.out.println("El area del circulo es:"+area);
    }

    @Override
    public String toString() {
        return "circulo{" +
                "radio=" + radio +
                ", lado=" + lado +
                ", color=" + color +
                '}';
    }
}
