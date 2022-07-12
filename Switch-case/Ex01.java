import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cargo;
		double aumento, sal, salfin;
		
		System.out.println("Escolha seu cargo:");
		System.out.println("1 - Escritur�rio");
		System.out.println("2 - Secret�rio");
		System.out.println("3 - Caixa");
		System.out.println("4 - Gerente");
		System.out.println("5 - Diretor");
		cargo = sc.nextInt();
		
		System.out.println("Qual � o seu salario?");
		sal = sc.nextDouble();
		
		switch(cargo) {
		case 1: 
			aumento = sal * 0.5;
			salfin = sal + aumento;
			System.out.println("Cargo: Escritur�rio");
			break;
		case 2:
			aumento = sal * 0.35;
			salfin = sal + aumento;
			System.out.println("Cargo: Secret�rio");
			break;
		case 3:
			aumento = sal * 0.2;
			salfin = sal + aumento;
			System.out.println("Cargo: Caixa");
			break;
		case 4:
			aumento = sal * 0.1;
			salfin = sal + aumento;
			System.out.println("Cargo: Gerente");
			break;
		case 5:
			aumento = 0;
			salfin = sal;
			System.out.println("Cargo: Diretor");
			break;
		default:
			aumento = 0;
			salfin = 0;
			System.out.println("C�digo invalido.");
			break;
		}
		if(cargo >=1 && cargo <=5) {
			System.out.println("O aumento foi de "+aumento);
			System.out.println("O seu novo sal�rio � de: R$"+salfin);
		}
		sc.close();
	}
	
}

