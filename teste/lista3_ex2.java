package teste;


import java.util.Scanner;


public class lista3_ex2 {
	public static void main(String args[]){
		
		
		Scanner input = new Scanner(System.in);
		
		int contador = 0, sexom = 0, sexof = 0, idade30 = 0, idade60 = 0, idade, sexo;
		
		
		while (contador < 5) {
			System.out.println("Digite o seu sexo:");
			System.out.println("[1] Masculino");
			System.out.println("[2] Feminino:");	
			sexo = input.nextInt();
			if (sexo == 1) {
				sexom = sexom + 1;}
			else if (sexo == 2) {
				sexof = sexof + 1;}
			else {
				System.out.println("Valor inválido!");}
			System.out.println("Digite a sua idade:");
			idade = input.nextInt();
			if (idade <= 30) {
				idade30 = idade30 + 1;}
			if (idade > 30) {
				idade60 = idade60 + 1;}
			contador++;}
		
		System.out.println(sexom + " pessoas do sexo masculino!");
		System.out.println(sexof + " pessoas do sexo feminino!");
		System.out.println(idade30 + " pessoas com até 30 anos!");
		System.out.println(idade60  + " pessoas com mais de 30 anos!");
		
	}

}
