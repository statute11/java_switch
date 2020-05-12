package exercicios_switch;

import java.util.Scanner;

public class exercicio_switch_2 {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
	
	int cod, qtd;
	float valor100, valor101, valor102, valor103, valor104, valor105, sum100, sum101, sum102, sum103, sum104, sum105;
	
	valor100 = (float) 3.20;
	valor101 = (float) 4.30;
	valor102 = (float) 5.50;
	valor103 = (float) 3.20;
	valor104 = (float) 4.30;
	valor105 = (float) 4.00;
	
	
	System.out.print("Digite o código do produto: ");
	cod = leitor.nextInt();
	
	System.out.print("Digite a quantidade consumida do produto: ");
	qtd = leitor.nextInt();
	
	sum100 = valor100 * qtd;
	sum101 = valor101 * qtd;
	sum102 = valor102 * qtd;
	sum103 = valor103 * qtd;
	sum104 = valor104 * qtd;
	sum105 = valor105 * qtd;
	
	switch(cod) {
		
		case 100:
			System.out.print(sum100);
			break;
			
		case 101:
			System.out.print(sum101);
			break;
			
		case 102:
			System.out.print(sum102);
			break;
			
		case 103:
			System.out.print(sum103);
			break;

		case 104:
			System.out.print(sum104);
			break;
			
		case 105:
			System.out.print(sum105);
			break;
			
		default:
			System.out.print("Código inválido.");
			
	}
	

	}

}
