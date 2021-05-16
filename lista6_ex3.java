
import java.util.Scanner;

public class lista6_ex3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Double comprimento, largura, areacomodo, areatotal = 0.0;
		String opcao = "sim";
		
		System.out.println("Calculador de área!");
		
		while( !opcao.equals("NÃO")) {
			System.out.println("Digite o comprimento do cômodo:");
			comprimento = input.nextDouble();
			System.out.println("Digite a largura do cômodo:");
			largura = input.nextDouble();
			areacomodo = comprimento * largura;
			areatotal = areatotal + areacomodo;
			System.out.printf("A área do cômodo é: %.2f", areacomodo);
			System.out.println("Deseja adicionar outro cômodo?");
			System.out.println("Digite 'Sim' para adicionar mais um cômodo!");
			System.out.println("Digite 'Não' para encerrar o programa!");
			opcao = input.next().toUpperCase();
			
		}
		
		if (opcao == "NÃO") {
			System.out.printf("Você escolheu sair!");
			System.out.printf("A área total do planta é: %.2f", areatotal);
		}
	}
}
