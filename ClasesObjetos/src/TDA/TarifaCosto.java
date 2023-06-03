package TDA;

public class TarifaCosto {
    public static double tarifa(byte DiasRenta, String TipoAuto){
        int tarifa=0;
        if(TipoAuto.equalsIgnoreCase("chico"))
            tarifa=200;
        else
            if(TipoAuto.equalsIgnoreCase("mediano"))
                tarifa = 350;
                else
                    if(TipoAuto.equalsIgnoreCase("grande"))
                        tarifa = 450;
        tarifa*=DiasRenta;

        return tarifa;
    }

    public static double calcularCosto(double tarifa, double kmRecorridos, String TipoAuto){
        double extra = 0;
        double kms=0;
        if(kmRecorridos>10)
            extra = 2.5;

        if(TipoAuto.equalsIgnoreCase("chico"))
            kms = kmRecorridos*20;
        else
            if(TipoAuto.equalsIgnoreCase("mediano"))
                kms = kmRecorridos*30;
            else
                if(TipoAuto.equalsIgnoreCase("grande"))
                    kms = kmRecorridos*40;

        double Costo = tarifa + (tarifa*extra) + kms;

        return Costo;

    }
    
}


