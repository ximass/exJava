package teste;

import java.util.Scanner;

public class lista_2_ex_1 {
public static void main(String args[]){
	
Float salario, aumento, novosalario;
	
Scanner input = new Scanner(System.in);	
	
System.out.print("Digite o seu sal�rio:");
salario = input.nextFloat();
System.out.println("Digite a porcentagem de aumento do seu sal�rio:");
aumento = input.nextFloat();

novosalario = salario + (salario * (aumento/100));

System.out.print("O seu novo sal�rio ser�:" + novosalario);
}
}