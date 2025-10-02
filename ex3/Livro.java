package ex3;
public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int quantidadePaginas;
    private double preco;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livro(int anoPublicacao, int quantidadePaginas) {
        this.anoPublicacao = anoPublicacao;
        this.quantidadePaginas = quantidadePaginas;
    }

    public Livro(double preco) {
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcularPrecoPorPAgina() {
        if (quantidadePaginas == 0) 
            return 0;
        else 
            return preco / quantidadePaginas;
    }

    @Override
    public String toString() {
        return this.titulo + " - " + this.autor + " - " + this.anoPublicacao + " - " + this.quantidadePaginas + " - " +this.preco + " - ";
    }
}
