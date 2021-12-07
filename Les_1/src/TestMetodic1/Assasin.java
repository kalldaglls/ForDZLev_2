package TestMetodic1;

public class Assasin extends Human implements Gibrid, Kiborg{
    @Override
    public void taste(String bloodType) {

    }

    @Override
    public void reborn() {

    }


    @Override
    public void kill(Integer account) {

    }

    @Override
    public void breathe() {
        super.breathe();
        System.out.println("BEBEBE");
    }
}
