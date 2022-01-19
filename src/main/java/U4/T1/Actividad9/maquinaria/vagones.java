package U4.T1.Actividad9.maquinaria;

class vagones {
     private final int capacidadMax;
     private int capacidadActu;
     private carga tipoCarga;
     private locomotoras loco1;

     public vagones(int capacidadMax, int capacidadActu, carga tipoCarga){
        this.capacidadMax = capacidadMax;
        this.capacidadActu = capacidadActu;
        this.tipoCarga = tipoCarga;
    }

    public enum carga{
         CRISTAL,
        HIERRO,
        CHATARRA,
        GRANOSMAIZ,
        ARENA,
        TIERRA
    }

     public void setCapacidadActu(int capacidadActu) {
         this.capacidadActu = capacidadActu;
     }
     public void setLoco1(locomotoras loco1) {
         this.loco1 = loco1;
     }

     public void setTipoCarga(String tipoCarga) {
         this.tipoCarga = carga.valueOf(tipoCarga);
     }

     public int getCapacidadMax() {
         return capacidadMax;
     }

     public int getCapacidadActu() {
         return capacidadActu;
     }
    public void informacionVagoness(){
        System.out.println("La carga máxima "+capacidadMax+" La carga actual es "+capacidadActu+ " el tipo de caga es "+tipoCarga);
    }
     public carga getTipoCarga() {
         return tipoCarga;
     }

     public locomotoras getLoco1() {
         return loco1;
     }
 }
