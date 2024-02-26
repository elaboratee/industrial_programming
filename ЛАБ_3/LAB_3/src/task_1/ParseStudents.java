package task_1;

import java.util.ArrayList;

/**
 * Class that provides methods to parse arrays of Student instances
 * @author Ilya Sokol
 */
class ParseStudents {
    // Methods
    /**
     * Selects from the StudentArray only those instances
     * that belong to a specific faculty
     *
     * @param faculty required faculty
     * @return ArrayList of parsed instances data
     */
    public static ArrayList<Student> parseFaculty(ArrayList<Student> students, String faculty) {
        ArrayList<Student> parsedStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getFaculty().equalsIgnoreCase(faculty)) {
                parsedStudents.add(student);
            }
        }
        return parsedStudents;
    }

    /**
     * Selects from the StudentArray only those instances
     * that belong to a specific faculty and grade
     *
     * @param faculty required faculty
     * @param grade   required grade
     * @return ArrayList of parsed instances data
     */
    public static ArrayList<Student> parseFacultyAndGrade(ArrayList<Student> students, String faculty, byte grade) {
        ArrayList<Student> parsedStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getFaculty().equalsIgnoreCase(faculty) && student.getGrade() == grade) {
                parsedStudents.add(student);
            }
        }
        return parsedStudents;
    }

    /**
     * Selects from the StudentArray only those instances
     * that have birthDate field greater than the specified
     *
     * @param year required birthdate year
     * @return ArrayList of parsed instances data
     */
    public static ArrayList<Student> parseGreaterBirthDate(ArrayList<Student> students, int year) {
        ArrayList<Student> parsedStudents = new ArrayList<>();
        String parsedStringYear;
        for (Student student : students) {
            parsedStringYear = String.valueOf(student.getBirthDate()).substring(6, 10);
            if (Integer.parseInt(parsedStringYear) > year) {
                parsedStudents.add(student);
            }
        }
        return parsedStudents;
    }

    /**
     * Selects from the StudentArray only those instances
     * that belong to a specific group
     *
     * @param group required group
     * @return ArrayList of parsed instances data
     */
    public static ArrayList<Student> parseGroup(ArrayList<Student> students, String group) {
        ArrayList<Student> parsedStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getGroup().equalsIgnoreCase(group)) {
                parsedStudents.add(student);
            }
        }
        return parsedStudents;
    }
}
