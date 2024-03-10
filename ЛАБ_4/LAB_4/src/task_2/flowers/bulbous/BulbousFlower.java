package task_2.flowers.bulbous;

import task_2.flowers.Flower;
import java.util.Objects;

public class BulbousFlower extends Flower {
    protected boolean isFrostResistant;

    // constructors
    public BulbousFlower() {
        isFrostResistant = true;
    }

    // setters
    public void setFreshness(int freshness) {
        if (freshness >= 0) {
            this.freshness = freshness;
        }
    }

    // methods
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof BulbousFlower that)) return false;
        if (!super.equals(object)) return false;
        return isFrostResistant == that.isFrostResistant;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isFrostResistant);
    }

    @Override
    public String toString() {
        return "BulbousFlower{" +
                "isFrostResistant=" + isFrostResistant +
                ", color='" + color + '\'' +
                ", freshness=" + freshness +
                ", stemLength=" + stemLength +
                ", price=" + price +
                '}';
    }
}
