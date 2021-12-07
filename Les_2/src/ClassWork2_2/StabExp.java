package ClassWork2_2;

public class StabExp extends RuntimeException{
    public StabExp() {
    }

    public StabExp(String message) {
        super(message);
    }

    public StabExp(String message, Throwable cause) {
        super(message, cause);
    }
}
