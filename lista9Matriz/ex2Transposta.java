package lista9Matriz;

import java.util.Scanner;

public class ex2Transposta {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num;
		int [][] matriz = new int[3][3];
		int [][] matriztransposta = new int[3][3];
		
		for ( int linha = 0; linha < 3; linha++) {
			for( int coluna = 0; coluna <3; coluna++) {
				num = input.nextInt();
				matriz[linha][coluna] = num;
			}
		}
		
		System.out.println("Matriz inicial:");
		for ( int linha = 0; linha < 3; linha++) {
			for( int coluna = 0; coluna <3; coluna++) {
				System.out.print(matriz[linha][coluna] + " ");				
			}
			System.out.println();
		}
		
		System.out.println("Matriz transposta:");
		for ( int coluna = 0; coluna < 3; coluna++) {
			for( int linha = 0; linha <3; linha++) {
				System.out.print(matriz[linha][coluna] + " ");				
			}
			System.out.println();
		}
		
		
		
	}

}
