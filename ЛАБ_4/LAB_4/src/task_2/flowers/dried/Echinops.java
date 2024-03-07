package task_2.flowers.dried;

import java.util.Objects;

public final class Echinops extends DriedFlower {
    private boolean isTerry;
    private boolean isBarbed;

    public Echinops() {
        super();
        color = "blue";
        stemLength = 60;
        price = 370;
    }

    public Echinops(boolean isTerry) {
        this();
        this.isTerry = isTerry;
    }

    public Echinops(boolean isTerry, boolean isBarbed) {
        this(isTerry);
        this.isBarbed = isBarbed;
    }

    public boolean isTerry() {
        return isTerry;
    }

    public boolean isBarbed() {
        return isBarbed;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Echinops echinops)) return false;
        if (!super.equals(object)) return false;
        return isTerry() == echinops.isTerry() && isBarbed() == echinops.isBarbed();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isTerry(), isBarbed());
    }

    @Override
    public String toString() {
        return "Echinops{" +
                "isTerry=" + isTerry +
                ", isBarbed=" + isBarbed +
                ", color='" + color + '\'' +
                ", freshness=" + freshness +
                ", stemLength=" + stemLength +
                ", price=" + price +
                '}';
    }
}
