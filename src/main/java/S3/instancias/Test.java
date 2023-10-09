package S3.instancias;

public class Test {
    public static void main(String[] args) {
        Contador contador = new Contador("Quero viajar, preciso de férias e de dinheiro!!!");
        int qtdPalavras = contador.contarPalavras();

        System.out.println(qtdPalavras);
    }
}
