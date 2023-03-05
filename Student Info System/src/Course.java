public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;
    double totalNote;
    double verbalNoteParameter;
    Teacher teacher;
    Course(String name, String code, String prefix, double verbalNoteParameter){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.verbalNoteParameter = verbalNoteParameter;
        this.totalNote=0.0;


    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
        }else {
            System.out.println("Öğretmen ve Ders Bölümleri Uyuşmuyor");
        }

    }
    void printTeacherInfo(){
        this.teacher.print();
    }
}
