package task_2.flowers.dried;

import java.util.Objects;

public final class Gypsophila extends DriedFlower {
    private boolean isTerry;

    //Constructors
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

    //Getters
    public boolean isTerry() {
        return isTerry;
    }

    //Methods
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Gypsophila that)) return false;
        if (!super.equals(object)) return false;
        return isTerry() == that.isTerry();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isTerry());
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
