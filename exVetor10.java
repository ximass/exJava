
import java.util.Scanner;


public class exVetor10 {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int num;
		
		int[] array = new int[4];
		int[] arrayinversa = new int[4];
		int[] arrayauxiliar = new int[4];
		
		System.out.println("Digite 9 valores inteiros e maiores que 0!");
		for(int i=0; i < array.length;) {
			num = input.nextInt();
			if (num != 0 & num > 0) {
				array[i] = num;
				i++;				
			} else {
				System.out.println("Valor inválido, digite novamente!");
			}						
		}
		for (int i=0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		System.out.println("\n");
		
		for(int i= array.length - 1; i >= 0; i--) {
			arrayinversa[array.length - i -1] = array[i];
		}
		
		for ( int i=0; i < array.length; i++) {
			arrayauxiliar[i] = array[i];
			if (i == 0) {
				arrayauxiliar[i] = arrayinversa[i];				
			}
			if (i == 3) {
				arrayauxiliar[i] = arrayinversa[i];
				
			}
		}
		
		System.out.println("============");
		
		for(int i=0; i < arrayauxiliar.length; i++) {
			System.out.println(arrayauxiliar[i]);
		}
		
		for (int i=0; i < arrayauxiliar.length; i++) {
			System.out.print("# " + arrayauxiliar[i] + "  ");
		}
		
		
		
	}
}
