package Aula9AC2;

import java.util.Scanner;

public class Media9AC2 {

    public static void main(String[] args) {

        // Informa ao usuário sobre o propósito do programa
        System.out.println("Seja bem-vindo!");

        System.out.println("Este programa realiza o calculo da media da sua nota");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de alunos");
        int limite = scanner.nextInt();

        for (int i = 0; i < limite; i++) {

            System.out.println("Digite o nome do aluno");
            String nome = scanner.next();

            // Solicita e recebe a AC1

            System.out.print("Digite a nota da AC1 ");
            double ac1 = scanner.nextDouble();

            if (ac1 > 10) {
                System.out.print("A nota não pode ser maior que 10");
                return;
            }

            System.out.print("Digite o peso da AC1 ");
            double peso1 = scanner.nextDouble();

            if (peso1 >= 1) {
                System.out.print("O peso não pode ser maior ou igual a 1");
                return;
            }

            // Solicita e recebe a AC2

            System.out.print("Digite a nota da AC2 ");
            double ac2 = scanner.nextDouble();

            if (ac2 > 10) {
                System.out.print("A nota não pode ser maior que 10");
                return;
            }

            System.out.print("Digite peso da AC2 ");
            double peso2 = scanner.nextDouble();

            if (peso2 >= 1) {
                System.out.print("O peso não pode ser maior ou igual a 1");
                return;
            }
            // Soicita e recebe a AG

            System.out.print("Digite a nota da AG ");
            double ag = scanner.nextDouble();

            if (ag > 10) {
                System.out.print("A nota não pode ser maior que 10");
                return;
            }

            System.out.print("Digite o peso da AG");
            double pesog = scanner.nextDouble();

            if (pesog >= 1) {
                System.out.print("O peso não pode ser maior ou igual a 1");
                return;
            }

            // Solicita e recebe a AF

            System.out.print("Digite a nota da AF ");
            double af = scanner.nextDouble();

            if (af > 10) {
                System.out.print("A nota não pode ser maior que 10");
                return;
            }

            System.out.print("Digite o peso da AF ");
            double pesof = scanner.nextDouble();

            if (pesof >= 1) {
                System.out.print("O peso não pode ser maior ou igual a 1");
                return;
            }

            // Calcula a soma dos dois números
            double resultadoMedia = (ac1 * peso1) + (ac2 * peso2) + (ag * pesog) + (af * pesof);

            // Exibe o resultado para o usuário
            System.out.println("O valor da media de : " + nome + " é " + resultadoMedia);

            if (resultadoMedia >= 0 && resultadoMedia <= 2) {
                System.out.println(" Não Passou!");
            } else if (resultadoMedia > 2.1 && resultadoMedia <= 4.9) {
                System.out.println("Precisa fazer substitutiva");
            } else if (resultadoMedia >= 5) {
                System.out.println("Passou!");
            } else if (resultadoMedia > 10) {
                System.out.println("Erro!");
            }
            scanner.close();
        }

        
    }
    
}
