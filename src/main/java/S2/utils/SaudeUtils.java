package S2.utils;

import java.time.LocalDate;

public class SaudeUtils {
    public static int calcularIdade(String dataNascimento){
        //dataNascimento: dd/mm/yyyy
        LocalDate current = LocalDate.now();
        int currentYear = current.getYear();
        int currentMonth = current.getMonthValue();
        int currentDay = current.getDayOfMonth();

        String[] dataNasc = dataNascimento.split("/"); //["02", "03","1982"]
        int anoNasc = Integer.parseInt(dataNasc[2]);
        int mesNasc = Integer.parseInt(dataNasc[1]);
        int diaNasc = Integer.parseInt(dataNasc[0]);

        int idade = currentYear - anoNasc;
        if(currentMonth < mesNasc){
            idade--;
        }else if(currentMonth == mesNasc){
            if (currentDay < diaNasc){
                idade--;
            }
        }
        return idade;
    }
}
