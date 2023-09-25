package S2.retangulo;

import java.util.Scanner;

public class TestRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calcule a área e o perímetro do retângulo");

        System.out.println("Digite a largura:");
        double largura = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o comprimento:");
        double comprimento = Double.parseDouble(scanner.nextLine());

        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(largura);
        retangulo.setComprimento(comprimento);

        System.out.printf("Área: %.2f %n", retangulo.area());
        System.out.printf("Perímetro: %.2f %n", retangulo.perimetro());

    }
}
