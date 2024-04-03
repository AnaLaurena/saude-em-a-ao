package utils;

import java.util.Scanner;

public class cronometro {
    private long startTime;
    private long elapsedTime;
    private boolean isRunning;
    private double calorias;
    private double distanciaKm;

    public cronometro() {
        isRunning = false;
        calorias = 0;
        distanciaKm = 0;
    }

    public void iniciar() {
        if (!isRunning) {
            startTime = System.currentTimeMillis();
            isRunning = true;
            System.out.println("Cronômetro iniciado.");
        } else {
            System.out.println("O cronômetro já está em execução.");
        }
    }

    public void pausar() {
        if (isRunning) {
            elapsedTime += System.currentTimeMillis() - startTime;
            calcularCaloriasEDistancia();
            isRunning = false;
            System.out.println("Cronômetro pausado.");
        } else {
            System.out.println("O cronômetro não está em execução.");
        }
    }

    public void resetar() {
        isRunning = false;
        elapsedTime = 0;
        calorias = 0;
        distanciaKm = 0;
        System.out.println("Cronômetro resetado.");
    }

    public void exibirTempoDecorrido() {
        long tempoAtual = isRunning ? elapsedTime + System.currentTimeMillis() - startTime : elapsedTime;
        long segundos = tempoAtual / 1000;
        long minutos = segundos / 60;
        segundos %= 60;
        System.out.print("\rTempo decorrido: " + String.format("%02d:%02d", minutos, segundos));
    }

    public void calcularCaloriasEDistancia() {
        long tempoDecorrido = elapsedTime + System.currentTimeMillis() - startTime;
        double horas = (double) tempoDecorrido / (1000 * 60 * 60); // Convertendo de milissegundos para horas
        calorias += horas * 100;
        distanciaKm += horas * 5;
    }

    public void exibirCaloriasEDistancia() {
        calcularCaloriasEDistancia();
        System.out.printf("\nCalorias queimadas: %.2f\nDistância percorrida: %.2f km\n", calorias, distanciaKm);
    }

    public static void main(String[] args) {
        cronometro cronometro = new cronometro();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        Thread threadTempo = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (cronometro.isRunning) {
                    cronometro.exibirTempoDecorrido();
                }
            }
        });
        threadTempo.setDaemon(true);
        threadTempo.start();

        do {
            System.out.println("\n\n--- Cronômetro ---");
            System.out.println("1. Iniciar");
            System.out.println("2. Pausar");
            System.out.println("3. Resetar");
            System.out.println("4. Exibir calorias e distância");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cronometro.iniciar();
                    break;
                case 2:
                    cronometro.pausar();
                    break;
                case 3:
                    cronometro.resetar();
                    break;
                case 4:
                    cronometro.exibirCaloriasEDistancia();
                    break;
                case 0:
                    System.out.println("\nSaindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
