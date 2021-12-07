package DZLes1;

public class Human extends Moving{
    private String name;


    public Human(String name) {
        this.name = name;
    }

    @Override
    public void run(int length) {
        System.out.println(this.name + " is running" + " " + length + " meters");
    }

    @Override
    public void jump(int height) {
        System.out.println(this.name + " is jumping" + " " + height + " meters");
    }

    @Override
    public void checkInstance(Obstacle obstacle) {

    }
}
