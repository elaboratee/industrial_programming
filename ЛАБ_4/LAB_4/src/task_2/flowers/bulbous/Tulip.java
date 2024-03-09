package task_2.flowers.bulbous;

import java.util.Objects;

public final class Tulip extends BulbousFlower {
    private String shape;

    public Tulip() {
        super();
        color = "red";
        freshness = 0;
        stemLength = 25;
        price = 180;
    }

    public Tulip(String color, String shape, int freshness) {
        super();
        this.color = color.toLowerCase();
        this.freshness = freshness;
        stemLength = 25;
        price = 180;
    }

    public String getShape() {
        return shape;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Tulip tulip)) return false;
        if (!super.equals(object)) return false;
        return Objects.equals(getShape(), tulip.getShape());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getShape());
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                ", freshness=" + freshness +
                ", stemLength=" + stemLength +
                ", price=" + price +
                '}';
    }
}
