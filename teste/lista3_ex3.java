package teste;

import java.util.Scanner;


public class lista3_ex3 {
	public static void main(String args[]){
		
		
		Scanner input = new Scanner(System.in);
		
		int contador= 0, faixa = 0 ;
		Double num;
		
		while (contador < 5) {
		System.out.print("Digite um n�mero:");
		num = input.nextDouble();
		if (num >= 1200 & (num <= 3000)) {
			faixa++;
			System.out.println("O n�mero " + num + " pertence a faixa [1200, 3000]");}
		contador ++;}	
		System.out.println(faixa + " n�meros est�o na faixa [1200, 3000]");
		}	
}
