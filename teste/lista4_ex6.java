package teste;

import java.util.Scanner;

public class lista4_ex6 {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		int contador = 0;
		Double precoavista = 0.0, preco, precoaprazo = 0.0, valortotal, primeiraprestacao;
		
		
		
		while ( contador < 5){
			System.out.println("Vamos as compras!:");
			System.out.println("Digite o pre�o do produto!");
			preco = input.nextDouble();
			System.out.println("Digite o c�digo referente a op��o de pagamento!");
			System.out.println("[V] para comprar � vista!");
			System.out.println("[P] para compras a prazo");
			String opcao = input.next();
			if ("v".equalsIgnoreCase(opcao)) {
				precoavista = precoavista + preco;}
			else if ("p".equalsIgnoreCase(opcao)) {
				precoaprazo = precoaprazo + preco;}
			else {
				System.out.println("Valor inv�lido!");}
			contador++;}
		
		valortotal = precoavista + precoaprazo;	
		primeiraprestacao = precoaprazo / 3;
		
		System.out.println("O valor total das compras a vista � de: " + precoavista);
		System.out.println("O valor total das compras a prazo � de: " + precoaprazo);
		System.out.println("O valor total das compras de: " + valortotal);
		System.out.println("O valor total da primeira presta��o � de: " + primeiraprestacao);
		
		
		
	}

}
