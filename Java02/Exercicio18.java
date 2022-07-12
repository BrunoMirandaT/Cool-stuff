
import java.util.Scanner;
public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int base;
		int altura;
		String area;
		
		System.out.println("Escreva a base em cm:");
		base = sc.nextInt();
		
		System.out.println("Escreva a altura em cm:");
		altura = sc.nextInt();
		
		area = (base * altura)/2 + "cm";
		
		
		System.out.println("Área: "+area);
		
		sc.close();
		
	}

}
