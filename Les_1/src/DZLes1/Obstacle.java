package DZLes1;

import java.util.Objects;

public abstract class Obstacle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void fullFill(Moving moving);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obstacle obstacle = (Obstacle) o;
        return Objects.equals(name, obstacle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
