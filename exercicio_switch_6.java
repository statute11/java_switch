package exercicios_switch;

import java.util.Scanner;

public class exercicio_switch_6 {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
	
	int cod;
	float salario;
	
	System.out.print("Digite o código do cargo: ");
	cod = leitor.nextInt();
	
	System.out.print("Digite o salário: ");
	salario = leitor.nextFloat();
	
	switch(cod) {
	
		case 001:
			System.out.println("Diretor");
			System.out.print("Valor do salário antigo R$ ");
			System.out.println(salario);
			System.out.print("Valor do salário atual R$ ");
			System.out.println(salario+(salario*10)/100);
			System.out.print("Diferença do salário antigo para o atual R$ ");
			System.out.println((salario+(salario*10)/100)-salario);
			break;
			
		case 002:
			System.out.println("Engenheiro");
			System.out.print("Valor do salário antigo R$ ");
			System.out.println(salario);
			System.out.print("Valor do salário atual R$ ");
			System.out.println(salario+(salario*20)/100);
			System.out.print("Diferença do salário antigo para o atual R$ ");
			System.out.println((salario+(salario*20)/100)-salario);
			break;
		
		case 003:
			System.out.println("Técnico");
			System.out.print("Valor do salário antigo R$ ");
			System.out.println(salario);
			System.out.print("Valor do salário atual R$ ");
			System.out.println(salario+(salario*30)/100);
			System.out.print("Diferença do salário antigo para o atual R$ ");
			System.out.println((salario+(salario*30)/100)-salario);
			break;
			
		case 004:
			System.out.println("Gerente");
			System.out.print("Valor do salário antigo R$ ");
			System.out.println(salario);
			System.out.print("Valor do salário atual R$ ");
			System.out.println(salario+(salario*10)/100);
			System.out.print("Diferença do salário antigo para o atual R$ ");
			System.out.println((salario+(salario*10)/100)-salario);
			break;
			
		case 005:
			System.out.println("Analista");
			System.out.print("Valor do salário antigo R$ ");
			System.out.println(salario);
			System.out.print("Valor do salário atual R$ ");
			System.out.println(salario+(salario*30)/100);
			System.out.print("Diferença do salário antigo para o atual R$ ");
			System.out.println((salario+(salario*30)/100)-salario);
			break;
			
		case 006:
			System.out.println("Coordenador");
			System.out.print("Valor do salário antigo R$ ");
			System.out.println(salario);
			System.out.print("Valor do salário atual R$ ");
			System.out.println(salario+(salario*20)/100);
			System.out.print("Diferença do salário antigo para o atual R$ ");
			System.out.println((salario+(salario*20)/100)-salario);
			break;
			
		default:
			System.out.println("Outros");
			System.out.print("Valor do salário antigo R$ ");
			System.out.println(salario);
			System.out.print("Valor do salário atual R$ ");
			System.out.println(salario+(salario*40)/100);
			System.out.print("Diferença do salário antigo para o atual R$ ");
			System.out.println((salario+(salario*40)/100)-salario);
			
	}
	
	
	
	
	}

}
