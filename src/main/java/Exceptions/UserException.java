package Exceptions;



public class UserException extends AssertionError {

    public static final String MESSAGE = "La información que retorna no corresponde a la esperada";

    public UserException(String msg, Throwable cause){
        super(msg,cause);
    }
}
