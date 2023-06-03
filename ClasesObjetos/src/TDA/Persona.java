package TDA;

public class Persona {
  // Atributos
    private String nomPer;
    private long telPers;
    private byte edadPers;
    private String nacioPer;
    private Fecha fechper;
    private char geneper;
    //Constructor vacio
    public Persona(){}
    //Contructor parametrizado 

    public Persona(String nomPer,long telPers,byte edadPers,String nacioPer,Fecha fechper,char geneper){
        this.nomPer=nomPer;
        this.telPers=telPers;
        this.edadPers=edadPers;
        this.fechper=fechper;
        this.geneper=geneper;
        this.nacioPer=nacioPer;
        
    }
    public String getNomPer() {
        return nomPer;
    }

    public void setNomPer(String nomPer) {
        this.nomPer = nomPer;
    }

    public long getTelPers() {
        return telPers;
    }

    public void setTelPers(long telPers) {
        this.telPers = telPers;
    }

    public byte getEdadPers() {
        return edadPers;
    }

    public void setEdadPers(byte edadPers) {
        this.edadPers = edadPers;
    }

    public String getNacioPer() {
        return nacioPer;
    }

    public void setNacioPer(String nacioPer) {
        this.nacioPer = nacioPer;
    }

    public Fecha getFechper() {
        return fechper;
    }

    public void setFechper(Fecha fechper) {
        this.fechper = fechper;
    }

    public char getGeneper() {
        return geneper;
    }

    public void setGeneper(char geneper) {
        this.geneper = geneper;
    }

    @Override
    public String toString() {
        return "Persona [" + "Nombre: " + nomPer + ", Telefono: " + telPers + ", Edad: " + edadPers + ", Nacionalidad: " + nacioPer + ", Fecha de Cumpleaños: " + fechper + ", Genero: " + geneper + ']';
    }
    
}
