import java.util.Scanner;


public class dsadasd {
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
	}
}