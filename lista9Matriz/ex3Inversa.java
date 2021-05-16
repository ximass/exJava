package lista9Matriz;

import java.util.Scanner;

public class ex3Inversa {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int [][] matriz = new int[2][2];
		int [][] matrizinversa = new int[2][2];
		int num;
		
		for ( int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				num = input.nextInt();
				matriz[linha][coluna] = num;
				matrizinversa[linha][coluna] = matriz[linha][coluna];
				
			}
		}
		
		
	
		System.out.println("Matriz original:");
		for ( int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz.length; coluna++) {
			System.out.print(matriz[linha][coluna] + " ");	
				
			}
			System.out.println();
		}
		System.out.println("Matriz inversa:");
		for ( int linha = matrizinversa.length - 1; linha >= 0; linha--) {
			for(int coluna = matrizinversa.length - 1; coluna >= 0; coluna--) {
				System.out.print(matrizinversa[linha][coluna] + " ");
			}
			System.out.println();
		}
	}
}
