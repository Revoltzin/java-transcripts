package ex3;
import java.util.Scanner;
public class PrincipalLivro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o titulo para o l1: ");
        String titulo1 = scanner.nextLine();
        System.out.println("Digite o autor para o l1: ");
        String autor1 = scanner.nextLine();
        System.out.println("Digite o ano de publicacao para o l1: ");
        int anoPublicacao1 = scanner.nextInt();
        System.out.println("Digite a quantidade de paginas para o l1: ");
        int quantidadePaginas1 = scanner.nextInt();
        System.out.println("Digite o preco para o l1: ");
        double preco1 = scanner.nextDouble();
        
        scanner.nextLine();  

        System.out.println("Digite o titulo para o l2: ");
        String titulo2 = scanner.nextLine();
        System.out.println("Digite o autor para o l2: ");
        String autor2 = scanner.nextLine();
        System.out.println("Digite o ano de publicacao para o l2: ");
        int anoPublicacao2 = scanner.nextInt();
        System.out.println("Digite a quantidade de paginas para o l2: ");
        int quantidadePaginas2 = scanner.nextInt();
        System.out.println("Digite o preco para o l2: ");
        double preco2 = scanner.nextDouble();

        Livro l1 = new Livro(titulo1, autor1);
        l1.setAnoPublicacao(anoPublicacao1);
        l1.setQuantidadePaginas(quantidadePaginas1);
        l1.setPreco(preco1);
        
        Livro l2 = new Livro(titulo2, autor2);
        l2.setAnoPublicacao(anoPublicacao2);
        l2.setQuantidadePaginas(quantidadePaginas2);
        l2.setPreco(preco2);

        System.out.println(l1);

        System.out.println(l2);
    }
}
