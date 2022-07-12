/*Feito por: Bruno Miranda Tessilla e Gustavo Henrique Bastos*/
import java.util.Scanner;
public class Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*Variaveis para salvar respostas para todas as perguntas e o total de acertos*/
		int per1, per2, per3, per4, per5, per6, per7, per8, per9, per10, resul = 0;
		
		System.out.println("Quiz sobre o mundo!");
		/*Todas as perguntas do quiz em ordem, foi usado o \n para poder fazer uma questão inteira em 1 linha de código*/
		System.out.println("1/10 - Quantos continentes tem no mundo?\n1 - 5\n2 - 6\n3 - 7\n4 - 4");
		per1 = sc.nextInt();
		
		System.out.println("2/10 - Qual é o maior continente do mundo?\n1 - América\n2 - África\n3 - Europa\n4 - Ásia");
		per2 = sc.nextInt();
		
		System.out.println("3/10 - Qual país pertence a dois continentes?\n1 - Egito\n2 - Arábia\n3 - índia\n4 - Alemanha");
		per3 = sc.nextInt();
		
		System.out.println("4/10 - Qual continente é banhado por apenas um oceano?\n1 - Ásia\n2 - Oceania\n3 - Europa\n4 - África");
		per4 = sc.nextInt();
		
		System.out.println("5/10 - Qual continente é o menos populoso?(Antartida desconsiderada)\n1 - Oceania\n2 - África\n3 - Europa\n4 - América");
		per5 = sc.nextInt();
		
		System.out.println("6/10 - A qual continente a Índia pertence?\n1 - Europa\n2 - África\n3 - Oceania\n4 - Ásia");
		per6 = sc.nextInt();
		
		System.out.println("7/10 - Qual é o país mais populoso da Ásia?\n1 - Índia\n2 - China\n3 - Japão\n4 - Irã");
		per7 = sc.nextInt();
		
		System.out.println("8/10 - Qual é o continente dividido em 3?\n1 - América\n2 - Europa\n3 - Oceania\n4 - Antártida");
		per8 = sc.nextInt();

		System.out.println("9/10 - Qual é o maior oceano do mundo?\n1 - Índico\n2 - Atlântico\n3 - Pacífico\n4 - Ártico");
		per9 = sc.nextInt();
		
		System.out.println("10/10 - Qual é a maior ilha do mundo?\n1 - Madagascar\n2 - Bornéu\n3 - Nova Guiné\n4 - Groelândia");
		per10 = sc.nextInt();
		/*Ifs para verificar se as respostas estão corretas*/
		if(per1 == 2){
			resul+=1;
		}
		if(per2 == 4){
			resul+=1;
		}
		if(per3 == 1){
			resul+=1;
		}
		if(per4 == 3){
			resul+=1;
		}
		if(per5 == 1){
			resul+=1;
		}
		if(per6 == 4){
			resul+=1;
		}
		if(per7 == 2){
			resul+=1;
		}
		if(per8 == 1){
			resul+=1;
		}
		if(per9 == 3){
			resul+=1;
		}
		if(per10 == 4){
			resul+=1;
		}
		/*Switch para informar quantas respostas estão corretas*/
		switch(resul) {
		case 0: System.out.println("Sua pontuação: "+resul+"/10\nVocê errou todas :(\nEstude mais!");
		break;
				
		case 1:
		case 2:
		case 3: System.out.println("Sua pontuação: "+resul+"/10\nVocê foi muito mal :(\nEstude mais!");
		break;
			
		case 4:
		case 5:
		case 6: System.out.println("Sua pontuação: "+resul+"/10\nVocê não foi muito mal mas ainda da pra melhorar muito!");
		break;
		
		case 7:
		case 8:
		case 9: System.out.println("Sua pontuação: "+resul+"/10\nVocê foi muito bem\nContinue estudando!");
		break;
			
		case 10: System.out.println("Sua pontuação: "+resul+"/10\nParabéns, você acertou todas!\nContinue se esforçando!");
		break;
		
		default: System.out.println("Se tu tiver lendo isso, o programa bugo :(");
		break;
		}
		/*Fechando o Scanner*/
		sc.close();
	}

}
