import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dia1, dia2, mes1, mes2, ano1, ano2;
		int prog = 1;
		
		System.out.println("Escreva o dia:");
		dia1 = sc.nextInt();
		
		System.out.println("Escreva o mes:");
		mes1 = sc.nextInt();
		
		System.out.println("Escreva o ano:");
		ano1 = sc.nextInt();
		
		System.out.println("Escreva outro dia:");
		dia2 = sc.nextInt();
		
		System.out.println("Escreva outro mes:");
		mes2 = sc.nextInt();
		
		System.out.println("Escreva o ano:");
		ano2 = sc.nextInt();
		
		if(mes1 > 12 || mes1 < 1 || mes2 > 12 || mes2 < 1) {
			System.out.println("Data invalida!");
			prog  = 0;
		}
		
		if(prog == 1) {
		if(ano1 > ano2) {
			System.out.println("A primeira data é maior!");
		}
		
		if(ano2 > ano1) {
			System.out.println("A segunda data é maior!");
		}
		if(ano1 == ano2) {
			if(mes1 > mes2) {
				System.out.println("A primeira data é maior!");
				}
			if(mes2 > mes1) {
				System.out.println("A segunda data é maior!");
			}
			if(mes1 == mes2) {
				if(dia1 > dia2) {
				System.out.println("A primeira data é maior!");
				}
				if(dia2 > dia1) {
				System.out.println("A segunda data é maior!");
			}
				if(dia1 == dia2) {
					System.out.println("As duas datas são iguais!");
				}
			}
		}
	}
	}
}
		
