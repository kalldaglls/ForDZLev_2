package ClassWork2_2;

import java.util.Arrays;
import java.util.Random;

public class Airplane {
    private String namePlane;
    private int avgSpeed;

    public Airplane(String namePlane, int avgSpeed) {
        this.namePlane = namePlane;
        this.avgSpeed = avgSpeed;
    }

    public Airplane() {
    }

    public Airplane(String namePlane) {
        this.namePlane = namePlane;
    }

    public void doStabCheck() {
        try {
            checkMech();
            System.out.println("********************************");
            checkElec();
            System.out.println("********************************");
        }catch (MechExp | ElectrExp e) {
//            System.out.println("OOPS!" + " " + Arrays.toString(e.getStackTrace()));
//            e.printStackTrace();
            throw new StabExp("Stab is out!", e);
        }
        }

    private void checkMech() throws MechExp {
        if(!new Random().nextBoolean()){
            MechExp mechExp = new MechExp("Smth went wrong with mech!" );
            throw mechExp;
        }
    }

    private void checkElec() throws ElectrExp {
        if(!new Random().nextBoolean()){
            throw new ElectrExp("Smth went wrong with ELECTRO!!!");
        }
    }

    private void maxSpeedCheck() throws MaxSpeedExp {
        int a = new Random().nextInt(10);
        int c = this.avgSpeed * a;
        if (c > 100) {
            throw new MaxSpeedExp("Too much speed!");
        }
    }

    public void fly() {
        System.out.println(this.namePlane + " go Flying!");
    }
}
