
import java.util.Scanner;

public class exVetor7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] arrayA = new int[4];
		int[] arrayB = new int[4];
		int[] arrayC = new int[4];
		int[] arrayBinvertido = new int[arrayB.length];
		
		System.out.println("Digite 10 valores:");
		for (int i = 0; i < 4; i++) {
			arrayA[i] = input.nextInt();
		}
		
		System.out.println("Digite 10 valores:");
		for (int i = 0; i < 4; i++) {
			arrayB[i] = input.nextInt();
		}
		
		for (int i = arrayB.length - 1; i >= 0; i--) {
			arrayBinvertido[arrayB.length - i - 1] = arrayB[i];		
		}
		
		System.out.println("=====");
		
		for (int i = 0; i < arrayBinvertido.length; i++) {
			System.out.println(arrayBinvertido[i]);
		}
		
		System.out.println("======");
		
		for (int i = 0; i < arrayC.length; i++) {
			arrayC[i] = arrayA[i] + arrayBinvertido[i];
			System.out.println(arrayC[i]);
		}

		
		
	}

}
