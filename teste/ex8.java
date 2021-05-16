package teste;

public class ex8 {
	public static void main (String args[]) {
		int ano, idade, mes, mesatual, idade2;
		System.out.print ("Qual o ano em que você nasceu?");
		ano = entrada.leiaInt();
		System.out.print("Em qual mês você nasceu (digite o número do mês)?");
		mes = entrada.leiaInt();
		idade = 2021 - ano;
		idade2 = 2021 - ano - 1;
		mesatual = 3;
		
		if ((mesatual < mes) && (mesatual < 12)) {
			System.out.print("Você possui " + idade + "anos!");
		} else {
			System.out.print("Você possui " + idade2 + "anos!");	
		}
			
				
		
		
		
		
	}

}
