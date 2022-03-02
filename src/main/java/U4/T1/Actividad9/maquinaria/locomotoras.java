package U4.T1.Actividad9.maquinaria;
import U4.T1.Actividad9.personal.mecanicos;

import java.io.Serializable;

public class locomotoras implements Serializable {
    private String matricula;
    private int potenciaMotor;
    private int anoFabricacion;
    private mecanicos mecanico;

    public locomotoras(String matricula, int potenciaMotor, int anoFabricacion,mecanicos meca1){
        this.matricula = matricula;
        this.potenciaMotor = potenciaMotor;
        this.anoFabricacion = anoFabricacion;
        this.mecanico = meca1;
    }



    public String getMatricula() {
        return matricula;
    }
    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public mecanicos getMecanico() {
        return mecanico;
    }



    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public void setMecanico(mecanicos mecanico) {
        this.mecanico = mecanico;
    }

    @Override
    public String toString() {
        return "locomotoras{" +
                "matricula='" + matricula + '\'' +
                ", potenciaMotor=" + potenciaMotor +
                ", anoFabricacion=" + anoFabricacion +
                ", mecanico=" + mecanico +
                '}';
    }
}
