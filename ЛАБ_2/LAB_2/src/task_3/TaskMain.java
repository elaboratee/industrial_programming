package task_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введите размер матрицы: ");
        int n = console.nextInt();

        int[][] matrix = new int[n][n];
        fillMatrix(matrix, n);
        System.out.printf("Исходная матрица: %s\n", Arrays.deepToString(matrix));

        getMenu(matrix);
    }

    /**
     * Fills matrix with random integers from -a to a
     *
     * @param matrix given matrix of zeroes
     * @param a      a random function radius
     */
    static void fillMatrix(int[][] matrix, int a) {
        Random rand = new Random();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                matrix[i][j] = rand.nextInt(-a, a + 1);
            }
        }
    }

    /**
     * Sorts rows of a given matrix by key column elements in ascending order
     *
     * @param matrix matrix of integers
     * @param k      key column index
     */
    static void sortByColumn(int[][] matrix, int k) {
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][k] < matrix[i - 1][k]) {
                int[] buffer = matrix[i];
                matrix[i] = matrix[i - 1];
                matrix[i - 1] = buffer;
                if (i != 1) {
                    i -= 2;
                }
            }
        }
    }

    /**
     * Sorts columns of a given matrix by key row elements in ascending order
     *
     * @param matrix matrix og integers
     * @param k      key row index
     */
    static void sortByRow(int[][] matrix, int k) {
        transpose(matrix);
        sortByColumn(matrix, k);
        transpose(matrix);
    }

    /**
     * Transposes given n by n matrix
     *
     * @param matrix matrix of integers
     */
    static void transpose(int[][] matrix) {
        int buffer;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                buffer = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = buffer;
            }
        }
    }

    static void getMenu(int[][] matrix) {
        Scanner console = new Scanner(System.in);

        System.out.print("""
                \nМЕТОДЫ СОРТИРОВКИ
                1. Сортировка по столбцу
                2. Сортировка по строке
                Выберите пункт меню:\s""");
        int menu = console.nextInt();

        switch (menu) {
            case 1:
                System.out.print("Введите номер ключевого столбца: ");
                int keyColumn = console.nextInt() - 1;

                try {
                    sortByColumn(matrix, keyColumn);
                    System.out.printf("\nОтсортированная матрица: %s", Arrays.deepToString(matrix));
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("\nВведен неверный номер столбца!");
                }
                break;

            case 2:
                System.out.print("Введите номер ключевой строки: ");
                int keyRow = console.nextInt() - 1;

                try {
                    sortByRow(matrix, keyRow);
                    System.out.printf("\nОтсортированная матрица: %s", Arrays.deepToString(matrix));
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("\nВведен неверный номер столбца!");
                }
                break;

            default:
                System.out.println("Выбран несуществующий пункт меню!");
                break;
        }
    }
}
