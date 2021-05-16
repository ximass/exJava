package teste;


import java.util.Scanner;

public class lista5_ex23 {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int opcao = 0;
		Double salario, novosalario, ferias, decimoterceiro, mesestrabalhados;
		

				
		while (opcao != 4) {
			System.out.println("Menu de opções!");
			System.out.println("[1] Novo salário");
			System.out.println("[2] Férias");
			System.out.println("[3] Décido terceiro");
			System.out.println("[4] Sair");
			opcao = input.nextInt();
			
			if (opcao == 1) {
				System.out.println("Digite o seu salário:");
				salario = input.nextDouble();
				if (salario < 210 & salario > 0) {
					novosalario = salario + ( salario * 0.15);
					System.out.printf("o seu novo salário será de: %.2f", novosalario);}
				else if (salario >= 210 & salario <= 600) {
					novosalario = salario + ( salario * 0.10);
					System.out.printf("o seu novo salário será de: %.2f", novosalario);}
				if (salario > 600) {
					novosalario = salario + ( salario * 0.05);
					System.out.printf("o seu novo salário será de: %.2f", novosalario);}	
			}
		
			else if (opcao == 2) {
				System.out.println("Digite o seu salário:");
				salario = input.nextDouble();
				ferias = salario + (salario * 1/3);
				System.out.printf("O seu novo salário de férias é: %.2f", ferias);
			}
			
			else if ( opcao == 3) {
				System.out.println("Digite o seu salário:");
				salario = input.nextDouble();
				System.out.println("Digite a quantidade de meses que trabalhou na empresa durante o ano:");
				mesestrabalhados = input.nextDouble();
				decimoterceiro = (salario * mesestrabalhados) / 12;
				System.out.printf("Você tem direito a %.2f reais de décimo terceiro!", decimoterceiro);				
			}
		
			else if ( opcao == 4) {
				System.out.println("Você escolher sair do programa!!");
				break;
			}
			
			else {
				System.out.println("Opção inválida!");
			}
			System.out.println("Digite outra opção ou [4] para encerrar o programa!");
		}			
	}
}
