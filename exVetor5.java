
import java.util.Scanner;

public class exVetor5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] array = new int[7];
		int[] arraymultiplos2 = new int[7];
		int[] arraymultiplos3 = new int[7];
		int[] arraymultiplosambos = new int[7];
		
		System.out.println("Digite sete números:");
		for( int i = 0; i < 7; i++) {
			array[i] = input.nextInt();
			if (array[i] % 2 == 0) {
				arraymultiplos2[i] = array[i];				
			}
			if (array[i] % 3 == 0) {
				arraymultiplos3[i] = array[i];				
			}
			if (array[i] % 2 == 0 & array[i] % 3 == 0) {
				arraymultiplosambos[i] = array[i];				
			}
			
		}
		
		System.out.println("Números divisíveis por 2:");
		for(int i = 0; i < 7; i++) {
			if(arraymultiplos2[i] != 0) {
				System.out.println(arraymultiplos2[i]);
			}
		}
		
		System.out.println("Números divisíveis por 3:");
		for(int i = 0; i < 7; i++) {
			if(arraymultiplos3[i] != 0) {
				System.out.println(arraymultiplos3[i]);
			}
		}
		
		System.out.println("Números divisíveis por 2 e 3:");
		for(int i = 0; i < 7; i++) {
			if(arraymultiplosambos[i] != 0) {
				System.out.println(arraymultiplosambos[i]);
			}	
		}
	}
}
