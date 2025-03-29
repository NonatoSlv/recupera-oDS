
class Quadrado extends Retangulo {

   
    public Quadrado(double lado) {
        super(lado, lado);
    }

    
   @Override
    public double calcularArea() {
        double lado = getLargura();
        return lado * lado; 
    }
}

