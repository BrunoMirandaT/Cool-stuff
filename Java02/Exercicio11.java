import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome;
		String endereco;
		String telefone;
		
		System.out.println("Escreva seu nome:");
		nome = sc.next();
		System.out.println("Escreva seu endere�o:");
		endereco = sc.next();
		System.out.println("Escreva seu telefone:");
		telefone = sc.next();
		
		System.out.println("Nome: "+nome);
		System.out.println("Endere�o: "+endereco);
		System.out.println("Telefone: "+telefone);
		
		
		sc.close();
		
	}

}
