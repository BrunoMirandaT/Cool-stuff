package bruno_tessilla;
import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero1;
		int numero2;
		
		System.out.println("Escreva um número:");
		numero1 = sc.nextInt();
		
		System.out.println("Escreva outro número:");
		numero2 = sc.nextInt();
		
		if(numero1 - numero2 >0){
			System.out.println("O maior número é o "+numero1);
		}
		
		if(numero1 - numero2 <0){
			System.out.println("O maior número é o "+numero2);
		}
		
		if(numero1 - numero2 ==0){
			System.out.println("Os dois números são iguais");
		}
	sc.close();	
	}

}
