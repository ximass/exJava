package teste;

import java.util.Scanner;

public class avaliativa2 {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		String curso = null;
		int idade, opcao;
		
		System.out.println("====ENTREVISTA=DA=FACULDADE====");
		System.out.println("Digite o código referente ao seu curso:");
		System.out.println("[1] Engenharia");
		System.out.println("[2] Computação");
		opcao = input.nextInt();
		System.out.println("Digite a sua idade");
		idade = input.nextInt();
		
		
		if (opcao == 1) {
			curso = "Engenharia";
			System.out.println("O aluno está matriculado no curso de:" + curso);} 
		
		else if (opcao == 2) {
			curso = "Computação";
			System.out.println("O aluno está matriculado no curso de:" + curso);}
		else {
			System.out.println("Código inválido para a escolha de curso!");}
		
		
		if (idade > 21) {
			System.out.println("O estudante é maior de idade!");}
		else {
			System.out.println("O estudante é menor de idade!");}
				
		}
}

