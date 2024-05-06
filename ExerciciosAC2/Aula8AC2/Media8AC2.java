package Aula8AC2;

import java.util.Scanner;

public  class Media8AC2 {

    public static void main(String[] args) {

      
    
        // Informa ao usuário sobre o propósito do programa
        System.out.println("Este programa realiza o calculo da media da sua nota");
   

        
        // Solicita e recebe a AC1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota da AC1 ");
        double ac1 = scanner.nextDouble();

        System.out.print("Digite o peso da AC1 ");
        double peso1 = scanner.nextDouble();

         // Solicita e recebe a AC2
         
         System.out.print("Digite a nota da AC2 ");
         double ac2 = scanner.nextDouble();
        
       
         System.out.print("Digite peso da AC2 ");
         double peso2 = scanner.nextDouble();
         //Soicita e recebe a AG
         
         System.out.print("Digite a nota da AG ");
         double ag = scanner.nextDouble();

      
        System.out.print("Digite o peso da AG");
        double pesog = scanner.nextDouble();

         //Solicita e recebe a AF
         
         System.out.print("Digite a nota da AF ");
         double af = scanner.nextDouble();

        System.out.print("Digite o peso da AF ");
        double pesof = scanner.nextDouble();
        

        
        
        
         // Calcula a soma dos dois números
         double resultadoMedia = (ac1 * peso1) + (ac2 * peso2) + (ag * pesog) + (af * pesof);

         // Exibe o resultado para o usuário
         System.out.println("O valor da media é : " + resultadoMedia);

            if(resultadoMedia >= 0 && resultadoMedia <= 2){
            System.out.println(" Não Passou!");

            }else if(resultadoMedia > 2.1 && resultadoMedia <= 4.9){
                System.out.println("Precisa fazer substitutiva");
          
         
         
            }else if (resultadoMedia >= 5 && resultadoMedia < 10) {
                
    
            System.out.println("Passou!");

            }else if(resultadoMedia > 10) {

                System.out.println("Não é permitido um conjunto de notas maior que 10");
               
            }

    
         // Fecha o scanner para evitar vazamento de recursos
         scanner.close();



            }
    
    }

