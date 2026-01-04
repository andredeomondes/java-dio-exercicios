import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.println(" --- Cálculadora de Diferença entre Idades --- ");
        int idadeA, idadeB, diferenca;

        System.out.print("Digite a idade da primeira pessoa: ");
        idadeA = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Digite a idade da segunda pessoa: ");
        idadeB = leitor.nextInt();
        leitor.nextLine();

        diferenca = Math.abs(idadeA - idadeB);

        System.out.println("A diferença de idade entre as duas pessoas é de " + diferenca + " anos.");

        leitor.close();
    }
}