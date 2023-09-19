package S1;

import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculadora de comissões");

        System.out.println("Salário inicial:");
        double initialSalary = input.nextDouble();

        int percent;
        double finalSalary;

        if(initialSalary <=1200) {
            percent = 20;
        }else if(initialSalary <= 1700){
            percent = 15;
        }else if (initialSalary <= 2500) {
            percent = 10;
        }else {
            percent = 5;
        }

        double increment = (initialSalary * percent) / 100;

        finalSalary = initialSalary + increment;

        System.out.printf("Salário inicial: R$ %.2f %n", initialSalary);
        System.out.println("Percentual de aumento aplicado: " + percent + "%");
        System.out.printf("Valor do aumento: R$ %.2f %n", increment);
        System.out.printf("Salário final: R$ %.2f %n",finalSalary);

    }
}
