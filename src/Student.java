public class Student {
    private String firstName;
    private String lastName;
    private String studentId;
    private  String password;


    public Student(String firstName, String lastName, String studentId, String password) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setStudentId(studentId);
        this.setPassword(password);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
