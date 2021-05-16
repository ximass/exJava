package teste;

import java.util.Scanner;

public class lista3_ex5 {
	public static void main(String args[]){
		
		
		int contador = 0, sexofs = 0, sexoms = 0, sexofn = 0, sexomn = 0, sim, nao;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pesquisa de aceitação do produto!");
		
		while (contador < 11) {
			System.out.println("Digite o seu sexo:");
			System.out.println("[1] para Masculino");
			System.out.println("[2] para Feminino");
			int sexo = input.nextInt();
			
			System.out.println("Você concordou com a mudança?");
			System.out.println("[1] para Sim");
			System.out.println("[2] para Não");
			int option = input.nextInt();
			
			if (option == 1) {
				if (sexo == 1) {
					sexoms++;}
				if (sexo == 2) {
					sexofs++;}}
			
			else if (option == 2) {
				if (sexo == 1) {
					sexomn++;}
				if (sexo == 2) {
					sexofn++;}}
			else {
				System.out.println("Valor inválido!");}
			
		contador++;}
		
		sim = sexoms + sexofs;
		nao = sexomn + sexofn;
		System.out.println(sim + " pessoas responderam estarem a favor!");
		System.out.println(nao + " pessoas responderam estarem contra");
		System.out.println(sexofs + " mulheres responderam estarem a favor!");
		System.out.println(sexomn + " homens responderam estarem contra!");
		System.out.println(contador + " pessoas responderam a enquete!");
		
	}
}
		
		
