public class Course {
    String name;
    String code;
    String prefix;
    int note;
    Teacher courseTeacher;

    public Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    public void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)){
            this.courseTeacher = t;
            System.out.println("Done");
        }else System.out.println(t.name + " Error");

    }

    public void printTeacher(){
        if (courseTeacher != null){
            System.out.println(this.name + " : " + courseTeacher.name);
        }else System.out.println(this.name + "There is no teacher for course");
    }

}
