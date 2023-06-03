package TDA;

public class Cuadrado {
    
    private double Area;
    private double Perimetro;
    private double Lado;
  
    public Cuadrado(){}
    
    public Cuadrado (double Lado){
        
        this.Area=CalArea();
        this.Perimetro=CalPerimetro();
        this.Lado=Lado;
        
        
    }
    public double getArea() {
        
        return Area;
    }
    
    public double getPerimetro() {
        
        return Perimetro;
    }
    public double getBase(){
        return Lado;
    }
    public void setLado(double Lado) {
        this.Lado=Lado;
        
    }
    
    
    public double CalArea(){
        
        return (Lado+Lado);
    }
    public double CalPerimetro(){
        
        return (Lado*Lado*Lado*Lado);
    }
}

