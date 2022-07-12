/*Feito por: Bruno Miranda Tessilla e Gustavo Henrique Bastos*/
import java.util.Scanner;
public class Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*Variaveis para salvar respostas para todas as perguntas e o total de acertos*/
		int per1, per2, per3, per4, per5, per6, per7, per8, per9, per10, resul = 0;
		
		System.out.println("Quiz sobre o mundo!");
		/*Todas as perguntas do quiz em ordem, foi usado o \n para poder fazer uma quest�o inteira em 1 linha de c�digo*/
		System.out.println("1/10 - Quantos continentes tem no mundo?\n1 - 5\n2 - 6\n3 - 7\n4 - 4");
		per1 = sc.nextInt();
		
		System.out.println("2/10 - Qual � o maior continente do mundo?\n1 - Am�rica\n2 - �frica\n3 - Europa\n4 - �sia");
		per2 = sc.nextInt();
		
		System.out.println("3/10 - Qual pa�s pertence a dois continentes?\n1 - Egito\n2 - Ar�bia\n3 - �ndia\n4 - Alemanha");
		per3 = sc.nextInt();
		
		System.out.println("4/10 - Qual continente � banhado por apenas um oceano?\n1 - �sia\n2 - Oceania\n3 - Europa\n4 - �frica");
		per4 = sc.nextInt();
		
		System.out.println("5/10 - Qual continente � o menos populoso?(Antartida desconsiderada)\n1 - Oceania\n2 - �frica\n3 - Europa\n4 - Am�rica");
		per5 = sc.nextInt();
		
		System.out.println("6/10 - A qual continente a �ndia pertence?\n1 - Europa\n2 - �frica\n3 - Oceania\n4 - �sia");
		per6 = sc.nextInt();
		
		System.out.println("7/10 - Qual � o pa�s mais populoso da �sia?\n1 - �ndia\n2 - China\n3 - Jap�o\n4 - Ir�");
		per7 = sc.nextInt();
		
		System.out.println("8/10 - Qual � o continente dividido em 3?\n1 - Am�rica\n2 - Europa\n3 - Oceania\n4 - Ant�rtida");
		per8 = sc.nextInt();

		System.out.println("9/10 - Qual � o maior oceano do mundo?\n1 - �ndico\n2 - Atl�ntico\n3 - Pac�fico\n4 - �rtico");
		per9 = sc.nextInt();
		
		System.out.println("10/10 - Qual � a maior ilha do mundo?\n1 - Madagascar\n2 - Born�u\n3 - Nova Guin�\n4 - Groel�ndia");
		per10 = sc.nextInt();
		/*Ifs para verificar se as respostas est�o corretas*/
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
		/*Switch para informar quantas respostas est�o corretas*/
		switch(resul) {
		case 0: System.out.println("Sua pontua��o: "+resul+"/10\nVoc� errou todas :(\nEstude mais!");
		break;
				
		case 1:
		case 2:
		case 3: System.out.println("Sua pontua��o: "+resul+"/10\nVoc� foi muito mal :(\nEstude mais!");
		break;
			
		case 4:
		case 5:
		case 6: System.out.println("Sua pontua��o: "+resul+"/10\nVoc� n�o foi muito mal mas ainda da pra melhorar muito!");
		break;
		
		case 7:
		case 8:
		case 9: System.out.println("Sua pontua��o: "+resul+"/10\nVoc� foi muito bem\nContinue estudando!");
		break;
			
		case 10: System.out.println("Sua pontua��o: "+resul+"/10\nParab�ns, voc� acertou todas!\nContinue se esfor�ando!");
		break;
		
		default: System.out.println("Se tu tiver lendo isso, o programa bugo :(");
		break;
		}
		/*Fechando o Scanner*/
		sc.close();
	}

}
