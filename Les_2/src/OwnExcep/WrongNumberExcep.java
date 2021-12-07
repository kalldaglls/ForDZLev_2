package OwnExcep;

public class WrongNumberExcep extends Exception{
    public WrongNumberExcep() {
    }

    public WrongNumberExcep(String message) {
        super(message);
    }

    public WrongNumberExcep(String message, Throwable cause) {
        super(message, cause);
    }
}
