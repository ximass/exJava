package teste;

import java.util.Scanner; 
public class teste3{
 
  public static void main (String[] args) {
    //criando a vari�vel valorInt
   int valorInt;
   //armazenando o num 150 na vari�vel valorInt
   //valorInt=150;
   System.out.println ("Digite um valor:");
   Scanner leia = new Scanner (System.in);
   valorInt= leia.nextInt();
   System.out.println ("O valor cont�m: ");
   System.out.println (valorInt);
  }
}