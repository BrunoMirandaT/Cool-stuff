import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hora1, hora2, minuto1, minuto2;
		double hora3, minuto3, hora4, minuto4;
		System.out.println("Escreva a hora em que o jogo começou:");
		hora1 = sc.nextInt();
		
		System.out.println("Escreva o minuto em que o jogo começou:");
		minuto1 = sc.nextInt();
		
		System.out.println("Escreva a hora em que o jogo terminou:");
		hora2 = sc.nextInt();
		
		System.out.println("Escreva o minuto em que o jogo terminou:");
		minuto2 = sc.nextInt();
		
		hora3 = hora2 - hora1;
		
		minuto3 = minuto2 - minuto1;
		
		if(hora3 < 0) {
		hora4 = (hora3 - 12) / -1;
		}
		else {
			hora4 = hora3;
		}
		if(minuto3 < 0) {
		minuto4 = minuto3 / -1;
		}
		else {
			minuto4 = minuto3;
		}
		
		System.out.printf("O jogo durou %.0f horas e %.0f minutos",hora4, minuto4);
	}

}
