package myexception;

public class NameFormatException extends RuntimeException{
    //NameFormat:
    //Exception

    //extends RuntimeException: param error
    // extends Exception: check local info


    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }
}
