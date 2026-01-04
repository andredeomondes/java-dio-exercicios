import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("|     Calculadora de Área de Quadrados  |");
        System.out.println("-----------------------------------------");
        System.out.println();

        double lado,area;

        System.out.print("Digite o valor do lado do quadrado: ");
        lado = leitor.nextDouble();
        leitor.nextLine();

        area = Math.pow(lado,2);
        System.out.printf("A área do quadrado de lado %.2f é igual a %.2f%n", lado, area);

        leitor.close();



    }
}