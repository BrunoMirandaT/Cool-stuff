import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quant;
		double opc1, opc2;
		
		System.out.println("Digite quantos livro voce deseja comprar:");
		quant = sc.nextInt();
		
		opc1 = (quant * 0.25) + 7.5;
		opc2 = (quant * 0.5) + 2.5;
		
		if(opc1 > opc2) {
			System.out.println("O melhor crit�rio � o crit�rio A");
			System.out.println("Valor: R$"+opc1);
		}
		if(opc1 < opc2) {
			System.out.println("O melhor crit�rio � o crit�rio B");
			System.out.println("Valor: R$"+opc2);
		}
		if(opc1 == opc2) {
			System.out.println("Os dois crit�rios d�o o mesmo valor");
			System.out.println("Valor: R$"+opc2);
			
			sc.close();
			
		//N�O SEI COMO FAZER USANDO SWITCH
		}
	}
}
