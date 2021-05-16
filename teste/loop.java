package teste;

import java.util.Scanner;

public class loop {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		int contador;
		Double soma;
		
		soma = 0.0;
		contador = 0;
		
		while(contador < 10) {
			System.out.println("Digite um número para ser somado:");
			int num = input.nextInt();
			if(num % 5 == 0) {
				soma = soma + num;}
			contador++;}
		System.out.println("A soma dos números é:" + soma);
	}
}
