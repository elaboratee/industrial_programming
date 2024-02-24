package task_1;

import java.util.ArrayList;

/**
 * Class that provides methods to parse arrays of Student instances
 * @author Ilya Sokol
 */
class StudentArray {
    private final ArrayList<Student> objectArray = new ArrayList<>();

    public void addStudent(Student student) {
        objectArray.add(student);
    }

    public ArrayList<Student> getArray() {
        return objectArray;
    }

    public String parseFaculty(String faculty) {
        StringBuilder parsedResult = new StringBuilder();
        for (Student student : objectArray) {
            if (student.getFaculty().equalsIgnoreCase(faculty)) {
                parsedResult.append(student.toString()).append('\n');
            }
        }
        return parsedResult.toString();
    }

    public String parseFacultyAndGrade(String faculty, byte grade) {
        StringBuilder parsedResult = new StringBuilder();
        for (Student student : objectArray) {
            if (student.getFaculty().equalsIgnoreCase(faculty) && student.getGrade() == grade) {
                parsedResult.append(student.toString()).append('\n');
            }
        }
        return parsedResult.toString();
    }


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
