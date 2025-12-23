import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);
        System.out.println("=== Programa de Verificação de Divisibilidade ===\n");
        System.out.print("Informe o número inicial (divisor): ");
        int divisor = leitor.nextInt();

        while (true) {
            System.out.print("Informe um número: ");
            int numero = leitor.nextInt();

            if (numero < divisor) {
                System.out.println("-> " + numero + " é menor que " + divisor + ". Ignorando...");
                continue;
            }

            if (numero % divisor != 0) {
                System.out.println("-> Resto diferente de zero (" + (numero % divisor) + "). Encerrando...");
                break;
            } else {
                System.out.println("-> " + numero + " é divisível por " + divisor + ". Continue...");
            }
        }

        leitor.close();
        System.out.println("Programa finalizado.");

    }
}