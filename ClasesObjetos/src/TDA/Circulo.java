package TDA;

public class Circulo {
    
    private double Perimetro;
    private double Area;
    private double Radio;
    
    public Circulo(){}
    
    public Circulo (double Radio){
        
        this.Area=CalArea();
        this.Perimetro=CalPerimetro();
        this.Radio=Radio;
        
    }
    public double getArea() {
        
        return Area;
    }
    
    public double getPerimetro() {
        
        return Perimetro;
    }
    
    public double getRadio() {
        
        return Radio;
    }
    public void setRadio(double Radio) {
        this.Radio=Radio;
        
    }
    public double CalArea(){
        
        return Math.PI*Math.pow(Radio, 2);
    }
    public double CalPerimetro(){
        
        return 2*Math.PI*Radio;
    }
} 

