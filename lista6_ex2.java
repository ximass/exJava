
import java.util.Scanner;

public class lista6_ex2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int meses = 0;
		Double salario, salariototal = 0.0;
		
		while ( meses < 12) {
			System.out.println("Digite o sal�rio deste m�s:");
			salario = input.nextDouble();
			salariototal = salario + salariototal;
			meses++;
		}
		if (salariototal > 28559.70) {
			System.out.println("Voc� deve declarar o seu imposto de renda!");
			System.out.printf("Renda anual de: %.2f", salariototal);					
		}
		
		else {
			System.out.println("Voc� n�o precisa declarar o seu imposto de renda!");
		}
	}
}
