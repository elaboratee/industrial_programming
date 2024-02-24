package task_1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Main class in the package
 * @see Student
 * @see Validator
 * @see StudentArray
 * @author Ilya Sokol
 */
class TaskMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введите количество добавляемых студентов: ");
        int n = console.nextInt();

        StudentArray studentArray = new StudentArray();

        // Filling the array with Student instances
        for (int i = 0; i < n; i++) {
            Student student = new Student();

            System.out.printf("\nОпишите %d-го студента\n", i + 1);
            student.setID();

            System.out.print("Фамилия: ");
            student.setSecondName(console.next());

            System.out.print("Имя: ");
            student.setFirstName(console.next());

            System.out.print("Отчество: ");
            student.setSurname(console.next());

            System.out.print("Дата рождения: ");
            student.setBirthDate(console.next());

            System.out.print("Адрес (город проживания): ");
            student.setAddress(console.next());

            System.out.print("Номер телефона (в формате с +): ");
            student.setPhoneNumber(console.next());

            System.out.print("Факультет: ");
            student.setFaculty(console.next());

            System.out.print("Курс: ");
            student.setGrade(console.nextByte());

            System.out.print("Группа: ");
            student.setGroup(console.next());

            studentArray.addStudent(student);
        }

        // Console output of the StudentArray
        System.out.println("\nСписок описанных студентов:");
        for (Student element : studentArray.getArray()) {
            System.out.println(element.toString());
        }

        getMenu(studentArray);
    }

    private static void getMenu(StudentArray studentArray) {
        Scanner console = new Scanner(System.in);
        System.out.println("""
                \nЧТО НУЖНО ВЫВЕСТИ?
                1. Список студентов заданного факультета
                2. Список студентов заданного факультета и курса
                3. Список студентов, родившихся после заданного года
                4. Список учебной группы\s""");
        System.out.print("\nВыбор: ");
        int menu = console.nextInt();

        String stringParam;
        byte byteParam;

        switch (menu) {
            case 1:
                System.out.print("\nВведите название факультета (аббревиатуру): ");
                System.out.println(studentArray.parseFaculty(console.next()));
                break;
            case 2:
                System.out.print("\nВведите название факультета (аббревиатуру): ");
                stringParam = console.next();
                System.out.print("\nВведите номер курса: ");
                byteParam = console.nextByte();
                System.out.println(studentArray.parseFacultyAndGrade(stringParam, byteParam));
                break;
            case 3:
                System.out.print("\nВведите год: ");
                System.out.println(studentArray.parseGreaterBirthDate(console.nextInt()));
                break;
            case 4:
                System.out.print("Введите номер учебной группы: ");
                System.out.println(studentArray.parseGroup(console.next()));
                break;
            default:
                System.out.println("Выбран несуществующий пункт меню!");
        }
    }
}
