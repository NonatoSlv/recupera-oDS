
class Base {
    
    private String nome;

   
    public Base(String nome) {
        this.nome = nome;
    }

   
    public void exibirNome() {
        System.out.println("Forma: " + this.nome);  
    }

   
    public String getNome() {
        return nome; 
    }

    
    public void setNome(String nome) {
        this.nome = nome;  
    }
}
