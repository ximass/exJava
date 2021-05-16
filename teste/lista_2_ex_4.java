package teste;

import java.util.Scanner;

public class lista_2_ex_4 {
public static void main(String args[]){
	
Scanner input = new Scanner(System.in);

Float pes, polegada, jarda, milha;

System.out.print("Digite um valor em pés para ser convertido em polegadas, jardas e milhas!");
pes = input.nextFloat();


polegada = pes / 12;
jarda = pes / 3;
milha = jarda / 1760;

System.out.println( pes + " correspondem a:");
System.out.println(polegada + " polegadas!");
System.out.println(jarda + " jardas!");
System.out.println(milha + " milhas!");
	
}	
}
