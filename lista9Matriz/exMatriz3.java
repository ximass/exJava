
import java.util.Scanner;

public class exMatriz3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int[] vetor1 = new int[3];
		int[] vetor2 = new int[3];
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				matriz[linha][coluna] = input.nextInt();
				vetor1[linha] = vetor1[linha] + matriz[linha][coluna];					
			}
		}
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.print(matriz[linha][coluna] + "\t");				
			}
			System.out.println();
		}
						
		for(int i=0; i < 3; i++) {
			vetor2[i] = vetor1[i];
			System.out.print(vetor2[i] + "  ");
		}
	}
}
