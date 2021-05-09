public class StudentManager {
    public void add(Student student){
       System.out.println("öğrenci eklendi "+student.getFirstName());
    }

    public void delete(Student student){
        System.out.println("öğrenci silindi "+student.getFirstName());
    }

    public void update(Student student){
        System.out.println("öğrenci güncellendi "+student.getFirstName());
    }

}
