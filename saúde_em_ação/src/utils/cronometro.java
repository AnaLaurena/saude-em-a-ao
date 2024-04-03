package utils;

import java.util.Scanner;

public class Cronometro {
    private static long inicioPedalada;
    private static long inicioCaminhada;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Iniciar pedalada");
            System.out.println("2 - Iniciar caminhada");
            System.out.println("3 - Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    iniciarPedalada();
                    break;
                case 2:
                    iniciarCaminhada();
                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void iniciarPedalada() {
        inicioPedalada = System.currentTimeMillis();
        System.out.println("Cronômetro da pedalada iniciado.");
    }

    private static void iniciarCaminhada() {
        if (inicioPedalada == 0) {
            System.out.println("Você precisa iniciar a pedalada antes de iniciar a caminhada.");
            return;
        }

        inicioCaminhada = System.currentTimeMillis();
        long tempoTotal = inicioCaminhada - inicioPedalada;
        System.out.println("Cronômetro da caminhada iniciado.");
        System.out.println("Tempo total entre pedalada e caminhada: " + tempoTotal / 1000 + " segundos.");
    }
}
