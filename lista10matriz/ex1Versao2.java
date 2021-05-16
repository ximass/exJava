package lista10matriz;

public class ex1Versao2 {
	   public static void main(String[] args) {
	        
	        int[][] matrizA = new int[8][8];
	        int[] vetorLin = new int[8];
	        int[] vetorCol = new int[8];
	        
	         // criação da matriz
	for (int linha = 0; linha < matrizA.length; linha++) {
	            for (int col = 0; col < matrizA[0].length; col++) {
	                matrizA[linha][col] = (int) (Math.random() * 5) + 1;
	                
	                // soma das linhas
	                if(linha==0){ // não precisa do if
	                    vetorLin[linha] += matrizA[0][col];
	                }
	if(linha==1){
	                    vetorLin[linha] += matrizA[1][col];
	                }
	                if(linha==2){
	                    vetorLin[linha] += matrizA[2][col];
	                }
	                if(linha==3){
	                    vetorLin[linha] += matrizA[3][col];
	                }
	if(linha==4){
	                    vetorLin[linha] += matrizA[4][col];
	                }
	                if(linha==5){
	                    vetorLin[linha] += matrizA[5][col];
	                }
	                if(linha==6){
	                    vetorLin[linha] += matrizA[6][col];
	                }
	if(linha==7){
	                    vetorLin[linha] += matrizA[7][col];
	                }
	                
	                // soma das colunas
	                if(col==0){
	                    vetorCol[col] += matrizA[linha][0];
	                }
	if(col==1){
	                    vetorCol[col] += matrizA[linha][1];
	                }
	                if(col==2){
	                    vetorCol[col] += matrizA[linha][2];
	                }
	                if(col==3){
	                    vetorCol[col] += matrizA[linha][3];
	                }
	if(col==4){
	                    vetorCol[col] += matrizA[linha][4];
	                }
	                if(col==5){
	                    vetorCol[col] += matrizA[linha][5];
	                }
	                if(col==6){
	                    vetorCol[col] += matrizA[linha][6];
	                }
	 if(col==7){
	                    vetorCol[col] += matrizA[linha][7];
	                }
	            }
	        }
	        
	        // mostra a matriz
	System.out.println("Matriz resultante:");
	        for (int linha = 0; linha < matrizA.length; linha++) {
	            for (int col = 0; col < matrizA[0].length; col++) {
	                System.out.print(matrizA[linha][col] + "\t");
	            }
	            System.out.println("\n");
	        }
	        System.out.println();
	        
	        // mostra o vetor das linhas
	System.out.println("Vetor da soma das linhas:");
	        for(int ind=0; ind<vetorLin.length; ind++){
	            System.out.print(vetorLin[ind]+"  ");
	        }
	        System.out.println("\n");
	        
	        // mostra o vetor das colunas
	System.out.println("Vetor da soma das colunas:");
	        for(int ind=0; ind<vetorLin.length; ind++){
	            System.out.print(vetorCol[ind]+"  ");
	        }
	        System.out.println("\n");
	    }
	    
	}

