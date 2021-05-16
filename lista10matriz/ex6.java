package lista10matriz;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[][] matrizA = new int[4][7];
		int[][] matrizB = new int[4][7];
		int[][] matrizC = new int[4][7];
		int[][] matrizD = new int[4][7];
		int[][] matrizE = new int[4][7];
		
		int somaA = 0, somaB = 0, somaC = 0, somaD = 0, somaE = 0, somatotal;
		int somaSemana1 = 0, somaSemana2 = 0, somaSemana3 = 0, somaSemana4 = 0, somaSemana5 = 0;
		
		for(int linha = 0; linha < 4; linha++) {
			for(int coluna = 0; coluna < 7; coluna++) {
				matrizA[linha][coluna] = (int) (Math.random() * 10) +1;
				if (linha == 0) {
					somaSemana1 = somaSemana1 + matrizA[linha][coluna];
				}
				if (linha == 1) {
					somaSemana2 = somaSemana2 + matrizA[linha][coluna];
				}
				if (linha == 2) {
					somaSemana3 = somaSemana3 + matrizA[linha][coluna];
				}
				if (linha == 3) {
					somaSemana4 = somaSemana4 + matrizA[linha][coluna];
				}
			}
		}
		
		for(int linha = 0; linha < 4; linha++) {
			for(int coluna = 0; coluna < 7; coluna++) {
				matrizB[linha][coluna] = (int) (Math.random() * 10) +1;
				if (linha == 0) {
					somaSemana1 = somaSemana1 + matrizB[linha][coluna];
				}
				if (linha == 1) {
					somaSemana2 = somaSemana2 + matrizB[linha][coluna];
				}
				if (linha == 2) {
					somaSemana3 = somaSemana3 + matrizB[linha][coluna];
				}
				if (linha == 3) {
					somaSemana4 = somaSemana4 + matrizB[linha][coluna];
				}
			}
		}
		
		for(int linha = 0; linha < 4; linha++) {
			for(int coluna = 0; coluna < 7; coluna++) {
				matrizC[linha][coluna] = (int) (Math.random() * 10) +1;
				if (linha == 0) {
					somaSemana1 = somaSemana1 + matrizC[linha][coluna];
				}
				if (linha == 1) {
					somaSemana2 = somaSemana2 + matrizC[linha][coluna];
				}
				if (linha == 2) {
					somaSemana3 = somaSemana3 + matrizC[linha][coluna];
				}
				if (linha == 3) {
					somaSemana4 = somaSemana4 + matrizC[linha][coluna];
				}
			}
		}
		
		for(int linha = 0; linha < 4; linha++) {
			for(int coluna = 0; coluna < 7; coluna++) {
				matrizD[linha][coluna] = (int) (Math.random() * 10) +1;
				if (linha == 0) {
					somaSemana1 = somaSemana1 + matrizD[linha][coluna];
				}
				if (linha == 1) {
					somaSemana2 = somaSemana2 + matrizD[linha][coluna];
				}
				if (linha == 2) {
					somaSemana3 = somaSemana3 + matrizD[linha][coluna];
				}
				if (linha == 3) {
					somaSemana4 = somaSemana4 + matrizD[linha][coluna];
				}
			}
		}
		
		for(int linha = 0; linha < 4; linha++) {
			for(int coluna = 0; coluna < 7; coluna++) {
				matrizE[linha][coluna] = (int) (Math.random() * 10) +1;
				if (linha == 0) {
					somaSemana1 = somaSemana1 + matrizE[linha][coluna];
				}
				if (linha == 1) {
					somaSemana2 = somaSemana2 + matrizE[linha][coluna];
				}
				if (linha == 2) {
					somaSemana3 = somaSemana3 + matrizE[linha][coluna];
				}
				if (linha == 3) {
					somaSemana4 = somaSemana4 + matrizE[linha][coluna];
				}
			}
		}
		
		System.out.println("Vendedor A:");
		for(int linha = 0; linha < 4; linha++) {
			for(int coluna = 0; coluna < 7; coluna++) {
				System.out.print(matrizA[linha][coluna]+ " ");
				somaA = somaA + matrizA[linha][coluna];
			}
			System.out.println();
		}
		
		System.out.println("Vendedor B:");
		for(int linha = 0; linha < 4; linha++) {
			for(int coluna = 0; coluna < 7; coluna++) {
				System.out.print(matrizB[linha][coluna] + " ");
				somaB = somaB + matrizB[linha][coluna];
			}
			System.out.println();
		}
		
		System.out.println("Vendedor C:");
		for(int linha = 0; linha < 4; linha++) {
			for(int coluna = 0; coluna < 7; coluna++) {
				System.out.print(matrizC[linha][coluna]+ " ");
				somaC = somaC + matrizC[linha][coluna];
			}
			System.out.println();
		}
		
		System.out.println("Vendedor D:");
		for(int linha = 0; linha < 4; linha++) {
			for(int coluna = 0; coluna < 7; coluna++) {
				System.out.print(matrizD[linha][coluna]+ " ");
				somaD = somaD + matrizD[linha][coluna];
			}
			System.out.println();
		}
		
		System.out.println("Vendedor E:");
		for(int linha = 0; linha < 4; linha++) {
			for(int coluna = 0; coluna < 7; coluna++) {
				System.out.print(matrizE[linha][coluna]+ " ");
				somaE = somaE + matrizE[linha][coluna];
			}
			System.out.println();
		}
		
		System.out.println("Soma total do vendedor A: " + somaA);
		System.out.println("Soma total do vendedor B: " + somaB);
		System.out.println("Soma total do vendedor C: " + somaC);
		System.out.println("Soma total do vendedor D: " + somaD);
		System.out.println("Soma total do vendedor E: " + somaE);
		
		System.out.println("Soma total de venda semana 1: " + somaSemana1);
		System.out.println("Soma total de venda semana 2: " + somaSemana2);
		System.out.println("Soma total de venda semana 3: " + somaSemana3);
		System.out.println("Soma total de venda semana 4: " + somaSemana4);
		
		somatotal = somaSemana1 + somaSemana2 + somaSemana3 + somaSemana4;
		
		System.out.println("Soma total das vendas do mês:" + somatotal);
		
		
		
	}
}
