package dev.andredeomondes.entities;

public class Carro {

    private boolean ligado;
    private int velocidade;
    private int marcha; // 0 a 6

    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public void ligar() {
        if (ligado) {
            System.out.println("O carro já está ligado.");
            return;
        }
        ligado = true;
        System.out.println("Carro ligado.");
    }

    public void desligar() {
        if (!ligado) {
            System.out.println("O carro já está desligado.");
            return;
        }

        if (marcha == 0 && velocidade == 0) {
            ligado = false;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("Para desligar, o carro deve estar em ponto morto e parado.");
        }
    }

    public void acelerar() {
        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }

        if (marcha == 0) {
            System.out.println("Não é possível acelerar em ponto morto.");
            return;
        }

        if (velocidade >= 120) {
            System.out.println("Velocidade máxima atingida.");
            return;
        }

        if (!velocidadePermitidaParaMarcha(velocidade + 1, marcha)) {
            System.out.println("Troque a marcha para continuar acelerando.");
            return;
        }

        velocidade+=10;
        System.out.println("Velocidade: " + velocidade + " km/h");
    }

    public void diminuirVelocidade() {
        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }

        if (velocidade > 0) {
            velocidade--;
            System.out.println("Velocidade: " + velocidade + " km/h");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    public void virarEsquerda() {
        virar("esquerda");
    }

    public void virarDireita() {
        virar("direita");
    }

    private void virar(String direcao) {
        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }

        if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando à " + direcao + ".");
        } else {
            System.out.println("Velocidade inválida para virar.");
        }
    }

    public void verificarVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }

    public void trocarMarcha(int novaMarcha) {
        if (!ligado) {
            System.out.println("O carro está desligado.");
            return;
        }

        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inválida.");
            return;
        }

        if (Math.abs(novaMarcha - marcha) != 1) {
            System.out.println("Não é permitido pular marchas.");
            return;
        }

        if (!velocidadePermitidaParaMarcha(velocidade, novaMarcha)) {
            System.out.println("Velocidade incompatível com a marcha.");
            return;
        }

        marcha = novaMarcha;
        System.out.println("Marcha atual: " + marcha);
    }

    private boolean velocidadePermitidaParaMarcha(int velocidade, int marcha) {
        return switch (marcha) {
            case 0 -> velocidade == 0;
            case 1 -> velocidade >= 0 && velocidade <= 20;
            case 2 -> velocidade >= 21 && velocidade <= 40;
            case 3 -> velocidade >= 41 && velocidade <= 60;
            case 4 -> velocidade >= 61 && velocidade <= 80;
            case 5 -> velocidade >= 81 && velocidade <= 100;
            case 6 -> velocidade >= 101 && velocidade <= 120;
            default -> false;
        };
    }
}
