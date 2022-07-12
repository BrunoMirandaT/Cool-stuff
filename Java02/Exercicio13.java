import java.util.Scanner;
public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int produto;
		
		System.out.println("Escreva um número:");
		x = sc.nextInt();
		
		System.out.println("Escreva outro número:");
		y = sc.nextInt();
		
		produto = x * y;
		
		System.out.println(produto);
		
		sc.close();
		
	}

}
