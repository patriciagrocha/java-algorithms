package S1;

import java.util.Scanner;
public class CalcImc {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        double height = input.nextDouble();

        System.out.println("Digite seu peso: ");
        double weight = input.nextDouble();

        double imc = weight / (height *height);
        System.out.printf("Seu IMC é : %.2f %n ", imc);


    }
}
