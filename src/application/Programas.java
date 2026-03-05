package application;


import java.util.Locale;
import java.util.Scanner;





   public class Programas {
   public static void main(String[] args) {


      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

       System.out.print("Quantas notas vc quer inserir? ");
        int n = sc.nextInt();

          double[] vetor = new double[n];

          for(int i=0; i<vetor.length; i++) {
            System.out.printf("Nota %s° :", (i + 1));
            vetor[i] = sc.nextDouble();
          }

         double media = 0.0;

           for(int i=0; i<n; i++) { 
             media += vetor[i];
         }

           double avg = media / n;

          System.out.printf("Media do aluno: %.2f%n", avg);
         
         if (avg >= 7.00) {   
            System.out.println("Aprovado");
           }else 
         if(avg >= 5.00) {
              System.out.println("O aluno está de recuperação");
           }else
             System.out.println("Reprovado");
  
      sc.close();
    
    
   }
  
}
