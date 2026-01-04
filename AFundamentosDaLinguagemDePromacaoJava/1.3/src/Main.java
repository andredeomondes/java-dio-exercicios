import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("|     Calculadora de Área de Retângulos  |");
        System.out.println("-----------------------------------------");
        System.out.println();

        double base, altura, area;

        System.out.print("Digite o valor da base do retângulo: ");
        base = leitor.nextDouble();
        leitor.nextLine();

        System.out.print("Digite o valor da altura do retângulo: ");
        altura = leitor.nextDouble();
        leitor.nextLine();


        area = base * altura;
        System.out.println("A área do retângulo de base " + base + " e altura " + altura + " é igual a " + area);

        leitor.close();


    }
}