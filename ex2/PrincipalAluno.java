public class PrincipalAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Brandamente Brasil", "1585248", 5.0, 9.0);
        Aluno a2 = new Aluno("Radigunda Cercená", "2254879", 8.0, 2.0);
        Aluno a3 = new Aluno("Vitimado José Araújo", "85994", 7.0, 1.0);
    
        System.out.println("--- Informações do Aluno 1 ---");
        a1.imprimeInfo();
        System.out.println();
        System.out.println("--- Informações do Aluno 2 ---");
        System.out.println("Media da Radigunda: " + a2.calculaMedia());
        System.out.println();
        System.out.println("--- Informações do Aluno 3 ---");
        System.out.println("matricula : " + a3.getMatricula());
    
    }
}
