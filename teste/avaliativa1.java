package teste;

import java.util.Scanner;

public class avaliativa1 {
	public static void main(String args[]){
		
	
		Scanner input = new Scanner(System.in);
		
		Character codigo;
		Double preco1, precofinal, desconto;
		
		System.out.println("=====TABELA DE DESCONTOS====");
		System.out.println("Produto de código 'a': 20%");
		System.out.println("Produto de código 'b': 10%");
		System.out.println("Demais códigos, sem desconto!");
		
		System.out.println("Digite o código do produto:");
		codigo = input.next().charAt(0);
		System.out.println("Digite o preço do produto:");
		preco1 = input.nextDouble();
		
		if (codigo == 'a' || (codigo == 'A')){
			if (preco1 >= 80) {
				System.out.println("O produto possui 30% de desconto!");
				precofinal = preco1 - (preco1 * 0.3);
				desconto = preco1 * 0.3;
				System.out.println("O total a pagar será de:" + precofinal);
				System.out.println("O valor do desconto será de:" + desconto);}
			else {
				System.out.println("O produto possui 20% de desconto!");
				precofinal = preco1 - (preco1 * 0.2);
				desconto = preco1 * 0.2;
				System.out.println("O total a pagar será de:" + precofinal);
				System.out.println("O valor do desconto será de:" + desconto);}}
		
		else if (codigo == 'b' || (codigo == 'B')){
			if (preco1 >= 80) {
					System.out.println("O produto possui 20% de desconto!");
					precofinal = preco1 - (preco1 * 0.2);
					desconto = preco1 * 0.2;
					System.out.println("O total a pagar será de:" + precofinal);
					System.out.println("O valor do desconto será de:" + desconto);}
			else {
					System.out.println("O produto possui 10% de desconto!");
					precofinal = preco1 - (preco1 * 0.1);
					desconto = preco1 * 0.1;
					System.out.println("O total a pagar será de:" + precofinal);
					System.out.println("O valor do desconto será de:" + desconto);}}
		else {
			System.out.println("O produto não possui desconto!");
			System.out.println("Você deverá pagar:" + preco1);}
			
		}	
		}
		
		
		
		
		
		
		
	
	


