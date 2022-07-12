import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcao, num1, num2, soma;
		
		System.out.println("Escolha uma das opções abaixo:");
		
		System.out.println("1 - Somar dois números");
		System.out.println("2 - Raiz quadrada de um número");
		opcao = sc.nextInt();
		
		if(opcao == 1) {
			System.out.println("Digite um número:");
			num1 = sc.nextInt();
			
			System.out.println("Digite outro número:");
			num2 = sc.nextInt();
			
			soma = num1 + num2;
			
			System.out.println("Opção escolhida: 1 - Somar dois números.");
			
			System.out.printf("%d + %d = %d",num1,num2,soma);
		}
		else {
			System.out.println("Digite um número:");
			num1 = sc.nextInt();
			
			System.out.println("Opção escolhida: 2 - Raiz quadrada de um número.");
			
			System.out.printf("A raiz quadrada de %d é %.1f ",num1,Math.sqrt(num1));
		}
		sc.close();
	}
}
