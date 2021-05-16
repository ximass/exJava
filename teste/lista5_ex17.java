package teste;


import java.util.Scanner;

public class lista5_ex17 {
	public static void main(String args[]){
		
		
		Scanner input = new Scanner(System.in);
		
		int codigo = 1, canalescolhido = 1, opcao4 = 0, opcao5 = 0, opcao7 = 0, opcao12 = 0;
		Double audienciaopcao4, audienciaopcao5, audienciaopcao7, audienciaopcao12, audienciatotal;
		
		while (canalescolhido != 0) {
			System.out.println("PESQUISA DE AUDIÊNCIA");
			System.out.println("Digite o canal que você costuma assitir!");
			System.out.println("[4] SBT"
					+ "[5] Globo"
					+ "[7] Record"
					+ "[12] BandTV");
			canalescolhido = input.nextInt();
			if (canalescolhido == 4) {
				opcao4++;}
			else if (canalescolhido == 5) {
				opcao5++;}
			else if (canalescolhido == 7) {
				opcao7++;}
			else if (canalescolhido == 12) {
				opcao12++;}
			else {
				System.out.println("Canal inválido ou televisão desligada!");}	
		}
		
		audienciatotal = (double) (opcao4 + opcao5 + opcao7 + opcao12);
		audienciaopcao4 = (opcao4 / audienciatotal) * 100;
		audienciaopcao5 = (opcao5 / audienciatotal) * 100;
		audienciaopcao7 = (opcao7 / audienciatotal) * 100;
		audienciaopcao12 = (opcao12 / audienciatotal) * 100;
		
		System.out.printf("A audiencia em porcentagem do canal [4] SBT é:%f\n", audienciaopcao4);
		System.out.printf("A audiencia em porcentagem do canal [5] Globo é:%f\n", audienciaopcao5);
		System.out.printf("A audiencia em porcentagem do canal [7] Record é:%f\n", audienciaopcao7);
		System.out.printf("A audiencia em porcentagem do canal [12] BandTV é:%f\n", audienciaopcao12);
		
			
			
	}
		
		
		
		
}


