package U4.T1;

public class texto {
    private int longitud_MAX;
    private char caracter;
    private String cadena;
    private String texto;


    public texto(String texto, int longitud_MAX,String cadena){
        this.texto = texto;
        this.longitud_MAX = longitud_MAX;
        this.cadena = cadena;
    }

    public void introducirCaracter(char caracter, int posicicionIntroducir){
        int contadorLetras = 0;
        int contadorIntroducido = 0;
        String textoNuevo = "";
            if (this.texto.length() < this.longitud_MAX){
                for (int i = 0; i < this.texto.length(); i++) {
                    contadorLetras++;
                    if (posicicionIntroducir <= contadorLetras && contadorIntroducido < 1) {
                        textoNuevo = textoNuevo + caracter;
                        contadorIntroducido++;
                    }
                    String recorrerFrase = String.valueOf(this.texto.charAt(i));
                    if (posicicionIntroducir > this.texto.length()) {
                        textoNuevo = textoNuevo + caracter;
                    }else if(posicicionIntroducir == contadorLetras){
                        textoNuevo = textoNuevo + caracter;
                    }else{
                        textoNuevo = textoNuevo + recorrerFrase;
                    }

                }
            }else{
                System.out.println("No ha sido posible");
            }
        System.out.println(textoNuevo);
    }

    public int getLongitud_MAX() {
        return longitud_MAX;
    }

    public char getCaracter() {
        return caracter;
    }

    public String getCadena() {
        return cadena;
    }

    public String getTexto() {
        return texto;
    }
}
