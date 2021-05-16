package lista9Matriz;

import java.util.Scanner;

public class ex1Diagonais {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num, somalinha4 = 0, somacoluna2 = 0, somadiagonalprincipal = 0, somadiagonalsecundaria = 0, somatotal = 0;
		int[][] matriz = new int[5][5];
		
		for ( int linha = 0; linha < 5; linha++) {
			for( int coluna = 0; coluna < 5; coluna++) {
				num = input.nextInt();
				matriz[linha][coluna] = num;
				somatotal = somatotal + matriz[linha][coluna];
				
				if (linha == 3) {
					somalinha4 = somalinha4 + matriz[linha][coluna];
				}
				if (coluna == 1) {
					somacoluna2 = somacoluna2 + matriz[linha][coluna];
				}
				if (linha == coluna) {
					somadiagonalprincipal = somadiagonalprincipal + matriz[linha][coluna];
				}
				if (linha + coluna == matriz.length - 1) {
					somadiagonalsecundaria = somadiagonalsecundaria + matriz[linha][coluna];
				}
			}
		}
		
		for ( int linha = 0; linha < 5; linha++) {
			for( int coluna = 0; coluna < 5; coluna++) {
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println();
		}
		
		System.out.println("A soma da linha 4 é:" + somalinha4);
		System.out.println("A soma da coluna 2 é:" + somacoluna2);
		System.out.println("Soma da diagonal principal:" + somadiagonalprincipal);
		System.out.println("Soma da diagonal secundária:" + somadiagonalsecundaria);
		System.out.println("Soma total:" + somatotal);
		
	}
}
