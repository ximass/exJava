package teste;

import java.util.Scanner;

public class lista5_ex21 {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int codigo = 9999, voto1= 0, voto2 = 0, voto3 = 0, voto4 = 0, nulo = 0, branco = 0, contador = 0;
		Double pbrancos = 0.0, pnulos = 0.0;
		
		
		
		System.out.println("Contador de votos!");
		System.out.println("Vote no número do candidato:");
		System.out.println("[1] Candidato 1");
		System.out.println("[2] Candidato 2");
		System.out.println("[3] Candidato 3");
		System.out.println("[4] Candidato 4");
		System.out.println("[5] para nulo");
		System.out.println("[6] para branco");
		System.out.println("Digite 0 para encerrar a votação!");
		
		while (codigo != 0) {
			codigo = input.nextInt();
			
			if (codigo == 1) {
				voto1++;}
			else if (codigo == 2) {
				voto2++;}
			else if (codigo == 3) {
				voto3++;}
			else if (codigo == 4) {
				voto4++;}
			else if (codigo == 5) {
				nulo++;}
			else if (codigo == 6) {
				branco++;}
			else if (codigo == 0) {
				System.out.println("Você encerrou a votação!");}
			else {
				System.out.println("Opção inválida! Digite novamente");
			}
			contador++;
			pnulos = (double) ((nulo / contador) * 100);
			pbrancos = (double) ((branco / contador) * 100);
		
		
		}
		
		System.out.println("O candidato número 1 teve:"+ voto1 + " votos!");
		System.out.println("O candidato número 2 teve:"+ voto2 + " votos!");
		System.out.println("O candidato número 3 teve:"+ voto3 + " votos!");
		System.out.println("O candidato número 4 teve:"+ voto4 + " votos!");
		System.out.printf("A porcentagem de votos nulos foi de:%.4f\n", pnulos);
		System.out.printf("A porcentagem de votos brancos foi de:%.4f\n", pbrancos);
		
	}
}
