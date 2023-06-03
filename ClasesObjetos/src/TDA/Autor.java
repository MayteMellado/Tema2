package TDA;

public class Autor {
    
    private String nomAutor;
    private String apellidoAutor;
    
    //Constructor vacio
    public Autor(){}
    //Contructor parametrizado 

    public Autor(String nomAutor, String apellidoAutor) {
        this.nomAutor = nomAutor;
        this.apellidoAutor = apellidoAutor;
    }

    public String getNomAutor() {
        return nomAutor;
    }

    public void setNomAutor(String nomAutor) {
        this.nomAutor = nomAutor;
    }

    public String getApellidoAutor() {
        return apellidoAutor;
    }

    public void setApellidoAutor(String apellidoAutor) {
        this.apellidoAutor = apellidoAutor;
    }
      @Override
    public String toString() {
        return "Autor [" + "Nombre: " + nomAutor + ", Apelido: " + apellidoAutor +  ']';
    }
}
