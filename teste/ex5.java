package teste;

public class ex5 {
	public static void main (String args[]) {
		Float nota1, nota2, nota3, media;
		System.out.println("Digite a primeira nota:");
		nota1 = entrada.leiaFloat();
		System.out.println("Digite a segunda nota:");
		nota2 = entrada.leiaFloat();
		System.out.println("Digite a terceira nota:");
		nota3 = entrada.leiaFloat();
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.print("A m�dia das tr�s notas �: "+media);
	}

}
