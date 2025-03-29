
class Circulo extends Base {
    private double raio;

    public Circulo(double raio) {
        super("Círculo"); 
        this.raio = raio;
    }

    
    public double calcularArea() {
        return Math.PI * raio * raio; 
    }

    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
