package teste;

import java.util.Scanner;

public class lista_2_ex_3 {
public static void main(String args[]){

Scanner input = new Scanner(System.in);	

Float altura, base, area;
	
System.out.print("Digite a altura do tri�ngulo:");
altura = input.nextFloat();
System.out.print("Digite a base do tri�ngulo:");
base = input.nextFloat();

area = (altura * base)/2;

System.out.print("A �rea do tri�ngulo �:" + area);
}
}
