package TestClasesObjetos;

import EntradaSalida.Tools;
import TDA.Fecha;
import TDA.Persona;



public class TestPersona {
    
    public static void main(String[] args) {
        
        capturaObjetos();
    }
    
    public static void capturaObjetos(){
        String listado="";
        byte res=0;
        byte contMasculino=0,contFemenino=0;
        Persona aux=new Persona();
        
        
        do{
        Persona objeto=new Persona ();
        
        objeto.setNomPer(Tools.leerString("Nombre"));
        objeto.setEdadPers(Tools.leerByte("Edad"));
        objeto.setNacioPer(Tools.leerString("Nacionalidad"));
        objeto.setTelPers(Tools.leerLong("Numero de Telefono"));
        objeto.setGeneper(Tools.leerChar("Genero [M]asculino o [F]emenino"));
        objeto.setFechper(new Fecha(Tools.leerByte("Dia"),Tools.leerByte("Mes"),Tools.leerShort("Año")));
        listado+="Datos Capturados:\n"+objeto.toString()+"\n";
        
        
        if(objeto.getGeneper()=='M'||objeto.getGeneper()=='m')
            contMasculino++;
        else
            if(objeto.getGeneper()=='F'||objeto.getGeneper()=='f')
                contFemenino++;
        
        
        byte mayor=0;
        if(objeto.getEdadPers()>mayor){
            mayor=objeto.getEdadPers();
            aux=objeto;
        
        }
        res=(byte)Tools.seguirSino();
        }while (res!=1);
        
        float Total=contMasculino+contFemenino;
        Tools.imprimePantalla("AGENDA\n"+listado+"\nFrecuencia\n"+((100*contMasculino)/Total)+"\nMasculino"+Tools.imprimeFrecuencia(contMasculino)+"\n"+((100*contFemenino)/Total)+"\nFemenino"+Tools.imprimeFrecuencia(contFemenino)+"\nLa persona que tiene mayor edad: \n"+aux.toString());
        
        
    } 
   
   
    
}
