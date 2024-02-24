package task_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program that searches for the shortest and longest numbers in a sequence
 *
 * @see DevInfo
 * @see NumericSequence
 * @author Dmitry Moskvitin
 */
public class TaskMain {
    /**
     * Program entry point
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int n = console.nextInt();
        NumericSequence sequence = new NumericSequence(n);

        for (int i = 0; i < n; i++) {
            System.out.printf("Введите %d-е число: ", i + 1);
            sequence.setElement(console.nextInt(), i);
        }
        console.close();

        int[][] result = sequence.findShortestAndLongest();

        System.out.printf("\nСамое короткое число = %d\t\tЕго длина = %d\n", result[0][0], result[0][1]);
        System.out.printf("Самое длинное число = %d\t\tЕго длина = %d\n", result[1][0], result[1][1]);

        getDevInfo();
    }

    static void getDevInfo() {
        DevInfo info = new DevInfo();
        System.out.printf("\nРазработчик: %s\n", info.getName());
        System.out.printf("Дата и время получения работы: %s\n", info.getStartDateTime());
        System.out.printf("Дата и время сдачи работы: %s\n", info.getEndDateTime());
    }
}
