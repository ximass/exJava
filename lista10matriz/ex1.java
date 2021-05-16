package lista10matriz;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[][] matriz = new int[8][8];
		int[] vetorLinha = new int[8];
		int[] vetorColuna = new int[8];
		int num, somalinha = 0;
		
		for(int linha = 0; linha < 8; linha++) {
			for(int coluna = 0; coluna < 8; coluna++) {
				matriz[linha][coluna] = (int) (Math.random() * 5) + 1;
				
				if(linha==0){ // não precisa do if
                    vetorLinha[linha] += matriz[0][coluna];
                }
				if(linha==1){
					vetorLinha[linha] += matriz[1][coluna];
                }
                if(linha==2){
                	vetorLinha[linha] += matriz[2][coluna];
                }
                if(linha==3){
                	vetorLinha[linha] += matriz[3][coluna];
                }
                if(linha==4){
                	vetorLinha[linha] += matriz[4][coluna];
                }
                if(linha==5){
                	vetorLinha[linha] += matriz[5][coluna];
                }
                if(linha==6){
                	vetorLinha[linha] += matriz[6][coluna];
                }
                if(linha==7){
                	vetorLinha[linha] += matriz[7][coluna];
                }
                
                // soma das colunas
                if(coluna==0){
                    vetorColuna[coluna] += matriz[linha][0];
                }
                if(coluna==1){
                	vetorColuna[coluna] += matriz[linha][1];
                }
                if(coluna==2){
                	vetorColuna[coluna] += matriz[linha][2];
                }
                if(coluna==3){
                	vetorColuna[coluna] += matriz[linha][3];
                }
                if(coluna==4){
                	vetorColuna[coluna] += matriz[linha][4];
                }
                if(coluna==5){
                	vetorColuna[coluna] += matriz[linha][5];
                }
                if(coluna==6){
                	vetorColuna[coluna] += matriz[linha][6];
                }
                if(coluna==7){
                	vetorColuna[coluna] += matriz[linha][7];			
			}

		}
		}
		
		for(int linha = 0; linha < 8; linha++) {
			for(int coluna = 0; coluna < 8; coluna++) {
				System.out.print(matriz[linha][coluna] + " ");				
			}
			System.out.println();
					
		}
		
		System.out.println("vetor linha:");
		for(int i = 0; i < 8; i++) {
			System.out.print(vetorLinha[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("vetor coluna:");
		for(int i = 0; i < 8; i++) {
			System.out.print(vetorColuna[i] + " ");
		}

	}

}
