package exercicios_switch;

import java.util.Scanner;

public class exercicio_switch_4 {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
	
	float nota1, nota2, nota3, DefProva1, DefProva2, DefProva3, medPond, medArit;
	int num, peso1, peso2, peso3, somapeso;
	
	peso1 = 3;
	peso2 = 3;
	peso3 = 4;
	somapeso = peso1 + peso2 + peso3;
	
	
	
	System.out.print("Digite a nota da prova 1: ");
	nota1 = leitor.nextFloat();
	
	System.out.print("Digite a nota da prova 2: ");
	nota2 = leitor.nextFloat();
	
	System.out.print("Digite a nota da prova 3: ");
	nota3 = leitor.nextFloat();
	
	System.out.println("Escolha qual o tipo de média deseja utilizar");
	System.out.println("1 - Média Aritmética");
	System.out.println("2 - Média Ponderada");
	System.out.print("Digite o número da opção desejada: ");
	num = leitor.nextInt();
	
	DefProva1 = nota1*peso1;
	DefProva2 = nota2*peso2;
	DefProva3 = nota3*peso3;
	medPond = (DefProva1 + DefProva2 + DefProva3)/ somapeso;
	medArit = (nota1 + nota2 + nota3)/3;
	
	switch(num) {
	
	case 1:
		System.out.print(medArit);
		break;
		
	case 2:
		System.out.print(medPond);
		break;
	
	default:
		System.out.print("Opção inválida");
		
		
	}
	
	
	
	
	

		
		
		
	}

}
