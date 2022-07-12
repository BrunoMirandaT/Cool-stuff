import java.util.Scanner;
public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		int terca;
		
		System.out.println("Escreva um número:");
		num = sc.nextInt();
		
		terca = num/3;
		
		System.out.println(terca);
		
		sc.close();
		
	}

}
