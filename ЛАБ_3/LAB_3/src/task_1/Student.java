package task_1;

/**
 * Class that contains information about Student instances
 * @author Ilya Sokol
 */
class Student {
    private short id;
    private String secondName;
    private String firstName;
    private String surname;
    private String birthDate;
    private String address;
    private String phoneNumber;
    private String faculty;
    private byte grade;
    private String group;

    // Last assigned ID value, increments every time it is set to an object.
    static short lastID = 0;

    // Constructors
    public Student() {
        super();
    }

    public Student(String secondName, String firstName, String surname) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.surname = surname;
    }

    public Student(String secondName, String group) {
        this.secondName = secondName;
        this.group = group;
    }

    // Getters and setters
    public void setID() {
        id = ++lastID;
    }

    public short getID() {
        return id;
    }

    public void setSecondName(String secondName) throws IllegalArgumentException {
        if (!secondName.isBlank()) {
            this.secondName = secondName;
        } else {
            throw new IllegalArgumentException("Blank string is given in second name");
        }
    }

    public String getSecondName() {
        return secondName;
    }

    public void setFirstName(String firstName) throws IllegalArgumentException {
        if (!firstName.isBlank()) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("Blank string is given in first name");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setSurname(String surname) throws IllegalArgumentException {
        if (!surname.isBlank()) {
            this.surname = surname;
        } else {
            throw new IllegalArgumentException("Blank string is given in surname");
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setBirthDate(String birthDate) throws IllegalArgumentException {
        if (Validator.isValidDate(birthDate)) {
            this.birthDate = birthDate;
        } else {
            throw new IllegalArgumentException("Invalid birth date is given");
        }
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setAddress(String address) throws IllegalArgumentException {
        if (!address.isBlank()) {
            this.address = address;
        } else {
            throw new IllegalArgumentException("Blank string is given in address");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(String phoneNumber) throws IllegalArgumentException {
        if (Validator.isValidPhoneNumber(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new IllegalArgumentException("Invalid phone number is given");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFaculty(String faculty) throws IllegalArgumentException {
        if (!faculty.isBlank()) {
            this.faculty = faculty;
        } else {
            throw new IllegalArgumentException("Blank string is given in faculty");
        }
    }

    public String getFaculty() {
        return faculty;
    }

    public void setGrade(byte grade) {
        if (grade > 0) {
            this.grade = grade;
        }
    }

    public byte getGrade() {
        return grade;
    }

    public void setGroup(String group) throws IllegalArgumentException {
        if (!group.isBlank()) {
            this.group = group;
        } else {
            throw new IllegalArgumentException("Blank string is given in group");
        }
    }

    public String getGroup() {
        return group;
    }

    // Methods

    /**
     * Converts class fields to a string
     * @return string of a student instance fields
     */
    public String toString() {

        return this.id + " " +
                this.secondName + " " +
                this.firstName + " " +
                this.surname + " " +
                this.birthDate + " " +
                this.address + " " +
                this.phoneNumber + " " +
                this.faculty + " " +
                this.grade + " " +
                this.group;
    }
}
