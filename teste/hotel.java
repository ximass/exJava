package teste;

//Fa�a um programa para calcular a conta final de um h�spede de um hotel fict�cio

import java.util.Scanner;

public class hotel{
public static void main(String args[]){
 String hospede;
 int nDiarias;
 char apartamento;
 double vConsumo,uDiarias,tDiarias,subtotal,taxaSer,tGeral;
 
 Scanner leia = new Scanner(System.in);
 
 System.out.println("======Copacabana=Palace======");
 System.out.println("Digite o nome do h�spede:");
 hospede = leia.nextLine();
 System.out.println("Tipos de apartamento:");
 System.out.println("[A] - 150,00");
 System.out.println("[B] - 120,00");
 System.out.println("[C] - 80,00");
 System.out.println("[D] - 50,00");
 System.out.println("Escolha o tipo de aposento(forma de digita��o: A,B,C,D):");
 apartamento = leia.next().charAt(0);
 System.out.println("Digite o n�mero de di�rias utilizadas pelo h�spede:");
 nDiarias = leia.nextInt();
 System.out.println("Digite o valor do consumo interno do h�spede:");
 vConsumo = leia.nextFloat();
 
 uDiarias = 0.00;
   
if (apartamento == 'A' || (apartamento == 'a') ){
   uDiarias = 150.00;}
else if (apartamento == 'B' || (apartamento == 'b')){
   uDiarias = 120.00;}
else if (apartamento == 'C' || (apartamento == 'c')){
   uDiarias = 80.00;}
else if (apartamento == 'D' || (apartamento == 'd')){
   uDiarias = 50.00;}
else {
	System.out.println("Op��o inv�lida");}

 
 tDiarias = uDiarias*nDiarias;
 subtotal = vConsumo+tDiarias;
 taxaSer = subtotal*0.1;
 tGeral = subtotal+taxaSer;
 
 System.out.println("O h�spede "+hospede+", escolheu o apartamento "+apartamento);
 System.out.println("N�mero de di�rias:"+nDiarias);
 System.out.println("Valor de cada di�ria:"+uDiarias);
 System.out.println("Total das di�rias:"+tDiarias);
 System.out.println("O valor do consumo interno:"+vConsumo);
 System.out.println("O subtotal:"+subtotal);
 System.out.println("O valor da taxa de servi�o:"+taxaSer);
 System.out.println("O total geral:"+tGeral);
}
}


