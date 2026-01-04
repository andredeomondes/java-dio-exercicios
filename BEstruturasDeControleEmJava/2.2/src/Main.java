import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- Calculadora de IMC ---");
        double altura;
        double peso;
        double imc;
        System.out.print("Digite sua altura (em metros): ");
        altura = leitor.nextDouble();
        System.out.print("Digite seu peso (em kg): ");
        peso = leitor.nextDouble();
        imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f%n", imc);
        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade III (Mórbida)");
        }

        System.out.println("--- Fim da Calculadora de IMC ---");

        leitor.close();

    }
}