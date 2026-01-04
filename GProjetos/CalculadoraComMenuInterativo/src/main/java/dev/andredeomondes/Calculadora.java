package dev.andredeomondes;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 6) {

            System.out.println("\n===== CALCULADORA =====");
            System.out.println("1 - Realizar uma soma");
            System.out.println("2 - Realizar uma subtração");
            System.out.println("3 - Realizar uma multiplicação");
            System.out.println("4 - Realizar uma divisão");
            System.out.println("5 - Elevar um número a uma potência N");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {

                // SOMA
                case 1: {
                    double resultado;
                    System.out.print("Digite o primeiro número: ");
                    resultado = sc.nextDouble();

                    System.out.print("Digite o segundo número: ");
                    resultado += sc.nextDouble();

                    int subOpcao = 0;
                    while (subOpcao != 2) {
                        System.out.println("\n--- Submenu Soma ---");
                        System.out.println("1 - Informar mais números");
                        System.out.println("2 - Sair da operação");
                        System.out.print("Escolha uma opção: ");
                        subOpcao = sc.nextInt();

                        if (subOpcao == 1) {
                            System.out.print("Digite outro número: ");
                            resultado += sc.nextDouble();
                            System.out.println("Resultado parcial: " + resultado);
                        } else if (subOpcao == 2) {
                            System.out.println("Resultado final da soma: " + resultado);
                        } else {
                            System.out.println("Opção inválida!");
                        }
                    }
                    break;
                }

                // SUBTRAÇÃO
                case 2: {
                    double resultado;
                    System.out.print("Digite o primeiro número: ");
                    resultado = sc.nextDouble();

                    System.out.print("Digite o segundo número: ");
                    resultado -= sc.nextDouble();

                    int subOpcao = 0;
                    while (subOpcao != 2) {
                        System.out.println("\n--- Submenu Subtração ---");
                        System.out.println("1 - Informar mais números");
                        System.out.println("2 - Sair da operação");
                        System.out.print("Escolha uma opção: ");
                        subOpcao = sc.nextInt();

                        if (subOpcao == 1) {
                            System.out.print("Digite outro número: ");
                            resultado -= sc.nextDouble();
                            System.out.println("Resultado parcial: " + resultado);
                        } else if (subOpcao == 2) {
                            System.out.println("Resultado final da subtração: " + resultado);
                        } else {
                            System.out.println("Opção inválida!");
                        }
                    }
                    break;
                }

                // MULTIPLICAÇÃO
                case 3: {
                    System.out.print("Digite o primeiro número: ");
                    double n1 = sc.nextDouble();

                    System.out.print("Digite o segundo número: ");
                    double n2 = sc.nextDouble();

                    System.out.println("Resultado da multiplicação: " + (n1 * n2));
                    break;
                }

                // DIVISÃO
                case 4: {
                    System.out.print("Digite o dividendo: ");
                    double dividendo = sc.nextDouble();

                    System.out.print("Digite o divisor: ");
                    double divisor = sc.nextDouble();

                    if (divisor != 0) {
                        double resultado = dividendo / divisor;
                        double resto = dividendo % divisor;

                        System.out.println("Resultado da divisão: " + resultado);
                        System.out.println("Resto da divisão: " + resto);
                    } else {
                        System.out.println("Erro: divisão por zero!");
                    }
                    break;
                }

                // POTÊNCIA
                case 5: {
                    System.out.print("Digite a base: ");
                    double base = sc.nextDouble();

                    System.out.print("Digite o expoente: ");
                    double expoente = sc.nextDouble();

                    double resultado = Math.pow(base, expoente);
                    System.out.println("Resultado da potência: " + resultado);
                    break;
                }

                // SAIR
                case 6:
                    System.out.println("Encerrando a calculadora...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}
