package application;


import java.util.Locale;
import java.util.Scanner;





   public class Programas {
   public static void main(String[] args) {


      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      

      int n;
      String name;
      char resposta;



      do {

          System.out.print("Nome do Aluno: ");
          name = sc.nextLine();

          System.out.print("Quantas notas vc quer inserir? ");
           n = sc.nextInt();

           double[] notas = new double[n];

          for(int i=0; i<n; i++) {
          System.out.printf("Nota %s° : ", (i + 1));
          notas[i] = sc.nextDouble();
        }   

         
        double media = 0.0;

        for(int i=0; i<n; i++) { 
         media += notas[i];
      }

    

      double mediaTotal = media / n;

      System.out.println("BOLETIM");
      System.out.println("----------------------------");
      System.out.println("Nome: " + name);
      System.out.printf("Nota: %.2f%n", mediaTotal);
      System.out.print("Status: ");
      

         
      if (mediaTotal >= 7.00) {   
        System.out.println("Aprovado");
      } 
       else { 
          if(mediaTotal >= 5.00) {
           System.out.println(" recuperação");
         } 
          else  {
          System.out.println("Reprovado"); 
         }
      }

      System.out.println("----------------------------");


          System.out.print("Quer adicionar mais um aluno? [Y/N] ");
           resposta = sc.next().charAt(0);
           sc.nextLine();
           System.out.println();
    } while (resposta == 'Y' || resposta == 'y');

    System.out.println("Notas Fechadas");
  
      sc.close();
    
   
    } 
  }
