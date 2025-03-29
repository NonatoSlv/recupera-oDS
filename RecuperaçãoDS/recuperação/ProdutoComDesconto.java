
class ProdutoComDesconto extends Produto {
    private double desconto;
    public ProdutoComDesconto(String nome, double preco, double desconto) {
        super(nome, preco);
        this.desconto = desconto;
    }

    public void exibirDetalhesComDesconto() {
      
        double precoComDesconto = getPreco() - (getPreco() * desconto / 100);
        
        System.out.println("Produto com Desconto: " + getNome());
        System.out.println("Preço original: R$ " + getPreco());
        System.out.println("Desconto: " + desconto + "%");
        System.out.println("Preço com Desconto: R$ " + precoComDesconto);
    }

    
    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
