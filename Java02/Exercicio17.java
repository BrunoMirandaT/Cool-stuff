import java.util.Scanner;
public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int raio;
		String perimetro;
		String area;
		
		System.out.println("Escreva o raio em cm:");
		raio = sc.nextInt();
		
		area = 3.14 * (raio * raio) + "cm";
		perimetro = 2 * 3.14 * raio + "cm";
		
		System.out.println("Per�metro: "+perimetro);
		System.out.println("�rea: "+area);
		
		sc.close();
		
	}

}
