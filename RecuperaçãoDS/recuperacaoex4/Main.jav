
public class Main {
    public static void main(String[] args) {
     
        Circulo circulo = new Circulo(5); 
        Retangulo retangulo = new Retangulo(4, 6); 
        Quadrado quadrado = new Quadrado(4); 

        circulo.exibirNome();
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println();

        retangulo.exibirNome();
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println();

        quadrado.exibirNome();
        System.out.println("Área: " + quadrado.calcularArea());
    }
}
