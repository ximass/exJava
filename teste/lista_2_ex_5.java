package teste;

import java.util.Scanner;

public class lista_2_ex_5 {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		Float precofabrica, lucropercentual, impostopercentual, precofinal, lucro, imposto;
		
		System.out.print("Digite o pre�o de f�brica do carro:");
		precofabrica = input.nextFloat();
		System.out.println("Digite o percentual de lucro do distribuidor:");
		lucropercentual = input.nextFloat();
		System.out.println("Digite o percentual de impostos:");
		impostopercentual = input.nextFloat();
		
		lucro = (precofabrica * (lucropercentual/100));
		imposto = (precofabrica * (impostopercentual/100));
		precofinal = precofabrica + lucro + imposto;

		System.out.println("O lucro do distribuidor ser� de R$ " + lucro);
		System.out.println("O valor referente aos impostos ser� de R$ " + imposto);
		System.out.println("O pre�o final ser� de R$ " + precofinal);
		
	}

}
