package S3.megasena;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<Concurso> lista = new ArrayList<>(); //lista vazia

        //src/main/java/S3/megasena/megasena.txt
        Path arquivo = Paths.get("src/main/java/S3/megasena/megasena.txt");
        if (Files.notExists(arquivo))
            System.out.println("Arquivo não encontrado!");

        List<String> linhasArquivo = Files.readAllLines(arquivo); //ler o arquivo e retorna um lista de strings

        //cada linha será transformada em concurso e colocar na lista
        for(String linha : linhasArquivo) {
            String[] splitDaLinha = linha.split(","); //[2506,02/08/2022,21,44,40,34,22,29]

            int numConcurso = Integer.parseInt(splitDaLinha[0]);

            String dataStr = splitDaLinha[1]; //data como string
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate data = LocalDate.parse(dataStr,formatador);

            int[] numSorteados = new int[6];
            for(int i = 0; i < 6; i++){
                String n = splitDaLinha[i+2];
                numSorteados[i] = Integer.parseInt(n);
            }

            //instaciando concurso e adicionando na lista
            Concurso concurso = new Concurso(numConcurso, data, numSorteados);
            lista.add(concurso); // add concurso na lista
        }
        lista.forEach( concurso -> System.out.println(concurso));

    }
}
