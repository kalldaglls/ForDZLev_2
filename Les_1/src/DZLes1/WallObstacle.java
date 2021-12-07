package DZLes1;

public class WallObstacle extends Obstacle{
    private int height;

    public WallObstacle(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void fullFill(Moving moving) {
        moving.jump(this.getHeight());
    }
}
