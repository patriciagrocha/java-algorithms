package S1;

import java.util.Scanner;

/*Crie um programa em Java que, utilizando a classe Scanner,
 peça ao usuário para inserir as notas do semestre, e deve retornar a média final.
 O programa deve pedir 3 notas, que devem ser números reais, e
 retornar um número real com 2 casas depois da vírgula, com o texto “Sua média final é:” seguido do valor.*/
public class FinalMedia {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double firstNote = Double.parseDouble(input.nextLine());

        System.out.println("Digite a segunda nota: ");
        double secondNote = input.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double thirdNote = input.nextDouble();

        if( firstNote >= 0 && secondNote >= 0 && thirdNote >= 0){
            double media =  (firstNote + secondNote + thirdNote) / 3;
            System.out.printf("Sua média final é: %.2f", media);

        } else{
            System.out.println("Valor da nota deve ser maior que zero!");
        }
    }
}
