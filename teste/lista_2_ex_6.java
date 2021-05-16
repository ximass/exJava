package teste;

import java.util.Scanner;

public class lista_2_ex_6 {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		Float preco1;
		Double desconto, precofinal;
		
		
		System.out.print("Verifique as opções de desconto:");
		System.out.println("Até R$ 30,00 não possui desconto!");
		System.out.println("Entre R$ 30,00 e R$ 100,00  possui desconto de 10%");
		System.out.println("Acima de R$ 100,00 possui desconto de 15%");
		System.out.println("Qual o preço do produto que deseja comprar?");
		preco1 = input.nextFloat();
		
		if ((preco1 < 30) && (preco1 > 0)){
			System.out.println("Você não possui desconto!");}
		else if ((preco1 >= 30) && (preco1 <= 100)) {
			System.out.println("Você possui desconto de 10%!");
			precofinal = preco1 - (preco1 * 0.1);
			desconto = preco1 - precofinal;
			System.out.println("O preço final será de " + precofinal);
			System.out.println("O desconto será de " + desconto);}
		else if (preco1 > 100) {
			System.out.println("Você possui desconto de 30%!");
			precofinal = preco1 - (preco1 * 0.3);
			desconto = preco1 - precofinal;
			System.out.println("O preço final será de " + precofinal);
			System.out.println("O desconto será de " + desconto);}
	}			
}
