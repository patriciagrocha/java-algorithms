package S4.excecoes;

public class IdadeInvalidaException extends RuntimeException { //unchecked

    public  IdadeInvalidaException(String message){
        super(message);
    }
}
