package teste;

import java.util.Scanner;

public class lista_2_ex_6 {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		Float preco1;
		Double desconto, precofinal;
		
		
		System.out.print("Verifique as op��es de desconto:");
		System.out.println("At� R$ 30,00 n�o possui desconto!");
		System.out.println("Entre R$ 30,00 e R$ 100,00  possui desconto de 10%");
		System.out.println("Acima de R$ 100,00 possui desconto de 15%");
		System.out.println("Qual o pre�o do produto que deseja comprar?");
		preco1 = input.nextFloat();
		
		if ((preco1 < 30) && (preco1 > 0)){
			System.out.println("Voc� n�o possui desconto!");}
		else if ((preco1 >= 30) && (preco1 <= 100)) {
			System.out.println("Voc� possui desconto de 10%!");
			precofinal = preco1 - (preco1 * 0.1);
			desconto = preco1 - precofinal;
			System.out.println("O pre�o final ser� de " + precofinal);
			System.out.println("O desconto ser� de " + desconto);}
		else if (preco1 > 100) {
			System.out.println("Voc� possui desconto de 30%!");
			precofinal = preco1 - (preco1 * 0.3);
			desconto = preco1 - precofinal;
			System.out.println("O pre�o final ser� de " + precofinal);
			System.out.println("O desconto ser� de " + desconto);}
	}			
}
