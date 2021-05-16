import java.util.Scanner;

public class exMatriz2{
public static void main(String[] args){
	
  Scanner input = new Scanner(System.in);
  double[][] mat = new double[5][5];
  double zzz=0;
  for (int i=0; i<5; i ++){
    for (int j=0; j<5; j++){
      mat[i][j] = input.nextInt();
      if (mat[i][j]<=0){
        System.out.println ("Informe somente números maiores que zero!");
        System.out.println ();
        j--;
      }
      if (mat[i][j]>zzz){
        zzz=mat[i][j];
      }
    }
  }
  System.out.println ("Matriz original:");
  for (int i=0; i<5; i++){
    for (int j=0; j<5; j++){
      System.out.print(mat[i][j]+"\t");
    }
    System.out.println();
  }
  System.out.println ();
  for (int i=0; i<5; i ++){
    for (int j=0; j<5; j++){
      if (i==j){
        mat[i][j]=mat[i][j]*zzz;
      }
    }
  }
  System.out.println ("Matriz resultante:");
  for (int i=0; i<5; i++){
    for (int j=0; j<5; j++){
      System.out.print(mat[i][j]+"\t");
    }
    System.out.println();
  }
}
}