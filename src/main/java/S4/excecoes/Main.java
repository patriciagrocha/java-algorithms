package S4.excecoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isIdadeValida = false;

        while (!isIdadeValida){
            System.out.println("Informe sua idade:");
            Scanner sc = new Scanner(System.in);
            int idade = sc.nextInt();
            try {
                validarIdade(idade);
                System.out.println("Olá, vc tem " + idade +  " anos de idade!");
                isIdadeValida = true;
            } catch (IdadeInvalidaException e){
                System.out.println(e.getMessage());
                isIdadeValida = false;
            }
        }
    }
    private static void validarIdade(int idade) {
        if(idade <= 0 || idade > 100){
            //throw new IllegalArgumentException("Idade inválida!");
            throw new IdadeInvalidaException("Vc informou uma idade inválida!");
        }
    }
}
