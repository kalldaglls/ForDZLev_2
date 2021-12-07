package Metoda2_2;

import java.util.Random;

public class Airplane {
    public void doStabCheck(boolean isOk) {
        checkMech();
    }

    private String namePlane;

    private void checkMech() throws MechExp {
        if(!new Random().nextBoolean()){
            MechExp mechExp = new MechExp("Smth went wrong with mech!");
            throw mechExp;
        }

    }
}
