package TDA;

public class RentaAutos {
    
    private String TipoAuto;
    private byte DiasRenta;
    private double kmRecorridos;
   
    //Constructor vacio
    public RentaAutos(){}
   
    //Contructor parametrizado
     public RentaAutos(String TipoAuto,byte DiasRenta,double kmRecorridos){
        
        this.TipoAuto=TipoAuto;
        this.DiasRenta = DiasRenta;
        this.kmRecorridos = kmRecorridos;
    }

    public int getDia() {
        return DiasRenta;
    }

    public void setDiasRenta(byte DiasRenta) {
        this.DiasRenta = DiasRenta;
    }

    public double getkmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos= kmRecorridos;
    }

    public String getTipoAuto() {
        return TipoAuto;
    }

    public void setTipoAuto (String TipoAuto) {
        this.TipoAuto = TipoAuto;
    }

}

     
