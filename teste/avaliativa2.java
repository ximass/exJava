package teste;

import java.util.Scanner;

public class avaliativa2 {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		String curso = null;
		int idade, opcao;
		
		System.out.println("====ENTREVISTA=DA=FACULDADE====");
		System.out.println("Digite o c�digo referente ao seu curso:");
		System.out.println("[1] Engenharia");
		System.out.println("[2] Computa��o");
		opcao = input.nextInt();
		System.out.println("Digite a sua idade");
		idade = input.nextInt();
		
		
		if (opcao == 1) {
			curso = "Engenharia";
			System.out.println("O aluno est� matriculado no curso de:" + curso);} 
		
		else if (opcao == 2) {
			curso = "Computa��o";
			System.out.println("O aluno est� matriculado no curso de:" + curso);}
		else {
			System.out.println("C�digo inv�lido para a escolha de curso!");}
		
		
		if (idade > 21) {
			System.out.println("O estudante � maior de idade!");}
		else {
			System.out.println("O estudante � menor de idade!");}
				
		}
}

