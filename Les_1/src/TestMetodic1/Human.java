package TestMetodic1;

public abstract class Human implements Animal{
    private String gender;

    public Human() {
    }

    @Override
    public void live() {
        System.out.println(this + " always lives!");
    }

    public Human(String gender) {
        this.gender = gender;
        System.out.println(this + " is strange " + gender);
    }

    public void breathe() {
        System.out.println(this + " is breathing!");
    }

    public void fight(String gender){
        System.out.println(gender + " fight");
    }
}
