import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("-----------------------------------");
        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a idade do cliente: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o sexo do cliente: ");
        String sexo = scanner.nextLine();
        System.out.println("Digite a senha do cliente: ");
        String senha = scanner.nextLine();
        System.out.println("Digite o titulo do livro: ");
        String titulo = scanner.nextLine();
        System.out.println("Digite o autor do livro: ");
        String autor = scanner.nextLine();
        System.out.println("Digite o ano de publicacao do livro: ");
        int anoPublicacao = scanner.nextInt();
        System.out.println("Digite a quantidade de paginas do livro: ");
        int quantidadePaginas = scanner.nextInt();
        System.out.println("Digite o preco do livro: ");
        double preco = scanner.nextDouble();
        System.out.println("-----------------------------------");
        scanner.nextLine();

         System.out.println("-----------------------------------");
        System.out.println("0000000000  Cliente 2 00000000000");
        System.out.println("Digite o nome do cliente: ");
        String nome2 = scanner.nextLine();
        System.out.println("Digite a idade do cliente: ");
        int idade2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o sexo do cliente: ");
        String sexo2 = scanner.nextLine();
        System.out.println("Digite a senha do cliente: ");
        String senha2 = scanner.nextLine();
        System.out.println("Digite o titulo do livro: ");
        String titulo2 = scanner.nextLine();
        System.out.println("Digite o autor do livro: ");
        String autor2 = scanner.nextLine();
        System.out.println("Digite o ano de publicacao do livro: ");
        int anoPublicacao2 = scanner.nextInt();
        System.out.println("Digite a quantidade de paginas do livro: ");
        int quantidadePaginas2 = scanner.nextInt();
        System.out.println("Digite o preco do livro: ");
        double preco2 = scanner.nextDouble();
        System.out.println("-----------------------------------");

        Livra livra = new Livra(titulo, autor, anoPublicacao, quantidadePaginas, preco);
        Livra livra2 = new Livra(titulo2, autor2, anoPublicacao2, quantidadePaginas2, preco2);
        Cliente cliente = new Cliente(nome, idade, sexo, senha, livra);
        Cliente cliente2 = new Cliente(nome2, idade2, sexo2, senha2, livra2);

        cliente.imprimeInformacoes();
    }
}
