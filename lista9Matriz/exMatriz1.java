import java.util.Scanner;

public class exMatriz1{

     public static void main(String[] args) {
    	 
    	 
    	  Scanner input = new Scanner(System.in);
     
    	 
          int[][] num = new int[4][5];
          
          for (int i=0; i < 4; i ++){
               for (int j=0; j < 5; j++)
               {
                    num[i][j] = input.nextInt();
               }
          }
          
          for (int i=0; i < 4; i ++)
          {
               for (int j=0; j < 5; j++)
               {
                    System.out.print( num[i][j]+"\t" );
               }
               System.out.println();
          }
     }
}
