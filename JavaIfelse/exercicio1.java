import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcao, num1, num2, soma;
		
		System.out.println("Escolha uma das op��es abaixo:");
		
		System.out.println("1 - Somar dois n�meros");
		System.out.println("2 - Raiz quadrada de um n�mero");
		opcao = sc.nextInt();
		
		if(opcao == 1) {
			System.out.println("Digite um n�mero:");
			num1 = sc.nextInt();
			
			System.out.println("Digite outro n�mero:");
			num2 = sc.nextInt();
			
			soma = num1 + num2;
			
			System.out.println("Op��o escolhida: 1 - Somar dois n�meros.");
			
			System.out.printf("%d + %d = %d",num1,num2,soma);
		}
		else {
			System.out.println("Digite um n�mero:");
			num1 = sc.nextInt();
			
			System.out.println("Op��o escolhida: 2 - Raiz quadrada de um n�mero.");
			
			System.out.printf("A raiz quadrada de %d � %.1f ",num1,Math.sqrt(num1));
		}
		sc.close();
	}
}
