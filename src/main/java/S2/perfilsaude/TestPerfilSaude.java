package S2.perfilsaude;

import java.util.Scanner;

public class TestPerfilSaude {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso em kg:");
        double peso = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite sua altura em m:");
        double altura = Double.parseDouble(scanner.nextLine());

        PerfilSaude perfilSaude = new PerfilSaude("", "", "25/02/1991",
                "", altura, peso);

        System.out.println(perfilSaude.imc());
    }
}
