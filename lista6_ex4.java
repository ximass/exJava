
import java.util.Scanner;

public class lista6_ex4 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int contador = 0, inicio, fim, num = 1, positivos = 0, negativos = 0, divisivel3 = 0, divisivel5 = 0;
		Double pnegativos, pdivisivel5;
		
		System.out.println("Digite um número para ser o inicio da faixa de números:");
		inicio = input.nextInt();
		System.out.println("Digite um número para ser o fim da faixa de números:");
		fim = input.nextInt();
		
		while (num >= inicio & num <= fim) {
			if (num > 0) {
				positivos++;
			}
			else if (num < 0) {
				negativos++;			
			}
			else if (num % 3 == 0) {
				divisivel3++;
			}
			else if (num % 5 == 0) {
				divisivel5++;
			}
			contador++;
			num++;
		}
		
		pnegativos = (double) ((negativos / contador) * 100);
		pdivisivel5 = (double) ((divisivel5 / contador) * 100);
		
		System.out.println("Quantidade de números inteiros positivos:" + positivos);
		System.out.println("Porcentagem de números inteiros negativos:" + negativos);
		System.out.println("Quantidade de números divisíveis e inteiros por 3:" + divisivel3);
		System.out.println("Porcentagem de números divisíveis e inteiros por 5:" + divisivel5);	
	}
}
