package S1;

import java.util.Scanner;
public class FullName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu sobrenome: ");
        String lastName = input.nextLine();

        System.out.println("Digite seu nome: ");
        String name = input.nextLine();

        System.out.printf("Nome completo: %s %s %n", name, lastName);

        String fullName = name + lastName;
        System.out.println("Seu nome tem: " + fullName.length() + " letras.");
    }

}
