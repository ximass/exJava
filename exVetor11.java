
import java.util.Scanner;

public class exVetor11 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int num;
		int[] array = new int[4];
		int[] array2 = new int[4];
		
		System.out.println("Digite 4 valores:");
		for (int i = 0; i < array.length; i++) {
			num = input.nextInt();
			array[i] = num;
			array2[i] = array[i];
			if (i % 2 != 0) {
				array2[i] = array[i] * 5;
			}
			else {
				array2[i] = array[i] + 5;
			}			
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");					
		}
		System.out.println("\n");	
		
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
	}
}
