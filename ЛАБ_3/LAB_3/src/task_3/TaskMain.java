package task_3;

import task_2.RationalFraction;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program that calculates the sum of the given polynomials
 * @see Polynomial
 * @see task_2.RationalFraction
 * @author Ilya Sokol
 */
class TaskMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введите количество полиномов: ");
        int numPolynomials = console.nextInt();
        console.nextLine();

        ArrayList<Polynomial> polynomials = new ArrayList<>();

        for (int i = 0; i < numPolynomials; i++) {
            System.out.print("\nВведите количество коэффициентов " + (i + 1) + " полинома: ");
            int k = console.nextInt();

            System.out.print("\nВВЕДИТЕ КОЭФФИЦИЕНТЫ " + (i + 1) + " ПОЛИНОМА");

            ArrayList<RationalFraction> coefficients = new ArrayList<>();
            int numerator, denominator;

            for (int j = 0; j < k; j++) {
                System.out.printf("\nВведите числитель %d-ой дроби: ", j + 1);
                numerator = console.nextInt();

                System.out.printf("Введите знаменатель %d-ой дроби: ", j + 1);
                denominator = console.nextInt();

                coefficients.add(new RationalFraction(numerator, denominator));
            }
            polynomials.add(new Polynomial(coefficients));
        }

        Polynomial sum = new Polynomial(new ArrayList<>());
        for (Polynomial polynomial : polynomials) {
            sum = sum.addPolynomial(polynomial);
        }

        System.out.printf("\nСумма полиномов: %s", sum.toString());

         console.close();
    }
}
