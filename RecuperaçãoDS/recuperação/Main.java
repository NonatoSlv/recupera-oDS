// Classe principal para testar o sistema
public class Main {
    public static void main(String[] args) {
        // Instanciando um produto normal
        Produto produto1 = new Produto("Produto A", 100.0);
        produto1.exibirDetalhes();  // Exibe os detalhes do produto

        System.out.println();  // Adiciona uma linha em branco para separar

        // Instanciando um produto com desconto
        ProdutoComDesconto produto2 = new ProdutoComDesconto("Produto B", 150.0, 20.0);
        produto2.exibirDetalhesComDesconto();  // Exibe os detalhes do produto com desconto
    }
}

