package ClassworkLES1;

import TestMetodic1.*;

public class Main {
    public static void main(String[] args) {
        Human human = new Assasin();
        human.breathe();
        Gibrid gibrid = new Assasin();
        System.out.println(gibrid);

        MacUser macUser = new MacUser("Female",31);
        macUser.info();
        Gibrid[] gibrid1 = {
            new Assasin(),
            new MacUser("Male", 35),
            new User(2,"John","Noob",59 )
        };

        gibrid1[1].taste("Blue");
    }
}
