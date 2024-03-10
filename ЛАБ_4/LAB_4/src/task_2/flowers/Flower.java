package task_2.flowers;

import java.util.Objects;

public abstract class Flower {
    protected String color;
    protected int freshness;
    protected double stemLength;
    protected int price;

    //Getters
    public String getColor() {
        return color;
    }

    public int getFreshness() {
        return freshness;
    }

    public double getStemLength() {
        return stemLength;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return this.getClass().getSimpleName();
    }

    //Methods

    /**
     * The method determines whether the length of the stem is within certain limits.
     * @param lowerBorder - the minimum of length.
     * @param upperBorder - the maximum of length.
     * @return true if length is in certain range
     *         false is not.
     */
    public boolean isInStemRange(double lowerBorder, double upperBorder) {
        boolean isInRange = false;
        if (Double.compare(stemLength, lowerBorder) > 0 &&
                Double.compare(stemLength, upperBorder) < 0) {
            isInRange = true;
        }
        return isInRange;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Flower flower)) return false;
        return freshness == flower.freshness &&
                Double.compare(stemLength, flower.stemLength) == 0 &&
                price == flower.price && Objects.equals(color, flower.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, freshness, stemLength, price);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "color='" + color + '\'' +
                ", freshness=" + freshness +
                ", stemLength=" + stemLength +
                ", price=" + price +
                '}';
    }
}
