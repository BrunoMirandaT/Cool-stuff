import java.util.Scanner;
public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int soma;
		
		System.out.println("Escreva um número:");
		x = sc.nextInt();
		
		System.out.println("Escreva outro número:");
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.println("SOMA = "+soma);
		
		sc.close();
		
	}

}
