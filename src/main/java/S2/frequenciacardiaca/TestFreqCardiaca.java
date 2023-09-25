package S2.frequenciacardiaca;

import java.util.Scanner;

public class TestFreqCardiaca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a data de nascimento (dd/mm/yy): ");
        String dataNascimento = scanner.nextLine();

        FreqCardiaca freqCardiaca = new FreqCardiaca("Patrícia","Rocha", dataNascimento);

        System.out.printf("Idade: %d %n Freq.Card.Máx.: %d %n Freq.Card.Alvo: %.1f - %.1f ",
                freqCardiaca.calcularIdade(),
                freqCardiaca.freqCardiacaMax(),
                freqCardiaca.freqCardiacaAlvo()[0],
                freqCardiaca.freqCardiacaAlvo()[1]);
    }
}
