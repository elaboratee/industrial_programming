import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = in.nextInt();

        StringBuilder evenNumbers = new StringBuilder("Четные числа: ");
        StringBuilder oddNumbers = new StringBuilder("Нечетные числа: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("Введите %d-е число: ", i + 1);
            int number = in.nextInt();

            if ((number % 2) == 0) {
                evenNumbers.append(number).append(" ");
            } else {
                oddNumbers.append(number).append(" ");
            }
        }

        if (n <= 0) {
            System.out.println("Введенное количество равно нулю либо отрицательно!");
        } else {
            System.out.println(evenNumbers);
            System.out.println(oddNumbers);
        }

        in.close();
    }
}
