package U5.T2.Actividad3;

public class triangulo extends poligonoRegular implements Comparable{
    private int altura;

    public triangulo(int lado, colores color, int altura) {
        super(lado, color);
        this.altura = altura;
        setContadorPoligonos(getContadorPoligonos()+1);
    }

    public triangulo() {
        super(10, colores.AZUL);
        this.altura = 10;
        setContadorPoligonos(getContadorPoligonos()+1);
    }

    @Override
    public void getArea() {
        int area = (lado*altura)/2;
        System.out.println("La area del triangulo es: "+area);
    }

    @Override
    public int compareTo(Object o) {
        triangulo that = (triangulo) o;
        if (this.lado < that.lado){
            return -1;
        }else if(this.lado > that.lado){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "triangulo{" +
                "lado=" + lado +
                ", color=" + color +
                ", altura=" + altura +
                '}';
    }
}
