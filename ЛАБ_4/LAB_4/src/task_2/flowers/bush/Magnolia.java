package task_2.flowers.bush;

import java.util.Objects;

public final class Magnolia extends BushFlower {
    private boolean hasEdging;
    private String edgingColor;

    public Magnolia() {
        super();
        color = "pink";
        freshness = 0;
        stemLength = 10;
        price = 300;
        hasEdging = true;
        edgingColor = "white";
    }

    public Magnolia(int freshness) {
        this();
        this.freshness = freshness;
    }

    public Magnolia(String color) {
        super();
        this.color = color.toLowerCase();
        freshness = 0;
        stemLength = 10;
        price = 300;
        hasEdging = true;
        edgingColor = "white";
    }

    public Magnolia(boolean hasEdging, String edgingColor) {
        super();
        color = "pink";
        freshness = 0;
        stemLength = 10;
        price = 300;
        this.hasEdging = hasEdging;
        this.edgingColor = edgingColor.toLowerCase();
    }

    public boolean hasEdging() {
        return hasEdging;
    }

    public String getEdgingColor() {
        return edgingColor;
    }

    public void setEdgingColor(String edgingColor) {
        if (hasEdging) {
            this.edgingColor = edgingColor;
        }
    }

    public void setFreshness(int freshness) {
        if (freshness >= 0) {
            this.freshness = freshness;
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Magnolia magnolia)) return false;
        if (!super.equals(object)) return false;
        return hasEdging == magnolia.hasEdging &&
                Objects.equals(getEdgingColor(), magnolia.getEdgingColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hasEdging, getEdgingColor());
    }

    @Override
    public String toString() {
        return "Magnolia{" +
                "hasEdging=" + hasEdging +
                ", edgingColor='" + edgingColor + '\'' +
                ", hasFetus=" + hasFetus +
                ", isFrostResistance=" + isFrostResistance +
                ", color='" + color + '\'' +
                ", freshness=" + freshness +
                ", stemLength=" + stemLength +
                ", price=" + price +
                '}';
    }
}
