public class Student {
    String name;
    int stuNo;
    int classes;
    Course math, physic, chemistry;
    int average;

    public Student(String name, int classes, int stuNo, Course math, Course physic, Course chemistry){
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;

    }

    public void BulkExamNote(int math, int physic, int chemistry){
        this.math.note = math;
        this.physic.note = physic;
        this.chemistry.note = chemistry;
    }

    public int calcAverage(){
        return (this.math.note + this.physic.note + this.chemistry.note) / 3;
    }

    public void printNote(){
        System.out.println("Student " + this.name);
        System.out.println("Math " + this.math.note);
        System.out.println("Physic " + this.physic.note);
        System.out.println("Chemistry " + this.chemistry.note);
    }

    public String isPass(){
        average = calcAverage();
        if (average>=55) return "Pass";
        else return "Fail";
    }
}
