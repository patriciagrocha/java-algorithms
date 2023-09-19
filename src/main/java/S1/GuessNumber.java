package S1;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Adivinhe qual número de 1 a 5 estou pensando: ");
        int numberUser = input.nextInt();

        int rand = (int)(Math.random() * 5 ) + 1;

        if(numberUser == rand ){
            System.out.println("Parabéns, vc acertou!!");
        } else{
            System.out.printf("Vc errou! O número correto era: %d %n", rand);
        }

    }
}
