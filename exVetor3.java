import java.util.Scanner;

public class exVetor3 {
	  public static void main(String[]args){    
	    String[] nomes = new String[3];
	    String[] nomesAC = new String[nomes.length];
	    Scanner leia = new Scanner(System.in);
	    for(int i = 0; i < nomes.length; i++){
	      System.out.println("Informe o " + i + "º nome da lista");
	      nomes[i] = leia.next();      
	    }
	    System.out.println("LISTA NOMES: ");
	    for(int i = 0; i < nomes.length; i++){
	      nomesAC[i] = nomes[i]; 
	     
	 System.out.println(nomes[i]);  
	    }
	    System.out.println("LISTA NOMES AO CONTRÁRIO: ");
	    for(int i = 2; i >=0; i--){
	      System.out.println(nomesAC[i]);
	    }
	  }
	} 