package S3.metodoestatico;

public class Contador {
    public static int contarPalavras(String frase){

        if(frase == null)
            return 0;
        String[] arrayStrings = frase.split(" ");
        return arrayStrings.length;



    }
}
