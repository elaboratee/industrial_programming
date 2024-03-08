package task_2.flowers.bush;

import java.util.Objects;

public final class Rose extends BushFlower {
    private boolean hasSpikes;

    public Rose() {
        super();
        color = "pink";
        freshness = 0;
        stemLength = 10;
        price = 300;
        hasSpikes = true;
    }

    public Rose(int freshness) {
        this();
        this.freshness = freshness;
    }

    public Rose(String color) {
        super();
        this.color = color.toLowerCase();
        freshness = 0;
        stemLength = 10;
        price = 300;
        hasSpikes = true;
    }

    public Rose(String color, boolean hasSpikes) {
        super();
        this.color = color.toLowerCase();
        freshness = 0;
        stemLength = 10;
        price = 300;
        this.hasSpikes = hasSpikes;
    }

    public boolean hasSpikes() {
        return hasSpikes;
    }

    public void setFreshness(int freshness) {
        if (freshness >= 0) {
            this.freshness = freshness;
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Rose rose)) return false;
        if (!super.equals(object)) return false;
        return hasSpikes == rose.hasSpikes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hasSpikes);
    }

    @Override
    public String toString() {
        return "Rose{" +
                "hasSpikes=" + hasSpikes +
                ", hasFetus=" + hasFetus +
                ", isFrostResistance=" + isFrostResistant +
                ", color='" + color + '\'' +
                ", freshness=" + freshness +
                ", stemLength=" + stemLength +
                ", price=" + price +
                '}';
    }
}
