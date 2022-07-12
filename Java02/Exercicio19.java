import java.util.Scanner;
public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int media1;
		int media2;
		int soma;
		int media3;
		
		media1 = (8 + 9 + 7)/3;
		media2 = (4 + 5 + 6)/3;
		soma = media1 + media2;
		media3 = (media1 + media2)/2;
		
		
		System.out.println(+media1);
		System.out.println(+media2);
		System.out.println(+soma);
		System.out.println(+media3);
		
		sc.close();
		
	}

}
