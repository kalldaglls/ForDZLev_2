package DZLes1;

public class RuningTrack extends Obstacle{
    private int length;

    public RuningTrack(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void fullFill(Moving moving) {
        moving.run(this.getLength());
    }
}
