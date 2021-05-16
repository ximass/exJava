package teste;

import java.util.Scanner;

public class lista5_ex20 {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int opcao = 0;
		Double nota1, nota2, nota3, media, peso1, peso2, peso3;
	
		
		while (opcao != 3) {
			System.out.println("MENU DE OPÇÕES");
			System.out.println("[1] média aritmética");
			System.out.println("[2] média ponderada");
			System.out.println("[3] sair");		
			System.out.println("Digite a opção desejada");
			opcao = input.nextInt();
			if (opcao == 1) {
				System.out.println("Digite a primeira nota");
				nota1 = input.nextDouble();
				System.out.println("Digite a segunda nota");
				nota2 = input.nextDouble();
				media = (nota1 + nota2) / 2;
				System.out.printf("A média aritmética é: %.2f", media);
				
			}				
			else if ( opcao == 2) {
				System.out.println("Digite a primeira nota e seu peso, respectivamente");
				nota1 = input.nextDouble();
				peso1 = input.nextDouble();
				System.out.println("Digite a segunda nota e seu peso, respectivamente");
				nota2 = input.nextDouble();
				peso2 = input.nextDouble();
				System.out.println("Digite a terceira nota e seu peso, respectivamente");
				nota3 = input.nextDouble();
				peso3 = input.nextDouble();
				media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / 3;
				System.out.printf("A média ponderada é: %.2f", media);
			}
			else if ( opcao == 3) {
				System.out.println("Você escolheu sair do programa!");
			}
			else {
				System.out.println("Opção inválida!");
			}
		}
			
	}
}
		
		
		


