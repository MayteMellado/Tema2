package TestClasesObjetos;

import EntradaSalida.Tools;
import TDA.Autor;
import TDA.Libros;

public class TestAutor {
    public static void main(String[] args) {
        
        String Libro="", aux2="";
        byte res=0;
        Libros aux=new Libros();
        
        do{
        Libros objeto=new Libros ();
        Autor ax=new Autor();
        
        objeto.setTitulo(Tools.leerString("Titulo:"));
        ax.setNomAutor(Tools.leerString("Nombre: "));
        ax.setApellidoAutor(Tools.leerString("Apellido: "));
        objeto.setAutor(ax);
        objeto.setIsbn(Tools.leerInt("ISBN:"));
        objeto.setNoPaginas(Tools.leerInt("No.Pag"));
        Libro+="Datos Capturados:\n"+objeto.toString();
        
        byte menor=3;
        if(objeto.getNoPaginas()<menor){
            menor=(byte) objeto.getNoPaginas();
            aux=objeto;
            aux2+="Datos Capturados:\n"+aux.toString();
        }
        res=(byte)Tools.seguirSino();
        }while (res!=1);
          
        Tools.imprimePantalla("Libro\n"+Libro.toString());
        Tools.imprimePantalla("Libro\n"+aux2.toString());
    }
    
    
}
