public class Livra {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int quantidadePaginas;
    private double preco;

    public Livra(String titulo, String autor, int anoPublicacao, int quantidadePaginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.quantidadePaginas = quantidadePaginas;
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

    public void setAturo(String autor) {
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

    public double calcularPrecoPorPagina() {
        if (quantidadePaginas == 0) 
            return 0;
        else 
            return preco / quantidadePaginas;
    }

    @Override
    public String toString() {
        return "Livro " +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", quantidadePaginas=" + quantidadePaginas +
                ", preco=" + preco +
                '}';
    }
}
