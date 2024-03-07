package task_2.flowers.dried;

import java.util.Objects;

public final class Gypsophila extends DriedFlower {
    private boolean isTerry;

    public Gypsophila() {
        super();
        color = "white";
        stemLength = 50;
        price = 250;
    }

    public Gypsophila(String color, boolean isTerry) {
        super();
        this.color = color.toLowerCase();
        stemLength = 50;
        price = 250;
        this.isTerry = isTerry;
    }

    public boolean getTerry() {
        return isTerry;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Gypsophila that)) return false;
        if (!super.equals(object)) return false;
        return getTerry() == that.getTerry();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTerry());
    }

    @Override
    public String toString() {
        return "Gypsophila{" +
                "isTerry=" + isTerry +
                ", color='" + color + '\'' +
                ", freshness=" + freshness +
                ", stemLength=" + stemLength +
                ", price=" + price +
                '}';
    }
}
