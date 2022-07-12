import java.util.Scanner;
public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ano;
		int dias1;
		int mes;
		int dias2;
		int dia;
		int diasfinal;
		
		System.out.println("Escreva quantos anos voce tem:");
		ano = sc.nextInt();
		
		System.out.println("Escreva e meses:");
		mes = sc.nextInt();
	
		System.out.println("Escreva e dias:");
		dia = sc.nextInt();
		
		dias1 = ano * 365;
		dias2 = mes * 30;
		diasfinal = dias1 + dias2 + dia;
		
		System.out.println(+diasfinal);
		
		sc.close();
		
	}

}
