package exercicios_switch;

import java.util.Scanner;

public class exercicio_switch_3 {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
	
	int num;
	
	System.out.println("Menu");
	System.out.println("Op��o 1 - 1");
	System.out.println("Op��o 2 - 2");
	System.out.println("Op��o 3 - 3");
	System.out.println("Opc�o 4 - 4");
	System.out.print("Digite o n�mero da op��o que deseja escolher: 1");
	num = leitor.nextInt();
	
	switch(num) {
	
	case 1:
		System.out.print("Executa a rotina de Inclus�o de Alunos");
		break;
		
	case 2:
		System.out.print("Executa a rotina de Altera��o de Alunos");
		break;
		
	case 3:
		System.out.print("Executa a rotina de Exclus�o de Alunos");
		break;
		
	case 4:
		System.out.print("Executa a Rotina de Consulta de Alunos");
		break;
		
	default:
		System.out.print("Op��o inv�lida.");
	
	}
	
	
	

	}

}
