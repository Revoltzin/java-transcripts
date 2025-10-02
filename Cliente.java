public class Cliente {
    private String nome;
    private int idade;
    private String sexo;
    private String senha;
    private Livra livra;


    public Cliente(String nome, int idade, String sexo, String senha, Livra livra) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.senha = senha;
        this.livra = livra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getsexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getsenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Livra getLivra() {
        return livra;
    }

    public void setLivra(Livra livra) {
        this.livra = livra;
    }

    public void imprimeInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Senha: " + senha);
        System.out.println("Livro: " + livra);
        System.out.printf("Preço por Página: %.2f%n", livra.calcularPrecoPorPagina());
    }

    @Override
    public String toString() {
        return "Cliente " +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", senha='" + senha + '\'' +
                ", livra=" + livra +
                '}';
    }
}
