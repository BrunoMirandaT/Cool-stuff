import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
	
		do {
			System.out.println("Digite um n�mero maior que 1:");
			num = sc.nextInt();
			if (num < 1) {
				System.out.println("N�mero invalido");
				}
		} while(num < 1);
		
		if(num == 3 || num == 5 || num == 7) {
			System.out.println("O n�mero � primo");
		}
		else {
		if(num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
			System.out.println("N�mero n�o � primo");
		}
		else {
			System.out.println("O n�mero � primo");
		}
	}
	}

}
