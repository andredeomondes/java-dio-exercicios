package dev.andredeomondes;
import dev.andredeomondes.entities.Carro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();
        int opcao;

        do {
            System.out.println("\n===== MENU DO CARRO =====");
            System.out.println("1 - Ligar carro");
            System.out.println("2 - Desligar carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Virar à esquerda");
            System.out.println("6 - Virar à direita");
            System.out.println("7 - Verificar velocidade");
            System.out.println("8 - Trocar marcha");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1 -> carro.ligar();

                case 2 -> carro.desligar();

                case 3 -> carro.acelerar();

                case 4 -> carro.diminuirVelocidade();

                case 5 -> carro.virarEsquerda();

                case 6 -> carro.virarDireita();

                case 7 -> carro.verificarVelocidade();

                case 8 -> {
                    System.out.print("Digite a nova marcha (0 a 6): ");
                    int marcha = scanner.nextInt();
                    carro.trocarMarcha(marcha);
                }

                case 0 -> System.out.println("Encerrando o sistema...");

                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
