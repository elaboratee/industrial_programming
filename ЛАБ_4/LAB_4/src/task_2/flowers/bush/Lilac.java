package task_2.flowers.bush;

import java.util.Objects;

public final class Lilac extends BushFlower {
    private boolean hasEdging;
    private String edgingColor;

    //Constructors
    public Lilac() {
        super();
        color = "lilac";
        freshness = 0;
        stemLength = 20;
        price = 450;
        hasEdging = true;
        edgingColor = "white";
    }

    public Lilac(int freshness) {
        this();
        this.freshness = freshness;
    }

    public Lilac(boolean hasEdging, String edgingColor) {
        super();
        color = "lilac";
        freshness = 0;
        stemLength = 20;
        price = 450;
        this.hasEdging = hasEdging;
        this.edgingColor = edgingColor.toLowerCase();
    }

    //Getters and setters
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

    public boolean hasEdging() {
        return hasEdging;
    }

    //Methods
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Lilac lilac)) return false;
        if (!super.equals(object)) return false;
        return hasEdging == lilac.hasEdging &&
                Objects.equals(getEdgingColor(), lilac.getEdgingColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hasEdging, getEdgingColor());
    }

    @Override
    public String toString() {
        return "Lilac{" +
                "hasEdging=" + hasEdging +
                ", edgingColor='" + edgingColor + '\'' +
                ", hasFetus=" + hasFetus +
                ", isFrostResistance=" + isFrostResistant +
                ", color='" + color + '\'' +
                ", freshness=" + freshness +
                ", stemLength=" + stemLength +
                ", price=" + price +
                '}';
    }
}
