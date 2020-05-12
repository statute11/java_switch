package exercicios_switch;

import java.util.Scanner;

public class exercicio_switch_3 {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
	
	int num;
	
	System.out.println("Menu");
	System.out.println("Opção 1 - 1");
	System.out.println("Opção 2 - 2");
	System.out.println("Opção 3 - 3");
	System.out.println("Opcão 4 - 4");
	System.out.print("Digite o número da opção que deseja escolher: 1");
	num = leitor.nextInt();
	
	switch(num) {
	
	case 1:
		System.out.print("Executa a rotina de Inclusão de Alunos");
		break;
		
	case 2:
		System.out.print("Executa a rotina de Alteração de Alunos");
		break;
		
	case 3:
		System.out.print("Executa a rotina de Exclusão de Alunos");
		break;
		
	case 4:
		System.out.print("Executa a Rotina de Consulta de Alunos");
		break;
		
	default:
		System.out.print("Opção inválida.");
	
	}
	
	
	

	}

}
