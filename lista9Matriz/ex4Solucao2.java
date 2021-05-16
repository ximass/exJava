package lista9Matriz;

import java.util.Scanner;

public class ex4Solucao2 {
		  public static void main(String[] args){
		    
		    int [] v1 = new int [5];
		    int [] v2 = new int [5];
		    int [] v3 = new int [5];
		    int [] v4 = new int [5];
		    int [] v5 = new int [5];
		    int [][] m = new int [5][5];
		    int num,n=1;
		do{
		      System.out.println("Digite 5 valores para o vetor "+n);
		      System.out.println ();
		      for (int i = 0;i<5;i++){
		        num = Entrada.leiaInt ("Posição "+i);
		        v1 [i] = num;
		      } 
		      n++;
		System.out.println("Digite 5 valores para o vetor "+n);
		      System.out.println ();
		      for (int i = 0;i<5;i++){
		        num = Entrada.leiaInt ("Posição "+i);
		        v2 [i] = num;
		      } 
		      n++;
		System.out.println("Digite 5 valores para o vetor "+n);
		      System.out.println ();
		      for (int i = 0;i<5;i++){
		        num = Entrada.leiaInt ("Posição "+i);
		        v3 [i] = num;
		      } 
		      n++;
		System.out.println("Digite 5 valores para o vetor "+n);
		      System.out.println ();
		      for (int i = 0;i<5;i++){
		        num = Entrada.leiaInt ("Posição "+i);
		        v4 [i] = num;
		      } 
		      n++;
		System.out.println("Digite 5 valores para o vetor "+n);
		      System.out.println ();
		      for (int i = 0;i<5;i++){
		        num = Entrada.leiaInt ("Posição "+i);
		        v5 [i] = num;
		      }
		      n++;
		      
		    }while(n<6);
		 //Criando a matriz m
		    for (int j=0;j<5;j++){
		      m[0][j] = v1[j];
		      m[1][j] = v2[j];
		      m[2][j] = v3[j];
		      m[3][j] = v4[j];
		      m[4][j] = v5[j];
		    }
		    //Imprimindo matriz m sem alteração
		    System.out.println();
		    System.out.println("   Matriz m Original:");                  
		    for (int i=0;i<5;i++){
		for (int j=0;j<5;j++){
		        System.out.print(m[i][j]+"\t");
		      }
		      System.out.println();
		    }
		    //Colocando a matriz em ordem crescente
		     for (int i=0;i<5;i++){
		      for (int j=0;j<5;j++){
		        for (int k=0;k<5;k++){
		          for (int l=0;l<5;l++){
		            if (m[i][j] < m[k][l]){
		              num = m[i][j];
		              m[i][j] = m[k][l];
		              m[k][l] = num;
		            }
		          }
		        }
		      }
		    }
		System.out.println("\n\n");
		    System.out.println("    Matriz m em ordem Crescente:");
		    for(int i=0;i<5;i++){
		      for (int j=0;j<5;j++){
		        System.out.print(m[i][j]+"\t");
		      }
		      System.out.println();
		    }    
	  }
}
