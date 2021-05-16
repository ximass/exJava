package teste;

import java.util.Scanner;

public class lista5_ex25 {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int codcliente = 1, codinvestimento;
		Double valorinvestido, rendimento = 0.0, valortotal;
		
		while ( codcliente !=0 || codcliente < 0) {
			System.out.println("Digite o código do cliente:\n");
			codcliente = input.nextInt();
			if (codcliente == 0 || codcliente < 0) {
				System.out.println("Você escolheu sair!");}
			else{
				System.out.println("[1] poupança 1,5% de rendimento mensal");
				System.out.println("[2] poupança plus 2% de rendimento mensal");
				System.out.println("[3] fundos de renda fixa 4% de rendimento mensal");
				System.out.println("Digite o código do investimento:");
				codinvestimento = input.nextInt();
				System.out.println("Digite o valor investido:");
				valorinvestido = input.nextDouble();
				
				if (codinvestimento == 1) {
					valortotal = valorinvestido + ((valorinvestido * 1.5)/100);
					rendimento = ((valorinvestido * 1.5)/100);
					
				}
				else if (codinvestimento == 2) {
					valortotal = valorinvestido + ((valorinvestido * 2)/100);
					rendimento = ((valorinvestido * 1.5)/100);
				}
				else if (codinvestimento == 3) {
					valortotal = valorinvestido + ((valorinvestido * 4)/100);
					rendimento = ((valorinvestido * 1.5)/100);
				}
				else {
					System.out.println("Código inválido!");				
				}
				System.out.printf("O valor investido foi: %.2f", valorinvestido);
				System.out.printf("O rendimento foi: %.2f\n", rendimento);
			
			}
		}	
	}

}
