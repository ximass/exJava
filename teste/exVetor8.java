import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class exVetor8 {

	public static void main(String[] args) {
				
		int[] arrayA = new int[10];
		int[] arrayB = new int[10];
		int[] arrayC = new int[20];
		
		Random gerador = new Random();
		
		for(int i = 0; i < arrayA.length; i++) {
			arrayA[i] = (int) (Math.random() * 10) + 1;
			System.out.println(arrayA[i]);
		}
		
		System.out.println("============");
		
		for(int i = 0; i < arrayB.length; i++){
			arrayB[i] = (int) (Math.random() * 10) + 1;
			System.out.println(arrayB[i]);
		}
		
			
		for(int i = 0; i < 10; i++) {
			arrayC[i] = arrayA[i];
			arrayC[i + 10] = arrayB[i];
		}
		
		
		System.out.println("============");
		
		for(int i = 0; i < arrayC.length; i++) {
			System.out.println(arrayC[i]);
		}
		
	}

}
