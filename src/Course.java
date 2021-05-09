public class Course {

    private String instructor;
    private String courseName;

    public Course(String instructor, String courseName) {
        this.setInstructor(instructor);
        this.setCourseName(courseName);
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
