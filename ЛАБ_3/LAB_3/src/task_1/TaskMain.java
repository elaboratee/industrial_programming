package task_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program that stores and parses students information
 *
 * @author Ilya Sokol
 * @see Student
 * @see Validator
 * @see ParseStudents
 */
class TaskMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введите количество добавляемых студентов: ");
        int n = console.nextInt();

        ArrayList<Student> students = new ArrayList<>();

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

            students.add(student);
        }

        // Console output of the StudentArray
        System.out.println("\nСписок описанных студентов:");
        printStudentArray(students);

        getMenu(students);
        console.close();
    }

    private static void getMenu(ArrayList<Student> students) {
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
                printStudentArray(ParseStudents.parseFaculty(students, console.next()));
                break;
            case 2:
                System.out.print("\nВведите название факультета (аббревиатуру): ");
                stringParam = console.next();
                System.out.print("\nВведите номер курса: ");
                byteParam = console.nextByte();
                printStudentArray(ParseStudents.parseFacultyAndGrade(students, stringParam, byteParam));
                break;
            case 3:
                System.out.print("\nВведите год: ");
                printStudentArray(ParseStudents.parseGreaterBirthDate(students, console.nextInt()));
                break;
            case 4:
                System.out.print("Введите номер учебной группы: ");
                printStudentArray(ParseStudents.parseGroup(students, console.next()));
                break;
            default:
                System.out.println("Выбран несуществующий пункт меню!");
        }
        console.close();
    }

    private static void printStudentArray(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
