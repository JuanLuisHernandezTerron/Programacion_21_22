package U7.U6U7_Entregable;

import java.io.Serializable;

public class fiat extends divisa implements Serializable {
    private String paisReferencia;
    public fiat(String nombre, String simboloDivisa, String paisReferencia) {
        super(nombre, simboloDivisa);
        setPaisReferencia(paisReferencia);
    }

    public String getPaisReferencia() {
        return paisReferencia;
    }

    public void setPaisReferencia(String paisReferencia) {
        this.paisReferencia = paisReferencia;
    }
}
