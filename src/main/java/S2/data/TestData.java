package S2.data;

import java.util.Scanner;

public class TestData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Imprimindo data xx/xx/xxxx");

        System.out.println("Digite o dia: ");
        int dia = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o mês: ");
        int mes = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o ano: ");
        int ano = Integer.parseInt(scanner.nextLine());

        Data novaData = new Data(dia, mes, ano);

        System.out.println(novaData.exibirData());

    }
}
