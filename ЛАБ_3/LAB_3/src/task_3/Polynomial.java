package task_3;

import task_2.RationalFraction;

import java.util.ArrayList;

/**
 * Class that provides methods to work with polynomials
 * with <u>rational fraction</u> coefficients
 * @author Ilya Sokol
 */
class Polynomial {
    private ArrayList<RationalFraction> coefficients;

    // Constructors
    public Polynomial() {
        super();
    }

    public Polynomial(ArrayList<RationalFraction> coefficients) {
        this.coefficients = coefficients;
    }

    // Methods
    /**
     * Calculates <u>algebraic sum</u> of two polynomials
     * @param other polynomial added to a given instance
     * @return polynomial which is the algebraic sum of a <i>given instance</i>
     * and the <i>other</i>
     */
    public Polynomial addPolynomial(Polynomial other) {
        ArrayList<RationalFraction> resultCoefficients = new ArrayList<>();
        int maxSize = Math.max(this.coefficients.size(), other.coefficients.size());
        for (int i = 0; i < maxSize; i++) {
            RationalFraction coeff1 = i < this.coefficients.size() ? this.coefficients.get(i) :
                    new RationalFraction(0, 1);
            RationalFraction coeff2 = i < other.coefficients.size() ? other.coefficients.get(i) :
                    new RationalFraction(0, 1);
            resultCoefficients.add(coeff1.add(coeff2));
        }
        return new Polynomial(resultCoefficients);
    }

    /**
     * Converts ArrayList of <i>coefficients</i> to a string
     * @return coefficients string of a polynomial instance
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (RationalFraction coeff : coefficients) {
            sb.append(coeff).append(" ");
        }
        return sb.toString();
    }
}
