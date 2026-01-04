package dev.andredeomondes.entities;

public class ContaBancaria {

    private double saldo;
    private double limiteChequeEspecial;
    private double chequeEspecialUsado;

    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;

        if (depositoInicial <= 500) {
            this.limiteChequeEspecial = 50;
        } else {
            this.limiteChequeEspecial = depositoInicial * 0.5;
        }

        this.chequeEspecialUsado = 0;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public double consultarChequeEspecial() {
        return limiteChequeEspecial - chequeEspecialUsado;
    }

    public boolean estaUsandoChequeEspecial() {
        return chequeEspecialUsado > 0;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }

        if (chequeEspecialUsado > 0) {
            double taxa = chequeEspecialUsado * 0.20;
            double totalDevido = chequeEspecialUsado + taxa;

            if (valor >= totalDevido) {
                valor -= totalDevido;
                chequeEspecialUsado = 0;
                System.out.println("Cheque especial quitado com taxa de R$ " + taxa);
            } else {
                chequeEspecialUsado -= valor;
                System.out.println("Depósito usado para abater cheque especial.");
                return;
            }
        }

        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return false;
        }

        double saldoTotal = saldo + consultarChequeEspecial();

        if (valor > saldoTotal) {
            System.out.println("Saldo insuficiente.");
            return false;
        }

        if (valor <= saldo) {
            saldo -= valor;
        } else {
            double restante = valor - saldo;
            saldo = 0;
            chequeEspecialUsado += restante;
        }

        return true;
    }

    public boolean pagarBoleto(double valor) {
        return sacar(valor);
    }

    public void exibirDados() {
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Cheque especial disponível: R$ " + consultarChequeEspecial());
        System.out.println("Usando cheque especial: " + (estaUsandoChequeEspecial() ? "Sim" : "Não"));
    }
}
