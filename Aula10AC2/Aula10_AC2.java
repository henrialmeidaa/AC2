package Aula10AC2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula10_AC2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

       double notamedia = 0.0;  
       double valorpeso = 0.0;
       double mediafinal = 0.0;

       int numeroalunos = 0; 
       int notas = 0;
       String nome = null, condicao;

       System.out.print("Digite a quantidade de alunos: "); 
       numeroalunos = scn.nextInt();


       for(int i = 1; i <= numeroalunos; i++ ){  // Inicia a repetição dos códigos abaixo
           System.out.print("Digite o nome do aluno: "); 
           nome = scn.next();
           System.out.print("Digite a quantidade de notas: "); 
           notas = scn.nextInt();

       int reinserir = 0;
	do {
           for(int h = 1; h <= notas; h++ ){
		do {
                    System.out.print("Digite a nota " + h + ": "); 
                    mediafinal = scn.nextDouble();
              } while (mediafinal < 0.0 || mediafinal > 10.0);
               System.out.print("Digite o peso (em porcentagem) da nota " + h + ": "); // Insere o peso da nota em porcentagem
               valorpeso = scn.nextDouble();
               notamedia += mediafinal * (valorpeso/100); // Calcula a média 
             }
             System.out.print("Deseja reinserir as notas (1 = sim, 0 = nao)"); 
             reinserir = scn.nextInt();
	} while (reinserir == 1);
       
       
    if (mediafinal >= 0 && mediafinal <= 2) {
        condicao = "Reprovado"; // Se sua média for até 2 aparece que você foi reprovado
    } else if (mediafinal >= 2.1  && mediafinal <= 4.9) {
        condicao = "Substitutiva"; // Se sua média for até 4,9 aparece que você poderá fazer a prova substitutiva
    } else {
        condicao = "Aprovado"; // Se sua média for até acima de 4,9 aparece que você foi aprovado
    }

          DecimalFormat md = new DecimalFormat("#.#");

          System.out.println("\nNome do Aluno: " + nome); // mostra o nome do aluno
          System.out.println("Media Final: " + md.format(mediafinal)); // mostra a média final
          System.out.println("Condicao: " + condicao); // mostra se foi aprovado, se precisa de substitutiva ou reprovado
        }

        scn.close();
    }
}