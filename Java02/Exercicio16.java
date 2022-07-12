import java.util.Scanner;
public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int base;
		int altura;
		String area;
		String perimetro;
		
		System.out.println("Escreva a base em cm:");
		base = sc.nextInt();
		
		System.out.println("Escreva a altura em cm:");
		altura = sc.nextInt();
		
		area = base * altura + "cm";
		
		perimetro = 2 * (base + altura) + "cm";
		
		System.out.println("Área: "+area);
		System.out.println("Perímetro: "+perimetro);
		
		sc.close();
		
	}

}
