
import java.util.Scanner;

public class exVetor1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int contador = 0, num, contador2 = 0, indice, soma, valor, contador3 = 0, contador4 = 0;
		
		
		
		int[] vetor = new int[4];
		
		while (contador >= 0 & contador < 4) {
			System.out.println("Digite um número:");
			num = input.nextInt();
			if (num > 0) {
				vetor[contador] = num;
			contador++;
			}
			
		}

		System.out.println("Os números armazenados no vetor são:");
		while ( contador2 >= 0 & contador2 < 4) {
			System.out.println(vetor[contador2]);
			contador2++;
		}
		//c
		while (contador3 >= 0 & contador3 < 4) {
			System.out.println("Digite um índice:");
			indice = input.nextInt();
			soma = vetor[indice] + indice;
			System.out.println(soma);
			contador3++;
			
		}
		//d
		System.out.println("Digite um valor:");
		valor = input.nextInt();
		indice = 0;
		while (indice >= 0 & indice < 4) {
			if (valor == vetor[indice]) {
				contador4++;
		}
			indice = indice + 1;
		
		}
		System.out.println("O número de vezes que aparece é:" + contador4);

}
}