import java.util.Scanner;
public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int media;
		
		System.out.println("Escreva um n�mero:");
		x = sc.nextInt();
		
		System.out.println("Escreva outro n�mero:");
		y = sc.nextInt();
		
		media = (x + y)/2;
		
		System.out.println("m�dia "+media);
		
		sc.close();
		
	}

}
