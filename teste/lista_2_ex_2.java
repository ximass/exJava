package teste;

import java.util.Scanner;

public class lista_2_ex_2 {
public static void main(String args[]){
	
Scanner input = new Scanner(System.in);

Float salario, salario2, salariofinal;
	
System.out.print("Digite o seu sal�rio:");
salario = input.nextFloat();
System.out.print("Voc� possui gratifica��o de 5%!");
System.out.println("Por�m, dever� pagar um imposto de 7% sobre o sal�rio base!");


salario2 = salario + ((salario/100) * 5);
salariofinal = salario  - ((salario/100) * 7) + ((salario/100) * 5);

System.out.println("O seu sal�rio final ser� de:" + salariofinal);

}
}
