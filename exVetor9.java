
import java.util.*;

public class exVetor9 {
	  public static void main(String args[]){
	    Scanner leia = new Scanner(System.in);
	    
	    int vetorA[] = new int[10]; // armazena os elementos do vetor A
	    int vetorB[] = new int[10]; // armazena os elementos do vetor B
	    int vetorC[] = new int[20]; // armazena os elementos do vetor C
	// sorteia os elementos do vetor A (1 a 10)
	    System.out.println("=====VETOR A=====");
	    for(int ind=0;ind<vetorA.length;ind++){
	      vetorA[ind] = (int)(Math.random() * 10) + 1;
	      System.out.print(vetorA[ind]+"  ");
	    }
	    System.out.println("\n");
	// sorteia os elementos do vetor B (1 a 10)
	    System.out.println("=====VETOR B=====");
	    for(int ind=0;ind<vetorB.length;ind++){
	      vetorB[ind] = (int)(Math.random() * 10) + 1;
	      System.out.print(vetorB[ind]+"  ");
	    }
	    System.out.println("\n");
	// união dos dois vetores
	    for(int ind=0;ind<10;ind++){
	      vetorC[ind] = vetorA[ind];
	      
	      vetorC[ind+10] = vetorB[ind];
	    }
	System.out.println("=====VETOR C=====");
	    for(int ind=0;ind<20;ind++){
	      System.out.print(vetorC[ind]+"  "); // teste para o armazenamento dos elementos no vetor C
	    }
	    System.out.println("\n");
	    
	    // ordenando o vetor em ordem crescente 
	    int temp; // variável auxiliar
	for(int ind=0;ind<20;ind++){
	      for(int j=ind+1;j<20;j++){ // índice +1
	        if(vetorC[ind]>vetorC[j]){
	          
	          temp=vetorC[ind];
	          vetorC[ind]=vetorC[j];
	          vetorC[j]=temp;
	        }
	      }
	    }
	// saída de dados
	    System.out.println("Vetor C ordenado em ordem crescente:\n");
	    for(int ind=0;ind<vetorC.length;ind++){
	      System.out.print(vetorC[ind]+"  ");
	    }
	    System.out.println("\n");
	  }
}
