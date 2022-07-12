import java.util.Scanner;
public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int media;
		
		System.out.println("Escreva um número:");
		x = sc.nextInt();
		
		System.out.println("Escreva outro número:");
		y = sc.nextInt();
		
		media = (x + y)/2;
		
		System.out.println("média "+media);
		
		sc.close();
		
	}

}
