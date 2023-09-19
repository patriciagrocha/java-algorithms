package S1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculadora Simples");

        System.out.println("Digite um número:");
        double numberOne = input.nextDouble();

        System.out.println("Digite outro número:");
        double numberTwo = input.nextDouble();

        System.out.println("Escolha a operação: 1-Somar 2-Subtrair 3-Multiplicar 4-Dividir ");
        int operator = input.nextInt();

        double result = 0;

        switch (operator) {
            case 1 -> result = numberOne + numberTwo;
            case 2 -> result = numberOne - numberTwo;
            case 3 -> result = numberOne * numberTwo;
            case 4 -> {
                if (numberTwo == 0) {
                    System.out.println("Erro: Divisão por zero!");
                    System.exit(1); // Sai do programa com código de erro 1
                } else {
                    result = numberOne / numberTwo;
                }
            }
            default -> {
                System.out.println("Operação inválida!");
                System.exit(1); // Sai do programa com código de erro 1
            }
        }
        // Exibe o resultado da operação
        System.out.println("Resultado: " + result);

    }
}
