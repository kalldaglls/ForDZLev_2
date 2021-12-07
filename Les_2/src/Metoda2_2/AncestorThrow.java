package Metoda2_2;

import java.io.IOException;

public class AncestorThrow extends NullPointerException {
    private String name;

    public AncestorThrow(String name) {
        this.name = name;
    }

    public AncestorThrow(String message, String name) {
        super(message);
        this.name = name;
    }
}
