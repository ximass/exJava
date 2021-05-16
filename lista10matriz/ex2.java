package lista10matriz;

public class ex2 {

	public static void main(String[] args) {

		double [] vetor_a = new double[10];
		   double [] vetor_b = new double[10];
		   double [] vetor_c = new double[20];
		   double num = 0;
		          
		   // Preenchendo o vetor A com os valores
		     for (int cont = 0; cont < 10; cont ++) {      
		        
		       vetor_a[cont] =(int)((Math.random() * 10) + 1);
		     
		     }
		 // Preenchendo o vetor B com os valores
		     for (int cont = 0; cont < 10; cont ++) {      
		        
		       vetor_b[cont] =(int)((Math.random() * 10) + 1);
		     
		     }
		     
		     // Preenchendo o vetor C unindo os valores do Vetor A e B
		     for (int cont = 0; cont < 10; cont ++) {      
		        
		       vetor_c[cont] = vetor_a[cont];
		       vetor_c[cont + 10] = vetor_b[cont];
		     }
		     
		 //Colocando vetor C em ordem crescente
		     for (int cont = 0; cont < 20; cont ++){
		       for (int cont1 = cont + 1; cont1 < 20; cont1 ++){
		       if (vetor_c[cont] > vetor_c[cont1]){
		        
		         num = vetor_c[cont];
		         vetor_c[cont] =  vetor_c[cont1];
		         vetor_c[cont1] = num;		       
		        }
		       }
		      }
		    
		    //Mostrando o Vetor A
		     System.out.println("\n\nElementos do vetor A:");
		    for(int cont = 0; cont < 10; cont ++){
		      System.out.print(vetor_a[cont]+" ");
		    }
		      
		  //Mostrando o Vetor B
		      
		     System.out.println("\n\nElementos do vetor B:");
		    for(int cont = 0; cont < 10; cont ++){
		      System.out.print(vetor_b[cont]+"  ");
		    }
		   
		     //Mostrando o Vetor C
		     System.out.println("\n\nElementos do vetor C:");
		    for(int cont = 0; cont < 20; cont ++){
		      System.out.print(vetor_c[cont]+"  ");
		    }
		    
		    System.out.println();
		  }
	}
	
