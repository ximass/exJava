package teste;

import java.util.Scanner;

public class exMatriz4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[][] matriz = new int[10][20];
		int[] vetor1 = new int[20];
		int[] vetor2 = new int[20];
		
		for(int linha = 0; linha < 10; linha++) {
			for(int coluna = 0; coluna < 20; coluna++) {
				matriz[linha][coluna] = input.nextInt();
				vetor1[linha] = vetor1[linha] + matriz[linha][coluna];					
			}
		}
		
		for(int linha = 0; linha < 10; linha++) {
			for(int coluna = 0; coluna < 20; coluna++) {
				System.out.print(matriz[linha][coluna] + "\t");				
			}
			System.out.println();
		}
						
		for(int i=0; i < 20; i++) {
			vetor2[i] = vetor1[i] * vetor1[i];
			System.out.print(vetor2[i] + "  ");
		}
	}
}
