package teste;

import java.util.Scanner;

public class lista3_ex1 {
	public static void main(String args[]){
		
		int contador = 0, soma1 = 0, soma2 = 0, soma3 = 0, soma4 = 0;
		int numfilhos;
		
		Scanner input = new Scanner(System.in);
		
		while( contador < 8) {
			System.out.println("Digite quantos filhos voc� tem:");
			numfilhos = input.nextInt();
			if (numfilhos >= 1 && (numfilhos <= 3)) {
				soma1 = soma1 + 1;}
			if (numfilhos >= 4 && (numfilhos <= 7)) {
				soma2 = soma2 + 1;}
			if (numfilhos >= 8) {
				soma3 = soma3 + 1;}
			if (numfilhos == 0) {
				soma4 = soma4 + 1;}
			contador++;
		}
		
		System.out.println(soma1 + " fam�lias possuem ao menos 1 e at� 3 filhos!");
		System.out.println(soma2 + " fam�lias possuem ao menos 4 e at� 7 filhos!");
		System.out.println(soma3 + " fam�lias possuem ao menos 8 filhos!");
		System.out.println(soma4 + " fam�lias n�o possuem filhos!");		
	}
}
		
			

		
		
		
		
		
		


