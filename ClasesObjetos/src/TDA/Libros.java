package TDA;

public class Libros {
    private String Titulo;
    private Autor autor;
    private int isbn;
    private int noPaginas;
    
    //Constructor vacio
    public Libros(){}
    //Contructor parametrizado 

    public Libros(String Titulo, Autor autor, int isbn, int noPaginas) {
        this.Titulo = Titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.noPaginas = noPaginas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNoPaginas() {
        return noPaginas;
    }

    public void setNoPaginas(int noPaginas) {
        this.noPaginas = noPaginas;
    }

    
    @Override
    public String toString() {
        return "Libros{" + "Titulo=" + Titulo + ", autor=" + autor + ", isbn=" + isbn + ", noPaginas=" + noPaginas + '}';
    }

    
}
