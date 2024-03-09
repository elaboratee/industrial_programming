package task_2.flowers.meadow;

import task_2.flowers.Flower;

import java.util.Objects;

public class MeadowFlower extends Flower {
    private boolean isFrostResistant;

    public MeadowFlower() {
        isFrostResistant = true;
    }

    public void setFreshness(int freshness) {
        if (freshness >= 0) {
            this.freshness = freshness;
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof MeadowFlower that)) return false;
        if (!super.equals(object)) return false;
        return isFrostResistant == that.isFrostResistant;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isFrostResistant);
    }

    @Override
    public String toString() {
        return "MeadowFlower{" +
                "isFrostResistant=" + isFrostResistant +
                ", color='" + color + '\'' +
                ", freshness=" + freshness +
                ", stemLength=" + stemLength +
                ", price=" + price +
                '}';
    }
}
