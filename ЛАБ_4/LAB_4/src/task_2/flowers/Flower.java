package task_2.flowers;

public abstract class Flower {
    protected String color;
    protected int freshness;
    protected double stemLength;

    public boolean isInStemRange(double lowerBorder, double upperBorder) {
        boolean isInRange = false;
        if (Double.compare(stemLength, lowerBorder) > 0 &&
                Double.compare(stemLength, upperBorder) < 0) {
            isInRange = true;
        }
        return isInRange;
    }

    public abstract boolean equals();

    public abstract int hashCode();

    public abstract String toString();
}
