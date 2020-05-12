package exercicios_switch;

import java.util.Scanner;

public class exercicio_switch_1 {

	public static void main(String[] args) {
		

	Scanner leitor = new Scanner(System.in);
	
	int num;
	
	System.out.print("Digite o código do produto: ");
	num = leitor.nextInt();
	
	switch(num) {
	
	case 001:
		System.out.print("Parafuso");
		break;
	case 002:
		System.out.print("Porca");
		break;
	case 003:
		System.out.print("Prego");
		break;
	case 004:
		System.out.print("Ferramenta");
		break;
	default:
		System.out.print("Diversos");
			
	}
	
	}

}
