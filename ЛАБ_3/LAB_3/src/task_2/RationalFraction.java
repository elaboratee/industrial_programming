package task_2;

/**
 * Class that provides methods to operate with <u>rational fractions</u>
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

    /**
     * Calculates the sum of two rational fractions
     * @param other rational fraction added to a given instance
     * @return rational fraction which is the sum of a <i>given instance</i>
     * and the <i>other</i>
     */
    public RationalFraction add(RationalFraction other) {
        int newNumerator = this.numerator * other.denominator
                + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalFraction(newNumerator, newDenominator);
    }

    /**
     * Calculates the difference of two rational fractions
     * @param other rational fraction subtracted from a given instance
     * @return rational fraction which is the difference of a <i>given instance</i>
     * and the <i>other</i>
     */
    public RationalFraction subtract(RationalFraction other) {
        int newNumerator = this.numerator * other.denominator
                - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalFraction(newNumerator, newDenominator);
    }

    /**
     * Calculates the product of two rational fractions
     * @param other rational fraction by which
     *              a given instance is divided
     * @return rational fraction which is the product of a <i>given instance</i>
     * and the <i>other</i>
     */
    public RationalFraction multiply(RationalFraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalFraction(newNumerator, newDenominator);
    }

    /**
     * Calculates the quotient of two rational fractions
     * @param other rational fraction subtracted from a given instance
     * @return rational fraction which is the quotient of a <i>given instance</i>
     * and the <i>other</i>
     */
    public RationalFraction divide(RationalFraction other) {
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new RationalFraction(newNumerator, newDenominator);
    }

    /**
     * Checks whether a rational fraction is proper
     * @return true if the numerator is less than the denominator,
     * false otherwise
     */
    public boolean isProper() {
        return numerator < denominator;
    }

    /**
     * Converts RationalFraction instance to a string
     * @return string that represents rational fraction in
     * a human-readable form
     */
    public String toString() {
        return numerator + "/" + denominator;
    }
}
