package teste;

import java.util.Scanner;

public class avaliativa1 {
	public static void main(String args[]){
		
	
		Scanner input = new Scanner(System.in);
		
		Character codigo;
		Double preco1, precofinal, desconto;
		
		System.out.println("=====TABELA DE DESCONTOS====");
		System.out.println("Produto de c�digo 'a': 20%");
		System.out.println("Produto de c�digo 'b': 10%");
		System.out.println("Demais c�digos, sem desconto!");
		
		System.out.println("Digite o c�digo do produto:");
		codigo = input.next().charAt(0);
		System.out.println("Digite o pre�o do produto:");
		preco1 = input.nextDouble();
		
		if (codigo == 'a' || (codigo == 'A')){
			if (preco1 >= 80) {
				System.out.println("O produto possui 30% de desconto!");
				precofinal = preco1 - (preco1 * 0.3);
				desconto = preco1 * 0.3;
				System.out.println("O total a pagar ser� de:" + precofinal);
				System.out.println("O valor do desconto ser� de:" + desconto);}
			else {
				System.out.println("O produto possui 20% de desconto!");
				precofinal = preco1 - (preco1 * 0.2);
				desconto = preco1 * 0.2;
				System.out.println("O total a pagar ser� de:" + precofinal);
				System.out.println("O valor do desconto ser� de:" + desconto);}}
		
		else if (codigo == 'b' || (codigo == 'B')){
			if (preco1 >= 80) {
					System.out.println("O produto possui 20% de desconto!");
					precofinal = preco1 - (preco1 * 0.2);
					desconto = preco1 * 0.2;
					System.out.println("O total a pagar ser� de:" + precofinal);
					System.out.println("O valor do desconto ser� de:" + desconto);}
			else {
					System.out.println("O produto possui 10% de desconto!");
					precofinal = preco1 - (preco1 * 0.1);
					desconto = preco1 * 0.1;
					System.out.println("O total a pagar ser� de:" + precofinal);
					System.out.println("O valor do desconto ser� de:" + desconto);}}
		else {
			System.out.println("O produto n�o possui desconto!");
			System.out.println("Voc� dever� pagar:" + preco1);}
			
		}	
		}
		
		
		
		
		
		
		
	
	


