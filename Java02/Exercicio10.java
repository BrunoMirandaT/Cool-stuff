import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		int sucessor;
		int antecessor;
		
		System.out.println("Digite um número:");
		num = sc.nextInt();
		
		sucessor = num + 1;
		antecessor = num - 1;
		System.out.println("Sucessor: "+sucessor);
		System.out.println("Antecessor: "+antecessor);
		
		sc.close();
		
	}

}
