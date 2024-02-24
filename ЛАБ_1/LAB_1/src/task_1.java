import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя разработчика: ");
        String name = in.nextLine().strip();

        System.out.print("Введите дату и время получения задания: ");
        String dateTimeStart = in.nextLine().strip();

        System.out.print("Введите дату и время сдачи задания: ");
        String dateTimeEnd = in.nextLine().strip();

        if (name.isBlank()) {
            System.out.println("\nИмя разработчика: Гость");
        } else {
            System.out.printf("\nИмя разработчика: %s\n", name);
        }

        if (isValidDateTime(dateTimeStart) && isValidDateTime(dateTimeEnd)) {
            System.out.printf("Дата и время получения задания: %s\n" +
                    "Дата и время сдачи задания: %s", dateTimeStart, dateTimeEnd);
        }
        else {
            System.out.println("Неверно введена дата и время.");
        }

        in.close();
    }

    public static boolean isValidDateTime(String dateTime) {
        String format = "dd.MM.yyyy HH:mm";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
        try {
            dtf.parse(dateTime);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}

