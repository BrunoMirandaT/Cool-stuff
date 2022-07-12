package bruno_tessilla;
import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota1;
		int nota2;
		int nota3;
		int notafin;
		
		System.out.println("Insira a sua nota do trabalho de laboratório:");
		nota1 = sc.nextInt();
		
		System.out.println("Insira a sua nota da avaliação semestral:");
		nota2 = sc.nextInt();
		
		System.out.println("Insira a sua nota do exame final:");
		nota3 = sc.nextInt();
		
		notafin = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		
		System.out.println("Sua nota é: "+notafin);
		
		if(notafin <=10 && notafin >=8){
			System.out.println("Voce tirou A!");
		}
		if(notafin <=7.99 && notafin >=7){
			System.out.println("Voce tirou B!");
		}
		if(notafin <=6.99 && notafin >=6){
			System.out.println("Voce tirou C!");
		}
		if(notafin <=5.99 && notafin >=5){
			System.out.println("Voce tirou D!");
		}
		if(notafin <=4.99){
			System.out.println("Voce tirou E!");
		}


sc.close();
	}

}
