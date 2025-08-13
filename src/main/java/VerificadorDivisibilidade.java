package main.java;

import java.util.Scanner;

public class VerificadorDivisibilidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== VERIFICADOR DE DIVISIBILIDADE ===");

        // Solicita o número inicial (divisor)
        System.out.print("Digite o número inicial (divisor): ");
        int divisor = scanner.nextInt();
        int numeroAtual;
        boolean continuar = true;
        System.out.println("\nDigite números maiores ou iguais a " + divisor + ". O programa encerrará quando um número não for divisível.");
        while (continuar) {
            System.out.print("\nDigite um número: ");
            numeroAtual = scanner.nextInt();
            if (numeroAtual < divisor) {
                System.out.println("Número ignorado (menor que o divisor).");
                continue; // Pula para a próxima iteração
            }
            if (numeroAtual % divisor != 0) {
                System.out.println(numeroAtual + " não é divisível por " + divisor + "! Encerrando...");
                continuar = false;
            } else {
                System.out.println(numeroAtual + " é divisível por " + divisor + ".");
            }
        }

        scanner.close();
    }
}
