package ex;
public class Aluno {
    private String nome;
    private String matricula;
    private double notaTrabalho;
    private double notaProva;

    public Aluno(String nome, String matricula, double notaTrabalho, double notaProva) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaTrabalho = notaTrabalho;
        this.notaProva = notaProva;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public double getNotaProva() {
        return notaProva;
    }

    public void setNotaProva(double notaProva) {
        this.notaProva = notaProva;
    }

    public double calculaMedia() {
        return (notaTrabalho * 0.33) + (notaProva * 0.67);
    }

    public void imprimeInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota do Trabalho: " + notaTrabalho);
        System.out.println("Nota da Prova: " + notaProva);
        System.out.printf("Média Final: %.2f%n", calculaMedia());
    }

}
