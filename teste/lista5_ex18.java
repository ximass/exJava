package teste;


import java.util.Scanner;

public class lista5_ex18 {
	public static void main(String args[]){
		
		
		Scanner input = new Scanner(System.in);
		
		int idade = 1, idademin = 0, sexof = 0, sexof200 = 0, contador = 0, idademaior = 0, idademenor = 0, idademenor2 = 0, idademaior2 = 0;
		Double salario, salariototal = 0.0, mediasalario, salariomax = 0.0, salariomin = 0.0;
		Character sexo, sexosalariomin;
		
		
		
		while (idade > 0) {
			System.out.println("Pesquisa do IBGE:");
			System.out.println("Digite a sua idade:");
			idade = input.nextInt();
			if (idade > 0) {
				idademaior = idade;
				idademenor = idade;
				if ( idade > idademaior) {
					idademaior = idade;									
				}
				
				if (idade < idademenor) {
					idademenor = idade;				
				}
				
				System.out.println("Digite o seu sexo [M] para masculino [F] para feminino:");
				sexo = input.next().charAt(0);
				if (sexo == 'f' || sexo == 'F') {
					sexof++;
				}
				
				System.out.println("Digite o seu salário em reais:");
				salario = input.nextDouble();
				salariomax = salario;
				salariomin = salario;
				if (salario > salariomax) {
					salariomax = salario;					
				}
				
				if (salario < salariomin & salario != 0) {
					salariomin = salario;
					idademin = idade;
					sexosalariomin = sexo;
				}
				
				
				if (sexo == 'f' || sexo == 'F') {
					if (salario > 200) {
						sexof200++;	
					}
				}
				
			salariototal = salariototal + salario;
			
			contador++;		
			}
			else {
				System.out.println("Você escolheu finalizar!");
			}
		}
		mediasalario = salariototal / contador;
		System.out.printf("A média dos salários é; %.2f\n", mediasalario);
		System.out.println("A menor idade dos entrevistados é:" + idademenor);
		System.out.println("A menor idade dos entrevistados é:" + idademaior);
		System.out.println("A quantidade de mulheres que ganham mais de 200 reais dos entrevistados é:" + sexof200);
		System.out.println("O menor salário dos entrevistados é:" + salariomin);	
	}
}