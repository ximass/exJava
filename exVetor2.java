
import java.util.Scanner;

public class exVetor2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] vetor1 = new int[3];
		int[] vetor2 = new int[3];
		int[] vetor3 = new int[3];
		
		for( int i = 0; i < 3; i++) {
			System.out.println("Digite o valor do indice " + i + ":");
			vetor1[i] = input.nextInt(); 
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Digite o valor do indice " + i + ":");
			vetor2[i] = input.nextInt(); 			
		}
		
		
		vetor3 = vetor2;
		vetor2 = vetor1;
		vetor1 = vetor3;
		
		for(int i = 0; i < 3; i++) {
			System.out.println(vetor1[i]);
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println(vetor2[i]);
		}
		
		
		
	}

}
