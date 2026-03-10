package application;


import java.util.Locale;
import java.util.Scanner;





   public class Programas {
   public static void main(String[] args) {


      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

     
      System.out.print("Nome do Aluno: ");
      String name = sc.nextLine();

      System.out.print("Quantas notas vc quer inserir? ");
      int n = sc.nextInt();

      double[] notas = new double[n];

      for(int i=0; i<n; i++) {
        System.out.printf("Nota %s° :", (i + 1));
        notas[i] = sc.nextDouble();
      }

      double media = 0.0;

      for(int i=0; i<n; i++) { 
         media += notas[i];
      }

      double mediaTotal = media / n;

      System.out.printf("Media do aluno: %.2f%n", mediaTotal);
         
      System.out.println();
      System.out.print("O aluno " + name + " esta ");

      if (mediaTotal >= 7.00) {   
        System.out.println("Aprovado");
      }
      else {
       if(mediaTotal >= 5.00) {
          System.out.println("de recuperação");
        } 
       else  {
         System.out.println("Reprovado");
      }
    }
  

      sc.close();
    
   
    } 
  }
