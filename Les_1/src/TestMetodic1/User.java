package TestMetodic1;

public class User extends Human implements Gibrid{
    private int id;
    private String name;
    private String position;
    private int age;

    public User(String gender, int age) {
        super(gender);
        this.age = age;
    }

    public User(int id, String name, String position, int age) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public void info() {
        System.out.println("id: " + id + "; Имя пользователя: " + name+ "; Должность: " + position + "; Возраст: " + age);
    }

    public void changePosition(String post) {
        System.out.println("Пользователь " + name + " c должностью " + position + " получил новую должность: " + post);
        position = post;
        System.out.println(this);
    }

    @Override
    public void breathe() {
        super.breathe();
        System.out.println("But " + this + " can also think!");
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                '}';
    }

    public void taste(String bloodType) {
        System.out.println(bloodType);
    }

    public void reborn() {

    }
}