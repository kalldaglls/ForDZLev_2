package TestMetodic1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        User user = new User(12, "Sam", "Director", 35);
//        User user1 = new User("Male", 12);
//        user.changePosition("Staff");
//        System.out.println(user1);
//        user.breathe();
//
//        Human human = new User("Female", 18);
//        System.out.println(human);
//        System.out.println(human.hashCode());
//        Human human1 = new Human("Queer");
//        System.out.println(human1);
        Killers killers = Killers.Kiborg;
        System.out.println(killers);
        System.out.println(Arrays.toString(Killers.values()));
        //System.out.println(Killers.valueOf("Gibrid").getClass());

        //Outer.Inner inner = new Outer.Inner(23);

        Gibrid gibrid3 = new Gibrid() {
            @Override
            public void taste(String bloodType) {
                System.out.println("Witout taste..." + bloodType);
            }

            @Override
            public void reborn() {
                System.out.println("Inevitable!");
            }
        };

        Human [] humans = {
                new Assasin(),
                new User("Male", 54),
                new MacUser("Femake",12),
        };
        for (int i = 0; i < humans.length; i++) {
            humans[i].live();
        }
        gibrid3.taste("Sdsf");
    }
}
