package bruno_tessilla;
import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero1;
		int numero2;
		
		System.out.println("Escreva um n�mero:");
		numero1 = sc.nextInt();
		
		System.out.println("Escreva outro n�mero:");
		numero2 = sc.nextInt();
		
		if(numero1 - numero2 >0){
			System.out.println("O maior n�mero � o "+numero1);
		}
		
		if(numero1 - numero2 <0){
			System.out.println("O maior n�mero � o "+numero2);
		}
		
		if(numero1 - numero2 ==0){
			System.out.println("Os dois n�meros s�o iguais");
		}
	sc.close();	
	}

}
