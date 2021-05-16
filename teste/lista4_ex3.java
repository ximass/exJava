package teste;


import java.util.Scanner;

public class lista4_ex3 {
	public static void main(String args[]){
		
		
		Scanner input = new Scanner(System.in);
		
		int contador = 0, faixa15 = 0, faixa30 = 0, faixa45 = 0, faixa60 = 0, faixailimitado = 0;
		
		while (contador < 8) {
			System.out.print("Digite a sua idade:");
			int idade = input.nextInt();
			if (idade <= 15) {
				faixa15++;}
			else if (idade <= 30 && (idade > 15)) {
				faixa30++;}
			else if (idade <= 45 && (idade > 30)) {
				faixa45++;}
			else if (idade <= 60 && (idade > 45)) {
				faixa60++;}
			else if (idade > 60) {
				faixailimitado++;}
			else {
				System.out.println("Valor inválido!");}
			contador++;}
			
			int porcentagemfaixa15 = (faixa15 * 100) / 8;
			int porcentagemfaixailimitado = (faixailimitado * 100 / 8);
			
			System.out.println("Há " + faixa15 + " pessoas na primeira faixa!");
			System.out.println("Há " + faixa30 + " pessoas na segunda faixa!");
			System.out.println("Há " + faixa45 + " pessoas na terceira faixa!");
			System.out.println("Há " + faixa60 + " pessoas na quarta faixa!");
			System.out.println("Há " + faixailimitado + " pessoas na quinta faixa!");
			
			System.out.println("A porcentagem da primeira faixa etária em relação ao total é:" + porcentagemfaixa15);
			System.out.println("A porcentagem da quinta faixa etária em relação ao total é:" + porcentagemfaixailimitado);
						
	}

}
