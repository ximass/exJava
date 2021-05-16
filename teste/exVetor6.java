
import java.util.Scanner;

public class exVetor6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Double[] array = new Double[7];
		Double somatotal = 0.0, media;
		int cont = 0;
				
		System.out.println("Digite a temperatura do dia:");
		for(int i = 0; i < 7; i++) {
			array[i] = input.nextDouble();
			somatotal = somatotal + array[i];	
		}
		
		media = somatotal /7;
		
		for(int i = 0; i < 7; i++) {
			if(array[i] > media) {
				cont++;
			}			
		}
		
		System.out.println("Temperaturas da semana:");
		for(int i = 0; i < 7; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("A média das temperaturas é:" + media);		
		System.out.println("A quantidade de dias com temperaturas acima da média é:" + cont);
		
		
		
		
	}

}
