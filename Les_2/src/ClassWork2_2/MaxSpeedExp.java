package ClassWork2_2;

public class MaxSpeedExp extends RuntimeException{
    public MaxSpeedExp() {
    }

    public MaxSpeedExp(String message) {
        super(message);
    }

    public MaxSpeedExp(String message, Throwable cause) {
        super(message, cause);
    }
}
