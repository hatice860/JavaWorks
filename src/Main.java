public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student=new Student("Rümeysa","Yük", "19113513", "*****");
        StudentManager studentManager=new StudentManager();
        studentManager.add(student);

        Course course=new Course("Engin Demiroğ","JavaCamp");
        CourseManager courseManager=new CourseManager();
        courseManager.update(course);

        Category category=new Category("Eğitim", "123");
        CategoryManager categoryManager=new CategoryManager();
        categoryManager.delete(category);

    }
}
