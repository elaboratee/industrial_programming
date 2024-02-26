package task_2;

import java.util.Scanner;

/**
 * Program that processes an array of rational fractions
 * @see RationalFraction
 * @see FractionArray
 * @author Ilya Sokol
 */
class TaskMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введите количество рациональных дробей: ");
        int k = console.nextInt();

        int numerator, denominator;
        FractionArray fractionArray = new FractionArray();

        for (int i = 0; i < k; i++) {
            System.out.printf("\nВведите числитель %d-ой дроби: ", i + 1);
            numerator = console.nextInt();

            System.out.printf("Введите знаменатель %d-ой дроби: ", i + 1);
            denominator = console.nextInt();

            fractionArray.addFraction(new RationalFraction(numerator, denominator));
        }

        System.out.println("\nВведенные рациональные дроби:");
        printFractionArray(fractionArray);

        fractionArray.modifyEvenIndexes();

        System.out.println("\nМодифицированные рациональные дроби:");
        printFractionArray(fractionArray);
    }

    private static void printFractionArray(FractionArray fractionArray) {
        for (RationalFraction fraction : fractionArray.getArray()) {
            System.out.printf("%s\n", fraction.toString());
        }
    }
}
