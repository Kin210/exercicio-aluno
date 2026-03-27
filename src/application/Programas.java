package application;


import java.util.Locale;
import java.util.Scanner;





   public class Programas {
   public static void main(String[] args) {


      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      

      int n;
      char resposta;


      
      System.out.print("Quantas notas vc quer inserir? ");
      n = sc.nextInt();

      double[] media = new double[n];

      String[] name = new String[n];

      int i = 0;

      do {

           sc.nextLine();
           System.out.print("Nome do Aluno: ");
           name[i] = sc.nextLine();
           
          double nota = 0.0;


          for(int j=0; j<n; j++) {
          System.out.printf("Nota %d : ", (j + 1));
           nota += sc.nextDouble();
        }   

        media[i] = nota / n;

          System.out.print("Quer adicionar mais um aluno? [Y/N] ");
           resposta = sc.next().charAt(0);
           sc.nextLine();

           i++;

      } while (resposta == 'Y' || resposta == 'y') ;

      System.out.println("BOLETIM: ");

      for (int j=0; j < i; j ++) {

       System.out.println();
       System.out.println("----------------------------");
       System.out.println("Nome: " + name[j]);
       System.out.printf("Nota: %.2f%n", media[j]);
       System.out.print("Status: ");
      

         
       if (media[j]>= 7.00) {   
        System.out.println("Aprovado");
       } 
         else { 
            if(media[j] >= 5.00) {
             System.out.println(" recuperação");
           } 
            else  {
            System.out.println("Reprovado"); 
           }
          }
      }
        

      System.out.println("----------------------------");

      System.out.println("Notas Fechadas");
  
      sc.close();
    
   
    }
   }
