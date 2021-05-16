package lista10matriz;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		int[][] matrizA = new int[3][8];
		int [][] matrizB = new int[3][8];
		int [][] matrizC = new int[3][8];
		int [][] matrizD = new int[3][8];
		
		for (int linha = 0; linha < 3; linha ++) {
			for (int coluna = 0; coluna <8; coluna++) {
				matrizA[linha][coluna] = (int) (Math.random() * 5) + 1;
			}
		}
		
		for (int linha = 0; linha < 3; linha ++) {
			for (int coluna = 0; coluna <8; coluna++) {
				matrizB[linha][coluna] = (int) (Math.random() * 5) + 1;
			}
		}
		
		for (int linha = 0; linha < 3; linha ++) {
			for (int coluna = 0; coluna <8; coluna++) {
				matrizC[linha][coluna] = matrizA[linha][coluna] + matrizB[linha][coluna];
			}
		}
		
		for (int linha = 0; linha < 3; linha ++) {
			for (int coluna = 0; coluna <8; coluna++) {
				matrizD[linha][coluna] = matrizA[linha][coluna] - matrizB[linha][coluna];
			}
		}
		
		
		System.out.println("Primeira Matriz:");
		for (int linha = 0; linha < 3; linha ++) {
			for (int coluna = 0; coluna <8; coluna++) {
				System.out.print(matrizA[linha][coluna] + " ");				
			}
			System.out.println();
		}
		
		System.out.println("Segunda Matriz:");
		for (int linha = 0; linha < 3; linha ++) {
			for (int coluna = 0; coluna <8; coluna++) {
				System.out.print(matrizB[linha][coluna] + " ");				
			}
			System.out.println();
		}
		
		System.out.println("Terceira Matriz:");
		for (int linha = 0; linha < 3; linha ++) {
			for (int coluna = 0; coluna <8; coluna++) {
				System.out.print(matrizC[linha][coluna] + " ");				
			}
			System.out.println();
		}
		
		System.out.println("Primeira Matriz:");
		for (int linha = 0; linha < 3; linha ++) {
			for (int coluna = 0; coluna <8; coluna++) {
				System.out.print(matrizA[linha][coluna] + " ");				
			}
			System.out.println();
		}
		
		System.out.println("Quarta Matriz:");
		for (int linha = 0; linha < 3; linha ++) {
			for (int coluna = 0; coluna <8; coluna++) {
				System.out.print(matrizD[linha][coluna] + " ");				
			}
			System.out.println();
		}
		
	}

}
