package teste;

public class ex8 {
	public static void main (String args[]) {
		int ano, idade, mes, mesatual, idade2;
		System.out.print ("Qual o ano em que voc� nasceu?");
		ano = entrada.leiaInt();
		System.out.print("Em qual m�s voc� nasceu (digite o n�mero do m�s)?");
		mes = entrada.leiaInt();
		idade = 2021 - ano;
		idade2 = 2021 - ano - 1;
		mesatual = 3;
		
		if ((mesatual < mes) && (mesatual < 12)) {
			System.out.print("Voc� possui " + idade + "anos!");
		} else {
			System.out.print("Voc� possui " + idade2 + "anos!");	
		}
			
				
		
		
		
		
	}

}
