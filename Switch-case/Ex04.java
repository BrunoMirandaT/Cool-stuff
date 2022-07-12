import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double val, valfin, parcelas, valdesc;
		int opcao, mud;
		
		System.out.println("Selecione a opção de pagamento:");
		System.out.println("1 - Pagamento à vista");
		System.out.println("2 - Pagamento com cheque pré-datado para 30 dias");
		System.out.println("3 - Pagamento parcelado em 6 vezes");
		System.out.println("4 - Pagamento parcelado em 12 vezes");
		opcao = sc.nextInt();
		
		System.out.println("Informe o valor do pagamento:");
		val = sc.nextDouble();
		
		switch(opcao) {
		case 1:
			parcelas = 0;
			mud = 1;
			valdesc = val * 0.15;
			valfin = val - valdesc;
			break;
		case 2:
			parcelas = 0;
			mud = 1;
			valdesc = val * 0.1;
			valfin = val - valdesc;
			break;
		case 3:
			mud = 1;
			valdesc = 0;
			valfin = val;
			parcelas = val / 6;
			break;
		case 4:
			mud = 0;
			valdesc = val * 0.08;
			valfin = val + valdesc;
			parcelas = valfin / 12;
			break;
		default:
			mud = 2;
			valdesc = 0;
			valfin = 0;
			parcelas = 0;
			System.out.println("Opção invalida.");
			break;
		}
		System.out.println("Valor total: R$"+val);
		System.out.println("Valor final: R$"+valfin);
		switch(mud) {
		case 0:
			System.out.println("Valor do acréscimo: R$"+valdesc);
			break;
		case 1:
			System.out.println("Valor do desconto: R$"+valdesc);
			break;
		default:
			break;
		}
		switch(opcao){
		case 3:
			System.out.printf("Parcelas: 6 x R$%.2f",parcelas);
			break;
		case 4:
			System.out.printf("Parcelas: 12 x R$%.2f",parcelas);
			break;
		}
		sc.close();
	}

}
