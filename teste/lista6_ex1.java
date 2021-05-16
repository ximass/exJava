
import java.util.Scanner;

public class lista6_ex1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int qnt;
		Double preco;
		
		System.out.println("Digite a quantidade de maracujás que deseja comprar:");
		qnt = input.nextInt();
		if (qnt < 12) {
			preco = qnt * 1.25;
			System.out.printf("O valor a ser pago será de: %.2f", preco);			
		}
		if (qnt > 12 & qnt <= 25) {
			preco = qnt * 1.2;
			System.out.printf("O valor a ser pago será de: %.2f", preco);			
		}
		if (qnt > 25) {
			preco = (qnt * 1.2) - (((qnt * 1.2)/100)* 10);
			
			System.out.printf("O valor a ser pago será de: %.2f", preco);			
		}
		
	}

}
