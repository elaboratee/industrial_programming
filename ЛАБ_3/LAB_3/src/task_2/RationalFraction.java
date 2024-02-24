package task_2;

/**
 * Class that provides methods to operate with rational fractions
 * @author Ilya Sokol
 */
public class RationalFraction {
    private int numerator;
    private int denominator;

    // Constructors
    public RationalFraction() {
        super();
    }

    public RationalFraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Getters and setters
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public double getNumerator() {
        return this.numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double getDenominator() {
        return denominator;
    }

    // Methods
    public RationalFraction add(RationalFraction other) {
        int newNumerator = this.numerator * other.denominator
                + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalFraction(newNumerator, newDenominator);
    }

    public RationalFraction subtract(RationalFraction other) {
        int newNumerator = this.numerator * other.denominator
                - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalFraction(newNumerator, newDenominator);
    }

    public RationalFraction multiply(RationalFraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalFraction(newNumerator, newDenominator);
    }

    public RationalFraction divide(RationalFraction other) {
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new RationalFraction(newNumerator, newDenominator);
    }

    public boolean isProper() {
        return numerator < denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}
