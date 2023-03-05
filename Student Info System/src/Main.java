import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Havva", "12345", "TRH");
        Teacher teacher1 = new Teacher("Ali","123456","FZK");
        Teacher teacher2 = new Teacher("Ahmet","3456","MTM");

        Course course1 = new Course("Tarih", "101","TRH",0.2);
        course1.addTeacher(teacher);

        Course course2 = new Course("Fizik", "102","FZK",0.3);
        course2.addTeacher(teacher1);

        Course course3 = new Course("Matermatik", "103","MTM",0.4);
        course3.addTeacher(teacher2);

        Student student = new Student("Fatma","124","4",course1,course2,course3);
        student.addBulkExamNote(100,100,80,90,50,60);
        student.isPass();



    }
}