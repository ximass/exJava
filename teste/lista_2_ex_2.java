package teste;

import java.util.Scanner;

public class lista_2_ex_2 {
public static void main(String args[]){
	
Scanner input = new Scanner(System.in);

Float salario, salario2, salariofinal;
	
System.out.print("Digite o seu salário:");
salario = input.nextFloat();
System.out.print("Você possui gratificação de 5%!");
System.out.println("Porém, deverá pagar um imposto de 7% sobre o salário base!");


salario2 = salario + ((salario/100) * 5);
salariofinal = salario  - ((salario/100) * 7) + ((salario/100) * 5);

System.out.println("O seu salário final será de:" + salariofinal);

}
}
