public class Cuadrado extends Figura{
    private double radio;
    
    public Cuadrado(double radio) {
    this.radio = radio;
    }
    
    @Override
    public double area () {
    return radio*radio;
    }
    
    @Override
    public double perimetro(){
    return radio*4;
    }
    
}

