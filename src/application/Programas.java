package application;


import java.util.Locale;
import java.util.Scanner;





   public class Programas {
   public static void main(String[] args) {


      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);


       System.out.println("Notas do Aluno:");

        double n1, n2, n3, n4, n5;

          System.out.print("1° Bimeste: ");
           n1 = sc.nextDouble();
          System.out.print("2° Bimeste: ");
           n2 = sc.nextDouble();
          System.out.print("3° Bimeste: ");
           n3 = sc.nextDouble();
          System.out.print("4° Bimeste: ");
           n4 = sc.nextDouble();
          System.out.print("Nota Final: ");
           n5 = sc.nextDouble();

         double media = (n1 + n2 + n3 + n4 + n5) / 5;

         System.out.printf("Media do aluno: %.2f%n", media);
         
         if (media >= 7.00) {
            System.out.println("Aprovado");
           }else 
         if(media >= 5.00) {
              System.out.println("O aluno está de recuperação");
           }else
             System.out.println("Reprovado");



        
         

      
      sc.close();
    
    
   }
  
}
