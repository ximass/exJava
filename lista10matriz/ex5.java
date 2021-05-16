package lista10matriz;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {

		int[][] matrizB = new int [5][5];
		int[][] matriz = new int [5][5];
		int numMaior = 0;
		
		for (int linha = 0; linha < 5; linha ++) {
			for (int coluna = 0; coluna <5; coluna++) {
				matriz[linha][coluna] = (int) (Math.random() * 5) + 1;
				if (matriz[linha][coluna] > numMaior) {
					numMaior = matriz[linha][coluna];
				}	
			}
		}
			
		for (int linha = 0; linha < 5; linha ++) {
			for (int coluna = 0; coluna <5; coluna++) {
				if (linha == coluna) {
					matrizB[linha][coluna] = matriz[linha][coluna] * numMaior;				
				}
				else {
					matrizB[linha][coluna] = matriz[linha][coluna];
				}
			}
		}		
	

		for (int linha = 0; linha < 5; linha ++) {
			for (int coluna = 0; coluna <5; coluna++) {
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println();
		}
		
		System.out.println("maior valor:" + numMaior);
		System.out.println("matriz original");
		for (int linha = 0; linha < 5; linha ++) {
			for (int coluna = 0; coluna <5; coluna++) {
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("matriz multiplicada");
		for (int linha = 0; linha < 5; linha ++) {
			for (int coluna = 0; coluna <5; coluna++) {
				System.out.print(matrizB[linha][coluna] + " ");
			}
			System.out.println();
		}
	}
}

