
public class Main {
    public static void main(String[] args) {
      
        Carro carro1 = new Carro("Fusca", "ABC-1234", 1980, 4);
        System.out.println("Informações do Carro:");
        carro1.exibirInformacoesCarro();  
        System.out.println();  

       
        Moto moto1 = new Moto("CB 500", "XYZ-5678", 2020, 500);
        System.out.println("Informações da Moto:");
        moto1.exibirInformacoesMoto();  
    }
}
