package S3.instancias;

public class Contador {
    private String frase;

    public Contador() { }
    public Contador(String frase) {
        this.frase = frase;
    }

    public int contarPalavras(){
        if (this.frase == null)
            return 0;
        String[] arrayPalavras = this.frase.split(" ");
        return arrayPalavras.length;

    }
}
