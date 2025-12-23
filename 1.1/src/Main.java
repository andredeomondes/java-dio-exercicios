import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("|         Calculadora de Idades        |");
        System.out.println("----------------------------------------");

        System.out.print("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.print("Digite seu ano de nascimento: ");
        int anoDeNascimento = leitor.nextInt();
        leitor.nextLine();

        int anoAtual = LocalDate.now().getYear();

        int idadeCalculada = anoAtual - anoDeNascimento;
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("           Você tem " + idadeCalculada + " anos!!! ");
        System.out.println("-------------------------------------------------");

        leitor.close();
    }
}