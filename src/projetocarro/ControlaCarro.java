package projetocarro;

import java.util.Scanner;

public class ControlaCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um objeto Carro
        Carro carro1 = new Carro("FIAT", "UNO", "VERMELHO", 2025);

        int opcao;

        // Menu interativo
        do {
            System.out.println("\n======= MENU DO CARRO =======");
            System.out.println("[1] - Mostrar detalhes do carro");
            System.out.println("[2] - Ligar o carro");
            System.out.println("[3] - Desligar o carro");
            System.out.println("[4] - Acelerar o carro");
            System.out.println("[5] - Frear o carro");
            System.out.println("[0] - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    carro1.info();
                    break;
                case 2:
                    carro1.ligarCarro();
                    break;
                case 3:
                    carro1.desligarCarro();
                    break;
                case 4:
                    System.out.print("Digite a velocidade para acelerar (km/h): ");
                    int acelerar = scanner.nextInt();
                    carro1.acelerar(acelerar);
                    break;
                case 5:
                    System.out.print("Digite a velocidade para reduzir (km/h): ");
                    int frear = scanner.nextInt();
                    carro1.frear(frear);
                    break;
                case 0:
                    System.out.println("Saindo do programa");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}