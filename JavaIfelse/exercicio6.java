import java.util.Scanner;
public class exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		double salario, imposto = 0, aumento = 0;
	
		System.out.println("Menu de op��es:");
		System.out.println("1 - Imposto");
		System.out.println("2 - Novo sal�rio");
		System.out.println("3 - Classifica��o");
		System.out.println("Digite a op��o desejada:");
		opcao = sc.nextInt();
		
		System.out.println("Digite seu sal�rio:");
		salario = sc.nextDouble();
		
		if(opcao == 1) {
			if(salario < 500) {
				imposto = salario * 0.05;
			}
			if(salario >= 500 && salario <=850) {
				imposto = salario * 0.1;
			}
			if(salario > 850) {
				imposto = salario * 0.15;
			}
			System.out.println("O valor do imposto �: R$"+imposto);
		}
		if(opcao == 2) {
			if(salario > 1500) {
				aumento = salario + 25;
			}
			if(salario <= 1500 && salario >= 750) {
				aumento = salario + 50;
			}
		
			if(salario >= 450 && salario < 750) {
				aumento = salario + 75;
			}
			if(salario < 450) {
				aumento = salario + 100;
			}
			System.out.println("Seu novo sal�rio: R$"+aumento);
		}
		if(opcao == 3) {
			if(salario <=700) {
				System.out.println("Mal remunerado");
			}
			if(salario > 700) {
				System.out.println("Bem remunerado");
			}
		}
	}
}
