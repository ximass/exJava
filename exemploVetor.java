import java.util.Scanner;

public class exemploVetor {
		public static void main(String args[]){
		double soma;
		double[] vetor = new double[5];
		int contador;
		int acimadamedia;
		double media;
		Scanner input = new Scanner(System.in);
		
		
		media = soma = contador = 0;
		
		
		while(contador < 5){
			System.out.printf("Digite uma nota: ");
			vetor[contador] = input.nextDouble();
			soma += vetor[contador];
			contador++;
		}
		media = soma/5;
		acimadamedia = 0;
		contador = 0;
		while(contador < 5){
			if(vetor[contador] > media){
				acimadamedia++;
			}
			contador++;
		}
		
		System.out.println("A média é "+media);
		System.out.println("Alunos acima da media: "+acimadamedia);
	}
}