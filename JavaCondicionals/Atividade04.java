package bruno_tessilla;
import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero1;
		int numero2;
		int numero3;
		
		System.out.println("Digite o primeiro n�mero:");
		numero1 = sc.nextInt();
		
		System.out.println("Digite o segundo n�mero:");
		numero2 = sc.nextInt();
		
		System.out.println("Digite o terceiro n�mero:");
		numero3 = sc.nextInt();
		
		if(numero1 > numero2) {
			if(numero1 > numero3) {
				if(numero3 < numero2){
					System.out.println("Numero 1:"+ numero3);
					System.out.println("Numero 2:"+ numero2);
					System.out.println("Numero 3:"+ numero1);
				}
				if(numero3 > numero2){
					System.out.println("Numero 1:"+ numero2);
					System.out.println("Numero 2:"+ numero3);
					System.out.println("Numero 3:"+ numero1);
				}
			}
		}
		if(numero2 > numero1) {
			if(numero2 > numero3)
				if(numero3 > numero1){
				System.out.println("Numero 1:"+ numero1);
				System.out.println("Numero 2:"+ numero3);
				System.out.println("Numero 3:"+ numero2);
			}
				if(numero3 < numero1) {
					System.out.println("Numero 1:"+ numero3);
					System.out.println("Numero 2:"+ numero1);
					System.out.println("Numero 3:"+ numero2);
				}
		}
		if(numero3 > numero1){
			if(numero3 > numero2) {
				if(numero1 > numero2) {
					System.out.println("Numero 1:"+ numero2);
					System.out.println("Numero 2:"+ numero1);
					System.out.println("Numero 3:"+ numero3);
				}
				if(numero1 < numero2) {
					System.out.println("Numero 1:"+ numero1);
					System.out.println("Numero 2:"+ numero2);
					System.out.println("Numero 3:"+ numero3);
				}
			}
		}
	}
	

}
