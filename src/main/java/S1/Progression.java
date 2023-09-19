package S1;

import java.util.Scanner;

public class Progression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculadora de PA e PG");

        int[] values = new int[10];

        System.out.println("Digite um valor inicial: ");
        values[0] = input.nextInt();

        System.out.println("Digite o valor da raiz: ");
        int rootValue = input.nextInt();

        int operator;

        do{
           System.out.println("Escolha para calcular: 1-PA 2-PG ");
           operator = input.nextInt();
       } while( operator != 1 && operator != 2);

       for( int i = 1; i < values.length; i++){
           if(operator == 1){
               values[i] = rootValue + values[i - 1];
           } else if (operator == 2) {
               values[i] = rootValue * values[i - 1];
           }
       }
        System.out.println("Os 10 primeiros valores da sequência são:");
       for( int value : values){
           System.out.println(value);
       }

    }
}
