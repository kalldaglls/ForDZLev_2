package DZLes1;

public class NewMain {
    public static void main(String[] args) {
        Moving [] movings = {
                new Cat("Mursik"),
                new Human("Anton"),
                new Cat("Krisya"),
                new Human("George")
        };

        Obstacle [] obstacles = {
                new RuningTrack(100),
                new WallObstacle(5),
                new RuningTrack(200)
        };

        for (int i = 0; i < obstacles.length; i++) {
            for (int j = 0; j < movings.length; j++) {
                obstacles[i].fullFill(movings[j]);
            }
        }
    }
}
