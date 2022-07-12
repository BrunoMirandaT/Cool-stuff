package bruno_tessilla;
import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota1;
		int nota2;
		int nota3;
		int notafin;
		int notaex;
		
		System.out.println("Insira sua primeira nota:");
		nota1 = sc.nextInt();
		
		System.out.println("Insira sua segunda nota:");
		nota2 = sc.nextInt();
		
		System.out.println("Insira sua terceira nota:");
		nota3 = sc.nextInt();
		
		notafin = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Sua nota é: "+notafin);
		
		if(notafin >=7){
			System.out.println("Voce esta aprovado!");
		}
		
		if(notafin <=6.99 && notafin >=3){
			System.out.println("Voce esta em exame!");
			notaex = 6 - notafin;
			System.out.printf("Voce precisa tirar nota %d para passar de ano! ",notaex);
		}
		if(notafin <=3){
			System.out.println("Voce esta reprovado!");
		}

sc.close();
	}

}
