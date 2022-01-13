package U4.T1;

public class texto {
    private int longitud_MAX;
    private String texto;

    public texto(String texto, int longitud_MAX){
        this.texto = texto;
        this.longitud_MAX = longitud_MAX;
    }

    public void introducirCaracter(char caracter, String posicion){
        int contadorLetras = 0;
        int contadorIntroducido = 0;
            if (this.texto.length() < this.longitud_MAX){
                if (posicion.equalsIgnoreCase("principio")){
                    this.texto = caracter + this.texto;
                    System.out.println(this.texto);
                }else if(posicion.equalsIgnoreCase("final")){
                    this.texto = this.texto + caracter;
                    System.out.println(this.texto);
                }
            }else{
                System.out.println("No ha sido posible");
            }
    }
    public void insertarCadena(String posicion,String cadena){
        if (this.texto.length() < this.longitud_MAX){
            if (posicion.equalsIgnoreCase("principio") && getTexto().length() + cadena.length() <= getLongitud_MAX()){
                this.texto = cadena + this.texto;
                System.out.println(getTexto());
            }else if(posicion.equalsIgnoreCase("final") && getTexto().length() + cadena.length() <= getLongitud_MAX()){
                this.texto = this.texto + cadena;
                System.out.println(getTexto());
            }else{
                System.out.println("Se pasa de largo");
            }
        }else{
            System.out.println("No ha sido posible");
        }
    }

    public int sacarVocales(){
    String vocales = "aeiouáéíóú";
    int contadorVocales = 0;
        for (int i = 0; i < vocales.length(); i++) {
            String recorrerVocales = String.valueOf(vocales.charAt(i));
            for (int j = 0; j < getTexto().length(); j++) {
                String recorrerFrase = String.valueOf(getTexto().charAt(j));
                if (recorrerFrase.equalsIgnoreCase(recorrerVocales)){
                    contadorVocales ++;
                }
            }
        }
    return contadorVocales;
    }

    public int getLongitud_MAX() {
        return longitud_MAX;
    }

    public String getTexto() {
        return texto;
    }
}
