
import java.util.Scanner;

public class exVetor4 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		int[] array = new int[3];
		int[] arraypares = new int[3];
		int[] arrayimpares = new int[3];
		int num, somapares = 0, contpares = 0, somaimpares = 0, contimpares = 0;
		
		System.out.println("Digite seis números:");
		for ( int i = 0; i < array.length; i++){			
			array[i] = input.nextInt();
			if ( array[i] % 2 == 0) {
				somapares = somapares + array[i];
				contpares++;
				arraypares[i] = array[i];
			}
			else {
				somaimpares = somaimpares + array[i];
				contimpares++;
				arrayimpares[i] = array[i];
			}	
		}
		
		System.out.println("Números pares:");
		for(int i = 0; i < 3; i++) {
			if (arraypares[i] != 0) {
				System.out.println(arraypares[i]);}
		}
		System.out.println("A quantidade de números pares é:" + contpares);
		
		System.out.println("Números impares:");
		for(int i = 0; i < 3; i++) {
			if (arrayimpares[i] != 0) {
				System.out.println(arrayimpares[i]);}			
		}
			
		System.out.println("A quantidade de números impares é:" + contimpares);
	}

}
