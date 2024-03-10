package task_2.flowers.bush;

import task_2.flowers.Flower;
import java.util.Objects;

public class BushFlower extends Flower {
    protected boolean hasFetus;
    protected boolean isFrostResistant;

    //Constructors
    public BushFlower() {
        hasFetus = false;
        isFrostResistant = false;
    }

    //Setters
    public void setFreshness(int freshness) {
        if (freshness >= 0) {
            this.freshness = freshness;
        }
    }

    //Methods
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof BushFlower that)) return false;
        if (!super.equals(object)) return false;
        return hasFetus == that.hasFetus && isFrostResistant == that.isFrostResistant;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hasFetus, isFrostResistant);
    }

    @Override
    public String toString() {
        return "BushFlower{" +
                "hasFetus=" + hasFetus +
                ", isFrostResistance=" + isFrostResistant +
                ", color='" + color + '\'' +
                ", freshness=" + freshness +
                ", stemLength=" + stemLength +
                ", price=" + price +
                '}';
    }
}
