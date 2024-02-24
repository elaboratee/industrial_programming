package task_3;

import task_2.RationalFraction;

import java.util.ArrayList;

/**
 * Class that provides methods to work with polynomial
 * with rational fractions coefficients
 * @author Ilya Sokol
 */
class Polynomial {
    private ArrayList<RationalFraction> coefficients;

    public Polynomial() {
        super();
    }

    public Polynomial(ArrayList<RationalFraction> coefficients) {
        this.coefficients = coefficients;
    }

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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (RationalFraction coeff : coefficients) {
            sb.append(coeff).append(" ");
        }
        return sb.toString();
    }
}
