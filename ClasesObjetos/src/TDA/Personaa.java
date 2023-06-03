//Mayte Mellado Huerta
package TDA;

public class Personaa {
    private String nomPer;
    private byte edadPers;
    private char geneper;
    private double pesoPer;
    private double alturaPer;

public Personaa(){

}
    //Contructor parametrizado


    public Personaa(String nomPer,byte edadPers,char geneper,double pesoPer, double alturaPer){
        this.nomPer=nomPer;
        this.edadPers=edadPers;
        this.geneper=geneper;
        this.pesoPer=pesoPer;
        this.alturaPer=alturaPer;
    }

    public Personaa(String nomPer,byte edadPers,char geneper){
        this.nomPer=nomPer;
        this.edadPers=edadPers;
        this.geneper=geneper;
    }

    public String getNomPer() {
        return nomPer;
    }

    public void setNomPer(String nomPer) {
        this.nomPer = nomPer;
    }
    public byte getEdadPers() {
        return edadPers;
    }

    public void setEdadPers(byte edadPers) {
        this.edadPers = edadPers;
    }
    public char getGeneper() {
        return geneper;
    }

    public void setGeneper(char geneper) {
        this.geneper = geneper;
    }
    public double getPesoPer(){
        return pesoPer;
    }
    public void setPesoPer(double pesoPer){
        this.pesoPer=pesoPer;
    }
    public double getAlturaPer(){
        return alturaPer;
    }
    public void setAlturaPer(double alturaPer){
        this.alturaPer=alturaPer;
    }
    public double pesoIdeal(){

        return (pesoPer/(Math.pow(alturaPer, 2)));
    }
    public double calcularMC(){

        double IMC=(pesoPer/(Math.pow(alturaPer, 2)));

        double pesoId=0.0;

        if(IMC<20) {
            pesoId = -1;
        } else
            if(IMC>=20 && IMC<=25)
            {
            pesoId=0;
            }else
                if(IMC>25) {
                    pesoId = 1;
                }
        return pesoId;
    }
    public boolean esMayorDeEdad(){

        byte mayor=18;
        boolean esMayor= false;

        if(edadPers>=mayor)
            esMayor=true;

        return esMayor;
    }

    @Override
    public String toString() {
        return "Persona [" + "Nombre: " + nomPer + ", Edad: " + edadPers +", Genero: " + geneper + ",Peso: "+pesoPer+", Altura: "+alturaPer+", "+']';
    }

}