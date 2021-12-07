package ClassWork2_2;

public class MechExp extends Exception{
    public MechExp() {
    }

    public MechExp(String message) {
        super(message);
    }

    public MechExp(String message, Throwable cause) {
        super(message, cause);
    }
}
