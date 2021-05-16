package teste;

import java.util.Scanner;

public class lista5_ex19 {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("[a] SpaceX");
		System.out.println("[b] Tesla");
		System.out.println("[c] Microsoft");
		
		int qntlucro1 = 0, qntlucro2 = 0, qnt;
		Double precocompra = 0.0, precovenda = 0.0, lucro, lucrototal = 0.0;
		Character opcao = 's', codigo = 's';
		
		while (codigo != 'f' & codigo != 'F') {
			System.out.println("Qual ação você deseja comprar?");
			opcao = input.next().charAt(0);
			System.out.println("Quantas ações você deseja comprar?");
			qnt = input.nextInt();
			System.out.println("Qual o preço da ação que deseja comprar?");
			precocompra = input.nextDouble();
			System.out.println("Qual o preço de venda que deseja vender?");
			precovenda = input.nextDouble();
			
		
			lucro = (precocompra - precovenda) * qnt;
			if (lucro > 1000) {
				qntlucro1++;}
			else if ( lucro <= 200 & lucro > 0){
				qntlucro2++;}
			
			lucrototal = lucrototal + lucro;
			
			System.out.printf("Você lucrou %.2f reais com essa ação!\n", lucro);
			System.out.println("Se você deseja parar de comprar ações, digite 'F', senão digite 'C'");
			codigo = input.next().charAt(0);
		
					
		}
		
		System.out.printf("Você lucrou %.2f reais ao todo!\n", lucrototal);
		System.out.println("Quantidade de ações que lucraram 1000 reais ou mais:" + qntlucro1);
		System.out.println("Quantidade de ações que lucraram ao menos 200 reais:" + qntlucro2);
	
	}

}
