import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Escreva um código que o usuário entre com um primeiro número,
        //       um segundo número maior que o primeiro e escolhe entre a opção
        //par e impar, com isso o código deve informar todos os números pares ou
        //ímpares(de acordo com a seleção inicial) no intervalo de números
        // informados, incluindo os números informados e em ordem decrescente;

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int primeiroNumero, segundoNumero, opcao;

        System.out.println("--- Números Pares e Ímpares em Intervalo Decrescente ---");
        System.out.print("Digite o primeiro número: ");
        primeiroNumero = leitor.nextInt();


        System.out.print("Digite o segundo número (maior que o primeiro): ");
        segundoNumero = leitor.nextInt();
        if (segundoNumero <= primeiroNumero) {
            while (segundoNumero <= primeiroNumero) {
                System.out.println();
                System.out.println("O segundo número deve ser maior que o primeiro.");
                System.out.println();
                System.out.print("Digite o segundo número (maior que o primeiro): ");
                segundoNumero = leitor.nextInt();
            }
        }

        System.out.print("Escolha uma opção (1 - Par, 2 - Ímpar): ");
        opcao = leitor.nextInt();

        System.out.println("Números " + (opcao == 1 ? "Pares" : "Ímpares") + " no intervalo de " + segundoNumero + " a " + primeiroNumero + ":");

        for (int i = segundoNumero; i >= primeiroNumero; i--) {
            if (opcao == 1 && i % 2 == 0) {
                System.out.println(i);
            } else if (opcao == 2 && i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("--- Fim do Programa ---");

        leitor.close();
    }
}