package lista10matriz;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
	        Scanner leia = new Scanner(System.in);
	        String[] alunos = new String[5];	        
	        
	        // criação do vetor que armazena os alunos	        
	        
	        System.out.println("Digite o nome dos alunos:");
	        for (int ind = 0; ind < alunos.length; ind++) {
	            System.out.print("Aluno " + (ind + 1) + ": ");
	            alunos[ind] = leia.next();
	        }
	        
	        System.out.println();
	        
	        // mostra os nomes digitados
	        System.out.println("Nomes digitados:");
	        for (int ind = 0; ind < alunos.length; ind++) {
	            System.out.print(alunos[ind] + "  ");
	        }
	        
	        System.out.println("\n");

	        double[][] notasAlunos = new double[5][5];
	        double[] somaNotas = new double[5];
	        double[] mediaInd = new double[5];
	        double somaTurma = 0;
	        
	        // criação da matriz que armazena as notas das provas
	        
	        System.out.println("Digite as notas dos alunos(0 a 10). Respectivamente Prova 1 - Prova 2 - Prova 3 - Prova 4 - Prova 5:");
	        System.out.println("Leve em consideração a ordem de digitação dos nomes");
	        for (int linha = 0; linha < notasAlunos.length; linha++) {
	            for (int col = 0; col < notasAlunos[0].length; col++) {
	                System.out.print("Aluno " + (linha + 1) + " Prova " + (col + 1) + ": ");	       
	                notasAlunos[linha][col] = leia.nextInt();

	                if (notasAlunos[linha][col] < 0 || notasAlunos[linha][col] > 10) { // só preenche o vetor se o valor for maior que 0 ou menor que 10
	                    System.out.println("Informe somente notas válidas!");
	                    System.out.println();
	                    col--;
	                }

	                somaNotas[linha] += notasAlunos[linha][col]; // soma as notas de cada linha individualmente e armazena
	                mediaInd[linha] = somaNotas[linha] / notasAlunos.length; // calcula a média de cada linha e armazena
	                somaTurma += notasAlunos[linha][col]; // soma de todas as notas armazenadas 
	            }
	        }
	        System.out.println();

	        //System.out.println(somaTurma);
	        double mediaTurma = somaTurma / (notasAlunos.length * notasAlunos[0].length); // média da turma
	        
	        // matriz com as notas dos alunos
	        
	        System.out.println("Nome dos alunos e sua nota em cada uma das provas:\n");
	        System.out.print("\t");
	        for (int col = 0; col < notasAlunos[0].length; col++) {
	            System.out.print("\t" + "P " + (col + 1)); // identifica as colunas
	        }
	        System.out.print("\n");
	        for (int linha = 0; linha < notasAlunos.length; linha++) {
	            System.out.print(alunos[linha] + "\t\t"); // identifica as linhas
	            for (int col = 0; col < notasAlunos[0].length; col++) {
	                System.out.print(notasAlunos[linha][col] + "\t");
	            }
	            System.out.println("\n");
	        }

	        int aprovados = 0, reprovados = 0, acimaMedia = 0; // variáveis de controle
	        
	        // mostra os itens pedidos
	        
	        System.out.println("Situação atual de cada aluno:\n");
	        for (int linha = 0; linha < notasAlunos.length; linha++) {
	            System.out.println("Aluno: " + alunos[linha]);
	            System.out.printf("Média das cinco provas:%.2f %n ", mediaInd[linha]);
	            if (mediaInd[linha] >= 6) {
	                System.out.println("APROVADO!");
	                aprovados++; // quantidade de aprovados
	            } else {
	                System.out.println("REPROVADO!");

	                reprovados++; // quantidade de reprovados
	            }

	            if (mediaInd[linha] > mediaTurma) {
	                acimaMedia++;
	            }
	            System.out.println();
	        }
	        
	        System.out.printf("Média da turma:%.2f %n ", mediaTurma);
	        System.out.println("Quantidade de alunos com a média acima da média da turma: " + acimaMedia);
	        System.out.println("Quantidade de alunos aprovados:" + aprovados);
	        System.out.println("Quantidade de alunos reprovados:" + reprovados);
	}
}

