package task_2.flowers;

public class Rose extends Flower {
    private double spikesLength;


    @Override
    public boolean isInStemRange(double lowerBorder, double upperBorder) {
        boolean isInRange = false;
        if (Double.compare(stemLength, lowerBorder) > 0 &&
                Double.compare(stemLength, upperBorder) < 0) {
            isInRange = true;
        }
        return isInRange;
    }
}
