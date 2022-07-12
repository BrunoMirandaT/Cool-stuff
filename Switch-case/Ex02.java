import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codpais, codprod;
		double peso, preco, imposto, grama, precotot;
		
		System.out.println("Digite o código do produto(1 - 10):");
		codprod = sc.nextInt();
		
		System.out.println("Digite o peso do produto em quilos:");
		peso = sc.nextDouble();
		
		System.out.println("Digite o código de origem do país(1 - 3):");
		codpais = sc.nextInt();
		
		grama = peso * 1000;
		
		switch(codprod) {
		case 1:
		case 2:
		case 3:
		case 4:
			preco = grama * 10;
			break;
		case 5:
		case 6:
		case 7:
			preco = grama * 25;
			break;
		case 8:
		case 9:
		case 10:
			preco = grama * 35;
			break;
		default:
			preco = 0;
			System.out.println("Código invalido");
		}
	
		switch(codpais) {
		case 1:
			imposto = 0;
			break;
		case 2:
			imposto = preco * 0.15;
			break;
		case 3:
			imposto = preco * 0.25;
			break;
		default:
			imposto = 0;
			System.out.println("Código invalido");
		}
		
		precotot = preco + imposto;
		
		System.out.println("Peso: "+peso+"kg ou "+grama+" gramas");
		System.out.println("Preço: R$"+precotot);
		System.out.println("Imposto: R$"+imposto);
	}

}
