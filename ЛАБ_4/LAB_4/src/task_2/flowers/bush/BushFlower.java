package task_2.flowers.bush;

import task_2.flowers.Flower;
import java.util.Objects;

public class BushFlower extends Flower {
    protected boolean hasFetus;
    protected boolean isFrostResistance;

    public BushFlower() {
        hasFetus = false;
        isFrostResistance = false;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof BushFlower that)) return false;
        if (!super.equals(object)) return false;
        return hasFetus == that.hasFetus && isFrostResistance == that.isFrostResistance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hasFetus, isFrostResistance);
    }

    @Override
    public String toString() {
        return "BushFlower{" +
                "hasFetus=" + hasFetus +
                ", isFrostResistance=" + isFrostResistance +
                ", color='" + color + '\'' +
                ", freshness=" + freshness +
                ", stemLength=" + stemLength +
                ", price=" + price +
                '}';
    }
}
