import java.util.Scanner;
public class exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod;
		double salario1;
		double aumento = 0;
		double salario_fin;
		
		System.out.println("Digite seu cargo:");
		cod = sc.nextInt();
		
		System.out.println("Digite seu salario:");
		salario1 = sc.nextInt();
		
		if(cod == 1) {
			aumento = salario1 * 0.5;
		}
		if(cod == 2) {
			aumento = salario1 * 0.35;
		}
		if(cod == 3) {
			aumento = salario1 * 0.2;
		}
		if(cod == 4) {
			aumento = salario1 * 0.1;
		}
		if(cod == 5) {
			aumento = 0;
		}
		if(cod < 1 || cod > 5) {
			System.out.println("Codigo de cargo invalido!");
		}
		salario_fin = salario1 + aumento;
		
		if(cod == 1) {
		System.out.println("Cargo: Escriturário");
		}
		if(cod == 2) {
			System.out.println("Cargo: Secretário");
			}
		if(cod == 3) {
			System.out.println("Cargo: Caixa");
			}
		if(cod == 4) {
			System.out.println("Cargo: Gerente");
			}
		if(cod == 5) {
			System.out.println("Cargo: Diretor");
			}
		if(cod >= 1 && cod <= 5) {
		System.out.println("Valor do aumento: "+aumento);
		System.out.println("Valor do novo salario: "+salario_fin);
		}
	}

}
