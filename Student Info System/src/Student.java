public class Student {
    String name;
    String stuNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double average;
    boolean isPass;

    Student(String name,String stuNo, String classes, Course course1, Course course2, Course course3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.course1=course1;
        this.course2=course2;
        this.course3=course3;
        this.average=0.0;
        this.isPass=false;

    }
    void addBulkExamNote(int note1,int note11, int note2, int note22, int note3 ,int note33){
        if(note1>=0 && note1<=100){
            this.course1.note = note1;
        }
        if(note11>=0 && note11<=100){
            this.course1.verbalNote = note11;
        }
        if(note2>=0 && note2<=100) {
            this.course2.note = note2;
        }
        if(note22>=0 && note22<=100){
            this.course2.verbalNote = note22;
        }
        if(note3>=0 && note3<=100) {
            this.course3.note = note3;
        }
        if(note33>=0 && note33<=100){
            this.course3.verbalNote = note33;
        }

    }
    void calcNote(){
        this.course1.totalNote = course1.note*(1-course1.verbalNoteParameter) + (course1.verbalNote* course1.verbalNoteParameter);
        this.course2.totalNote  = course2.note*(1-course2.verbalNoteParameter) + (course2.verbalNote*course2.verbalNoteParameter);
        this.course3.totalNote = course3.note*(1-course3.verbalNoteParameter) +(course3.verbalNote*course3.verbalNoteParameter);
    }
    void isPass(){
        calcNote();
        this.average=(this.course1.totalNote+this.course2.totalNote+this.course3.totalNote)/3;
        if(this.average>55){
            System.out.println("Sınıfı Geçti");
        }else {
            System.out.println("Sınıfta Kaldınız");
        }
        printNote();

    }
    void printNote(){
        calcNote();
        System.out.println(course1.name + "Notu: \t"+course1.totalNote);
        System.out.println(course2.name + "Notu: \t"+course2.totalNote);
        System.out.println(course3.name + "Notu: \t"+course3.totalNote);
        System.out.println("Ortalamanız :" +this.average);

    }

}
