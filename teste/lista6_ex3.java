
import java.util.Scanner;

public class lista6_ex3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Double comprimento, largura, areacomodo, areatotal = 0.0;
		String opcao = "sim";
		
		System.out.println("Calculador de �rea!");
		
		while( !opcao.equals("N�O")) {
			System.out.println("Digite o comprimento do c�modo:");
			comprimento = input.nextDouble();
			System.out.println("Digite a largura do c�modo:");
			largura = input.nextDouble();
			areacomodo = comprimento * largura;
			areatotal = areatotal + areacomodo;
			System.out.printf("A �rea do c�modo �: %.2f", areacomodo);
			System.out.println("Deseja adicionar outro c�modo?");
			System.out.println("Digite 'Sim' para adicionar mais um c�modo!");
			System.out.println("Digite 'N�o' para encerrar o programa!");
			opcao = input.next().toUpperCase();
			
		}
		
		if (opcao == "N�O") {
			System.out.printf("Voc� escolheu sair!");
			System.out.printf("A �rea total do planta �: %.2f", areatotal);
		}
	}
}
