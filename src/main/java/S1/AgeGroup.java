package S1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a data de nascimento(AAAA-MM-DD): ");
        String dateBirthStr = input.nextLine();

        // Converte a data de nascimento para o tipo LocalDate
        LocalDate dateBirth = LocalDate.parse(dateBirthStr);

        // Calcula a idade com base na data de nascimento
        LocalDate dateNow = LocalDate.now();
        Period period = Period.between(dateBirth, dateNow);
        int age = period.getYears();

        String alert;

        if(age < 16 ){
            alert = "Voto proibido!";
        } else if(age < 18 || age > 59){
            alert = "Voto opcional!";
        }else{
            alert = "Voto obrigatório!";
        }
        System.out.printf("Sua idade é: %d anos - %s", age, alert);

    }
}
