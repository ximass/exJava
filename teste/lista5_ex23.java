package teste;


import java.util.Scanner;

public class lista5_ex23 {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int opcao = 0;
		Double salario, novosalario, ferias, decimoterceiro, mesestrabalhados;
		

				
		while (opcao != 4) {
			System.out.println("Menu de op��es!");
			System.out.println("[1] Novo sal�rio");
			System.out.println("[2] F�rias");
			System.out.println("[3] D�cido terceiro");
			System.out.println("[4] Sair");
			opcao = input.nextInt();
			
			if (opcao == 1) {
				System.out.println("Digite o seu sal�rio:");
				salario = input.nextDouble();
				if (salario < 210 & salario > 0) {
					novosalario = salario + ( salario * 0.15);
					System.out.printf("o seu novo sal�rio ser� de: %.2f", novosalario);}
				else if (salario >= 210 & salario <= 600) {
					novosalario = salario + ( salario * 0.10);
					System.out.printf("o seu novo sal�rio ser� de: %.2f", novosalario);}
				if (salario > 600) {
					novosalario = salario + ( salario * 0.05);
					System.out.printf("o seu novo sal�rio ser� de: %.2f", novosalario);}	
			}
		
			else if (opcao == 2) {
				System.out.println("Digite o seu sal�rio:");
				salario = input.nextDouble();
				ferias = salario + (salario * 1/3);
				System.out.printf("O seu novo sal�rio de f�rias �: %.2f", ferias);
			}
			
			else if ( opcao == 3) {
				System.out.println("Digite o seu sal�rio:");
				salario = input.nextDouble();
				System.out.println("Digite a quantidade de meses que trabalhou na empresa durante o ano:");
				mesestrabalhados = input.nextDouble();
				decimoterceiro = (salario * mesestrabalhados) / 12;
				System.out.printf("Voc� tem direito a %.2f reais de d�cimo terceiro!", decimoterceiro);				
			}
		
			else if ( opcao == 4) {
				System.out.println("Voc� escolher sair do programa!!");
				break;
			}
			
			else {
				System.out.println("Op��o inv�lida!");
			}
			System.out.println("Digite outra op��o ou [4] para encerrar o programa!");
		}			
	}
}
