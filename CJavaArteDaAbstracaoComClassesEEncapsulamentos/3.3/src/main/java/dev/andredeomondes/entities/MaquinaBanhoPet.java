package dev.andredeomondes.entities;
public class MaquinaBanhoPet {

    private int agua;          // litros
    private int shampoo;       // litros
    private boolean temPet;
    private boolean petLimpo;

    private final int MAX_AGUA = 30;
    private final int MAX_SHAMPOO = 10;

    public MaquinaBanhoPet() {
        this.agua = 0;
        this.shampoo = 0;
        this.temPet = false;
        this.petLimpo = true; // máquina começa limpa
    }

    // Colocar pet na máquina
    public void colocarPet() {
        if (temPet) {
            System.out.println("Já existe um pet na máquina.");
            return;
        }

        if (!petLimpo) {
            System.out.println("A máquina precisa ser limpa antes de colocar outro pet.");
            return;
        }

        temPet = true;
        petLimpo = false;
        System.out.println("Pet colocado na máquina.");
    }

    // Retirar pet da máquina
    public void retirarPet() {
        if (!temPet) {
            System.out.println("Não há pet na máquina.");
            return;
        }

        temPet = false;

        if (!petLimpo) {
            System.out.println("Pet retirado sujo. Será necessário limpar a máquina.");
        } else {
            System.out.println("Pet retirado limpo.");
        }
    }

    // Dar banho
    public void darBanho() {
        if (!temPet) {
            System.out.println("Não há pet na máquina.");
            return;
        }

        if (agua < 10 || shampoo < 2) {
            System.out.println("Água ou shampoo insuficientes para o banho.");
            return;
        }

        agua -= 10;
        shampoo -= 2;
        petLimpo = true;

        System.out.println("Banho realizado com sucesso!");
    }

    // Limpar máquina
    public void limparMaquina() {
        if (temPet) {
            System.out.println("Não é possível limpar a máquina com pet dentro.");
            return;
        }

        if (agua < 3 || shampoo < 1) {
            System.out.println("Água ou shampoo insuficientes para limpeza.");
            return;
        }

        agua -= 3;
        shampoo -= 1;
        petLimpo = true;

        System.out.println("Máquina limpa com sucesso.");
    }

    // Abastecer água (+2 litros)
    public void abastecerAgua() {
        if (agua + 2 > MAX_AGUA) {
            System.out.println("Capacidade máxima de água atingida.");
            return;
        }

        agua += 2;
        System.out.println("Água abastecida. Nível atual: " + agua + " litros.");
    }

    // Abastecer shampoo (+2 litros)
    public void abastecerShampoo() {
        if (shampoo + 2 > MAX_SHAMPOO) {
            System.out.println("Capacidade máxima de shampoo atingida.");
            return;
        }

        shampoo += 2;
        System.out.println("Shampoo abastecido. Nível atual: " + shampoo + " litros.");
    }

    public void verificarAgua() {
        System.out.println("Nível de água: " + agua + " litros.");
    }

    public void verificarShampoo() {
        System.out.println("Nível de shampoo: " + shampoo + " litros.");
    }

    public void verificarPet() {
        if (temPet) {
            System.out.println("Há um pet na máquina.");
        } else {
            System.out.println("Não há pet na máquina.");
        }
    }
}
