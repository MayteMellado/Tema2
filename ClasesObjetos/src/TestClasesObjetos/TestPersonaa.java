//Mayte Mellado Huerta
package TestClasesObjetos;

import EntradaSalida.Tools;
import TDA.Personaa;

public class TestPersonaa {
    public static void main(String[] args) {

        capturaObjetos();
    }

    public static void capturaObjetos(){
        String listado="";
        byte res=0;



        do{
            String esMayor ="";
            String MC = "";
            Personaa objeto=new Personaa(Tools.leerString("Nombre"),Tools.leerByte("edad"),Tools.leerChar("Masculino[M]\nFemenino[F]"),Tools.leerDouble("Peso"),Tools.leerDouble("Altura en metros"));

            if(objeto.esMayorDeEdad())
                esMayor=" Es mayor de edad.";
            else
                esMayor =" Es menor de edad";

            if(objeto.calcularMC()==-1)
                MC="Esta por debajo de su peso ideal";
            else
                if(objeto.calcularMC()==0)
                    MC="Esta en su peso Ideal";
                else
                    if(objeto.calcularMC()==1)
                        MC="Tiene sobrepeso";

            listado+="Primer Objeto:\n"+objeto.toString()+esMayor+"\n"+MC+"\n";

            
            objeto.calcularMC();
            Personaa objeto2= new Personaa(Tools.leerString("Nombre"),Tools.leerByte("edad"),Tools.leerChar("Masculino[M]\nFemenino[F]"));
            objeto2.setAlturaPer(Tools.leerDouble("Altura en metros"));
            objeto2.setPesoPer(Tools.leerDouble("peso"));

            if(objeto2.esMayorDeEdad())
                esMayor=" Es mayor de edad.";
            else
                esMayor =" Es menor de edad";

            if(objeto.calcularMC()==-1)
                MC="Esta por debajo de su peso ideal";
            else
            if(objeto.calcularMC()==0)
                MC="Esta en su peso Ideal";
            else
            if(objeto.calcularMC()==1)
                MC="Tiene sobrepeso";

            listado+="Segundo Objeto:\n" + objeto2.toString()+esMayor+"\n"+MC+"\n";

           
            /*
            objeto.setNomPer(Tools.leerString("Nombre"));
            objeto.setGeneper(Tools.leerChar("Masculino[M]\nFemenino[F]"));
            objeto.setEdadPers(Tools.leerByte("edad"));
            objeto.setPesoPer(Tools.leerDouble("Peso"));
            objeto.setAlturaPer(Tools.leerDouble("Altura"));

             */





            res=(byte)Tools.seguirSino();
        }while (res!=1);

        Tools.imprimePantalla(listado);





    }

}