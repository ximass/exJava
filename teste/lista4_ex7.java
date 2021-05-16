package teste;

import java.util.Scanner;

public class lista4_ex7 {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		int idade50 = 0, idade1020 = 0, contador = 0, peso40 = 0;
		Double media1 = 0.0, media2 = 0.0, porcentagem40;
		
		while (contador < 3) {
			System.out.println("Digite a sua idade:");
			int idade = input.nextInt();
			System.out.println("Digite a sua altura:");
			Double altura = input.nextDouble();
			System.out.println("Digite o seu peso:");
			Double peso = input.nextDouble();
			
			if (idade > 50) {
				idade50++;}
			else if (idade >= 10 && idade <= 20) {
				idade1020++;
				media1 = media1 + altura;
				media2 = media1 / idade1020;}
			else if (peso < 40) {
				peso40++;}
			
			contador++;}
		
		porcentagem40 = (double) (peso40 * 100) / 3;
			
		System.out.println("Quantidade de pessoas acima de 50 anos:" + idade50);
		System.out.println("Média de altura das pessoas entre 10 e 20 anos:" + media2);
		System.out.println("Porcentagem de pessoas com peso inferior a 40kg" + porcentagem40);
		
		
		}
		
	}


