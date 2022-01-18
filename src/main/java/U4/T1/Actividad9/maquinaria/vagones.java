package U4.T1.Actividad9.maquinaria;

 class vagones {
     private final int capacidadMax;
     private int capacidadActu;
     private String tipoCarga;
     private locomotoras loco1;

    public vagones(int capacidadMax, int capacidadActu, String tipoCarga){
        this.capacidadMax = capacidadMax;
        this.capacidadActu = capacidadActu;
        this.tipoCarga = tipoCarga;
    }

     public void setCapacidadActu(int capacidadActu) {
         this.capacidadActu = capacidadActu;
     }

     public void setTipoCarga(String tipoCarga) {
         this.tipoCarga = tipoCarga;
     }
}
