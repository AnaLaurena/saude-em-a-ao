package utils;
import java.util.Scanner;

public class CronometroPedalada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String atividade;
        long inicio = 0;
        long fim = 0;
        long pausa = 0;
        long tempoDecorrido = 0;

        while (true) {
            System.out.println("Informe a atividade (caminhar/pedalar/pausar/sair):");
            atividade = scanner.nextLine();

            if (atividade.equalsIgnoreCase("caminhar") || atividade.equalsIgnoreCase("pedalar")) {
                if (inicio == 0) {
                    // Iniciar o cronômetro
                    inicio = System.currentTimeMillis();
                    System.out.println("Cronômetro iniciado!");
                } else {
                    // Parar o cronômetro e exibir o tempo decorrido
                    fim = System.currentTimeMillis();
                    tempoDecorrido += (fim - inicio) / 1000;

                    System.out.println("Tempo decorrido: " + tempoDecorrido + " segundos");

                    // Reiniciar as variáveis para a próxima atividade
                    inicio = 0;
                    fim = 0;
                }
            } else if (atividade.equalsIgnoreCase("pausar")) {
                if (inicio != 0 && pausa == 0) {
                    // Pausar o cronômetro
                    pausa = System.currentTimeMillis();
                    System.out.println("Cronômetro pausado!");
                } else if (inicio == 0) {
                    System.out.println("Cronômetro não iniciado. Não é possível pausar.");
                } else {
                    // Continuar o cronômetro
                    long tempoPausado = System.currentTimeMillis() - pausa;
                    inicio += tempoPausado;

                    // Reiniciar a variável de pausa
                    pausa = 0;

                    System.out.println("Cronômetro continuado!");
                }
            } else if (atividade.equalsIgnoreCase("sair")) {
                break;
            } else {
                System.out.println("Atividade inválida. Tente novamente.");
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
