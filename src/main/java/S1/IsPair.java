package S1;

import java.util.Scanner;

public class IsPair {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int number = input.nextInt();
        if(number % 2 == 0){
            System.out.println("número par!");
        } else {
            System.out.println("número ímpar!");
        }

    }
}
