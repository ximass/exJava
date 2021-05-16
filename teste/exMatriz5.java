package teste;

import java.util.Scanner;

public class exMatriz5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[][] matriz = new int[3][4];
		int[] vetor1 = new int[4];
		int qnt = 0, preco = 0, valortotal = 0, auxiliar = 0, auxiliar2 = 9999, precototal = 0, precomedio = 0;
		
	
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 4; coluna++) {
				matriz[linha][coluna] = input.nextInt();
				if (linha == 1) {
					qnt = qnt + matriz[linha][coluna];
				}
				if (linha == 2) {
					preco = preco + matriz[linha][coluna];
					precototal = precototal + preco;
					
				}
				valortotal = qnt * preco;
				if (linha == 0 & matriz[linha][coluna] > auxiliar){
					auxiliar = matriz[linha][coluna];
				if (linha == 0 & matriz[linha][coluna] < auxiliar2){
					auxiliar2 = matriz[linha][coluna];
				}
				precomedio = precototal / 4;
				
				if (linha == 2 & matriz[linha][coluna] < precomedio ) {
					vetor1[coluna] = matriz[linha][coluna];
										
					
				}
					
				}
			}	
		}
		
		
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 4; coluna++) {
					System.out.print(matriz[linha][coluna] + "  ");
				}
			System.out.println();
			}
		
		System.out.println(valortotal);
		System.out.println(qnt);
		System.out.println("o cod do produto mais barato é:" + auxiliar2);
		System.out.println("o cod do produto mais caro é:" + auxiliar);
		System.out.println("o preço médio é:" + precomedio);
		
		
		System.out.print("preços abaixos da média: ");
		for(int i = 0; i < vetor1.length; i++) {
			System.out.print(vetor1[i] + " ");
		}
		}
		
	}

