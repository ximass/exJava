package lista9Matriz;

public class ex2versao2 {
		  public static void main (String args[]) {
		    // inicia a classe
		    int [][] matOri = new int [3][3];
		    //inicia a matriz original
		    int [][] matTrp = new int [3][3];
		    //inicia a matriz transposta
		    int lin;
		    int col;
		    //inicia as variaveis
		    for (lin = 0; lin < matOri.length; lin ++) {
		      for (col = 0; col < matOri[0].length; col ++) {//[0] faz com que verifique as colunas
		        matOri[lin][col] = Entrada.leiaInt ("Matriz original ["+lin+"]["+col+"] = ");
		        matTrp[col][lin] = matOri[lin][col];
		      }
		    }
		    //faz um for para criar a matriz original e seta a matriz transposta como igual a a original porem invertendo coluna x linha
		    
		    for (lin = 0; lin < matOri.length; lin ++) {
		      for (col = 0; col < matOri[0].length; col ++) {
		        System.out.print (matOri[lin][col]+"\t");
		      }
		      System.out.println ();
		    }
		    //printa a matriz original
		    
		    for (lin = 0; lin < matTrp.length; lin ++) {
		      for (col = 0; col < matTrp[0].length; col ++) {
		        System.out.print (matTrp[lin][col]+"\t");
		      }
		      System.out.println ();
		    }// printa a matriz transposta
		  }  
		}