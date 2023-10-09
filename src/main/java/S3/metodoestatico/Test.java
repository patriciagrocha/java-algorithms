package S3.metodoestatico;

public class Test {
    public static void main(String[] args) {

        String frase = "Preciso de férias, quero viajar!!!";

        //método contador é estático, não precisa criar uma instância para usar, pode chamar direto
        int qtdPalavras = Contador.contarPalavras(frase);
        System.out.println(qtdPalavras);

    }
}
