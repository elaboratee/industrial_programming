package task_1;

import java.util.ArrayList;

/**
 * Class that provides methods to parse arrays of Student instances
 * @author Ilya Sokol
 */
class StudentArray {
    private final ArrayList<Student> objectArray = new ArrayList<>();

    // Methods

    /**
     * Adds given student instance to the StudentArray
     * @param student given Student instance
     */
    public void addStudent(Student student) {
        objectArray.add(student);
    }

    public ArrayList<Student> getArray() {
        return objectArray;
    }

    /**
     * Selects from the StudentArray only those instances
     * that belong to a specific faculty
     * @param faculty required faculty
     * @return string of parsed instances data
     */
    public String parseFaculty(String faculty) {
        StringBuilder parsedResult = new StringBuilder();
        for (Student student : objectArray) {
            if (student.getFaculty().equalsIgnoreCase(faculty)) {
                parsedResult.append(student.toString()).append('\n');
            }
        }
        return parsedResult.toString();
    }

    /**
     * Selects from the StudentArray only those instances
     * that belong to a specific faculty and grade
     * @param faculty required faculty
     * @param grade required grade
     * @return string of parsed instances data
     */
    public String parseFacultyAndGrade(String faculty, byte grade) {
        StringBuilder parsedResult = new StringBuilder();
        for (Student student : objectArray) {
            if (student.getFaculty().equalsIgnoreCase(faculty) && student.getGrade() == grade) {
                parsedResult.append(student.toString()).append('\n');
            }
        }
        return parsedResult.toString();
    }

    /**
     * Selects from the StudentArray only those instances
     * that have birthDate field greater than the specified
     * @param year required birthdate year
     * @return string of parsed instances data
     */
    public String parseGreaterBirthDate(int year) {
        StringBuilder parsedResult = new StringBuilder();
        String parsedStringYear;
        for (Student student : objectArray) {
            parsedStringYear = String.valueOf(student.getBirthDate()).substring(6, 10);
            if (Integer.parseInt(parsedStringYear) > year) {
                parsedResult.append(student.toString()).append("\n");
            }
        }
        return parsedResult.toString();
    }

    /**
     * Selects from the StudentArray only those instances
     * that belong to a specific group
     * @param group required group
     * @return string of parsed instances data
     */
    public String parseGroup(String group) {
        StringBuilder parsedResult = new StringBuilder();
        for (Student student : objectArray) {
            if (student.getGroup().equalsIgnoreCase(group)) {
                parsedResult.append(student.toString()).append('\n');
            }
        }
        return parsedResult.toString();
    }
}
