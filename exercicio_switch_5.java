package exercicios_switch;

import java.util.Scanner;

public class exercicio_switch_5 {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
	
	float valor, valor3x;
	int cod;
	
	
	System.out.print("Digite o valor final da compra: ");
	valor = leitor.nextFloat();
	
	System.out.println("Op��es de pagamento");
	System.out.println("1 - A vista em dinheiro ou cheque, com 10% de desconto");
	System.out.println("2 - A vista com cart�o de cr�dito, com 5% de desconto");
	System.out.println("3 - Em duas vezes, pre�o normal de etiqueta sem juros");
	System.out.println("4 - Em tres vezes, pre�o de etiqueta com acr�scimo de 10%");
	System.out.print("Digite o c�digo equivalente a op��o desejada: ");
	cod = leitor.nextInt();
	
	valor3x = valor+((valor*10)/100);
	
	
	switch(cod) {
	
		case 1:
			System.out.print("Total de R$: ");
			System.out.print(valor-((valor*10)/100));
			break;
			
		case 2:
			System.out.print("Total de R$: ");
			System.out.print(valor-((valor*5)/100));
			break;
			
		case 3:
			System.out.print("Duas vezes de R$ ");
			System.out.print(valor/2);
			break;
			
		case 4:
			System.out.print("Tres vezes de R$: ");
			System.out.print((valor3x)/3);
			break;
			
		default:
			System.out.print("Op��o inv�lida.");
			
			
	}
	
	
	
	
	
		

	}

}
