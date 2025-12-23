import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- Cálculadora de Tábua de Multiplicação ---");
        int numero;

        System.out.print("Digite um número inteiro: ");
        numero = leitor.nextInt();

        System.out.println("Tábua de multiplicação do " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.printf("%d x %d = %d%n", numero, i, resultado);
        }

        System.out.println("--- Fim da Tábuada de Multiplicação ---");



        leitor.close();
    }
}