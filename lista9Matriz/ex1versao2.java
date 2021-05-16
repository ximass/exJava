package lista9Matriz;

public class ex1versao2 {
	  public static void main (String args[]) {
	    
		int [][] mat = new int [5][5]; //cria matriz
	    int lin;//cria variavel
	    int col;
	    int ind;
	    int somaLinha4;
	    int somaColuna2;
	    int somaDiagonalP;
	    int somaDiagonalS;
	    int somaTodos;
	    somaLinha4 = 0;// seta variavel
	    somaColuna2 = 0;
	    somaDiagonalP = 0;
	    somaDiagonalS = 0;
	    somaTodos = 0;

	    System.out.print ("\t");//printa um tab
	    for (col = 0; col < mat[0].length; col ++) {  //cria as colunas da matriz
	      System.out.print ("\t"+col);
	    }
	    System.out.print ("\n");
	    for (lin = 0; lin < mat.length; lin ++) { //cria as linhas da matriz
	        System.out.print (lin+"\t\t"); 
	        for (col = 0; col < mat[0].length; col ++) { //cria as colunas da matriz
	        	mat[lin][col] = (int)(Math.random() * 11); //gera valores aleatorios para a matriz
	       
	        		somaTodos = somaTodos + mat[lin][col];
	        		System.out.print (mat[lin][col]+"\t");
	      }
	        System.out.print ("\n"); //printa uma linha em branco
	    }

	    somaLinha4 = 0;
	    for (col = 0; col < mat[0].length; col ++) { //faz um for pra somar a linha 4
	    	somaLinha4 = somaLinha4 + mat[3][col];
	    }
	    System.out.println ("A soma dos elementos da linha 4 é "+somaLinha4);
	 
	    somaColuna2 = 0;
	    for (lin = 0; lin < mat.length; lin ++) { //faz um for para somar a coluna 2
	    	somaColuna2 = somaColuna2 + mat[lin][1];
	    }
	    System.out.println ("A soma dos elementos da coluna 2 é "+somaColuna2);
	 
	    if (mat.length == mat[0].length) { //faz um for para somar a diagonal primaria
	      somaDiagonalP = 0;
	      for (ind = 0; ind < mat.length; ind ++) {
	    	  somaDiagonalP = somaDiagonalP + mat[ind][ind];
	      }
	      System.out.println ("A soma dos elementos da diagonal principal é "+somaDiagonalP);
	    }
	    
	    if (mat.length == mat[0].length) { //faz um for para somar a diagonal secundaria
	      somaDiagonalS = 0;
	      for (ind = 0; ind < mat.length; ind ++) {
	        somaDiagonalS = somaDiagonalS + mat[ind][(mat.length-1)-ind];
	      }
	      System.out.println ("A soma dos elementos da diagonal secundária é "+somaDiagonalS);
	      System.out.println ("A soma de todos os elementos da matriz é "+somaTodos);
	    }
	  }  
	}

	

