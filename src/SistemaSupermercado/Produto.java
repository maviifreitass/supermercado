
package SistemaSupermercado;


public class Produto extends Supermercado {
    private double soma;
    public Produto(String nome, String categoria, double preco) {
        super(nome, categoria, preco);
        this.soma = soma;
    }

   public Produto(Produto produto) { //CONSTRUTOR COPIA CRIADO PARA REFERENCIAR LISTA CARRINHO
        super(produto.getNome(), produto.getCategoria(), produto.getPreco());
    } 
    
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getCategoria() {
        return categoria;
    }

    @Override
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }
    
    
    @Override
    public String toString() {
    return "Produto{" + "nome='" + nome + '\'' + ", categoria='" + categoria + '\'' + ", preco=" + preco + '}';
    }

  


  

 
    
}
