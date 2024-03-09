package task_2.flowers.bulbous;

import java.util.Objects;

public final class Narcissus extends BulbousFlower {
    private String secondColor;

    public Narcissus() {
        super();
        color = "yellow";
        secondColor = "yellow";
        freshness = 0;
        stemLength = 40;
        price = 800;
    }

    public Narcissus(String color, String secondColor) {
        super();
        this.color = color;
        this.secondColor = secondColor.toLowerCase();
        freshness = 0;
        stemLength = 40;
        price = 800;
    }

    public String getSecondColor() {
        return secondColor;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Narcissus narcissus)) return false;
        if (!super.equals(object)) return false;
        return Objects.equals(getSecondColor(), narcissus.getSecondColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSecondColor());
    }

    @Override
    public String toString() {
        return "Narcissus{" +
                "secondColor='" + secondColor + '\'' +
                ", color='" + color + '\'' +
                ", freshness=" + freshness +
                ", stemLength=" + stemLength +
                ", price=" + price +
                '}';
    }
}
