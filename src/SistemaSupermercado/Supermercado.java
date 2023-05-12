
package SistemaSupermercado;


public abstract class Supermercado {
    protected String nome, categoria;
    protected double preco;

    public Supermercado(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Supermercado{" + "nome=" + nome + ", categoria=" + categoria + ", preco=" + preco + '}';
    }

    
}
