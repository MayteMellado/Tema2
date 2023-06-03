package TDA;

public class PesoIdealMayorEdad {
    public double pesoIdeal(double pesoPer,double alturaPer,double pesoIdeal){
        pesoIdeal=(pesoPer/(Math.pow(alturaPer, 2)));
        return pesoIdeal;
    }
    public double calcularMC(double pesoIdeal,double pesoId){
        
        if(pesoIdeal<20)
             pesoId=-1;
        else
            if(pesoIdeal>=20||pesoIdeal<=25)
                pesoId=0;
        else
                if(pesoIdeal>25)
             pesoId=1;
        return pesoId;
    }
}
