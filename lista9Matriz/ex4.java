package lista9Matriz;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		
		int num;
		Scanner input = new Scanner(System.in);
		int[] vetor1 = new int[2];
		int[] vetor2 = new int[2];
		int[] vetor3 = new int[2];
		int[] vetor4 = new int[2];
		int[] vetor5 = new int[2];
		int[][] matriz = new int[5][2];
		
		for( int i = 0; i < 2; i++) {
			num = input.nextInt();
			vetor1[i] = num;
		}
		for( int i = 0; i < 2; i++) {
			num = input.nextInt();
			vetor2[i] = num;
		}
		for( int i = 0; i < 2; i++) {
			num = input.nextInt();
			vetor3[i] = num;
		}
		for( int i = 0; i < 2; i++) {
			num = input.nextInt();
			vetor4[i] = num;
		}
		for( int i = 0; i < 2; i++) {
			num = input.nextInt();
			vetor5[i] = num;
		}
		
		for(int linha = 0; linha < 5; linha++) {
			for( int coluna = 0; coluna < 2; coluna++) {
				if (linha == 0) {
					matriz[linha][coluna] = vetor1[coluna];
				}
				if (linha == 1) {
					matriz[linha][coluna] = vetor2[coluna];
				}
				if (linha == 2) {
					matriz[linha][coluna] = vetor3[coluna];
				}
				if (linha == 3) {
					matriz[linha][coluna] = vetor4[coluna];
				}
				if (linha == 4) {
					matriz[linha][coluna] = vetor5[coluna];
				}
			}
		}
		
		System.out.println("Matriz formada:");
		for(int linha = 0; linha < 5; linha++) {
			for( int coluna = 0; coluna < 2; coluna ++) {
				System.out.print(matriz[linha][coluna] + " ");				
			}
			System.out.println();
		}
	}
}
