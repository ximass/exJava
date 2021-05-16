package teste;


import java.util.Scanner;

public class lista5_ex22 {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int idade = 1, idade50 = 0;
		Double altura, alturatotal = 0.0, alturamedia50 = 0.0;
		
		while (idade > 0) {
			System.out.println("Digite a sua idade:");
			idade = input.nextInt();
			System.out.println("Digite a sua altura:");
			altura = input.nextDouble();
			
			if (idade > 50) {
				alturatotal = alturatotal + altura;
				idade50++;}
			
			alturamedia50 = alturatotal / idade50;
			
		}
		
		System.out.printf("A altura média das pessoas com mais de 50 anos é: %.2f", alturamedia50);
		
	}

}
