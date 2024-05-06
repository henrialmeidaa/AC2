package Aula7AC2;

import java.util.Scanner;


public  class Media7AC2 {

    public static void main(String[] args) {
    
        // Informa ao usuário sobre o propósito do programa
        System.out.println("Este programa realiza o calculo da media da sua nota");

        // Solicita e recebe a AC1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota da AC1 ");
        double ac1 = scanner.nextDouble();

         // Solicita e recebe a AC2
         
         System.out.print("Digite a nota da AC2 ");
         double ac2 = scanner.nextDouble();

         //Soicita e recebe a AG
         
         System.out.print("Digite a nota da AG ");
         double ag = scanner.nextDouble();

         //Solicita e recebe a AF
         
         System.out.print("Digite a nota da AF ");
         double af = scanner.nextDouble();

        
        
        
         // Calcula a soma dos dois números
         double resultadoMedia = (ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45);

         // Exibe o resultado para o usuário
         System.out.println("O valor da media é : " + resultadoMedia);

            if(resultadoMedia >= 0 && resultadoMedia <= 2){
            System.out.println(" Não Passou!");

            }else if(resultadoMedia > 2.1 && resultadoMedia <= 4.9){
                System.out.println("Precisa fazer substitutiva");
          
         
         
            }else if (resultadoMedia >= 5) {
                
    
            System.out.println("Passou!");



    
     
    
         // Fecha o scanner para evitar vazamento de recursos
         scanner.close();



            }
    
    }

}
