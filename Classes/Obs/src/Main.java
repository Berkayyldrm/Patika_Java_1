public class Main {
    public static void main(String[] args) {

        Course math = new Course("Math", "Math101", "MATH");
        Course physic = new Course("Physic", "phy101", "PHY");
        Course chemistry = new Course("Chemistry", "Chem101", "CHEM");

        Teacher t1 = new Teacher("John", "8990", "MATH");
        Teacher t2 = new Teacher("Alice", "12ee3", "PHY");
        Teacher t3 = new Teacher("George", "19955", "CHEM");

        math.addTeacher(t1);
        physic.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("Kevin", 4, 4444, math, physic, chemistry);
        s1.BulkExamNote(50,100,40);
        String passOrFail = s1.isPass();
        System.out.println(passOrFail);
        s1.printNote();
        System.out.println("Teachers of lessons:");
        math.printTeacher();
        physic.printTeacher();
        chemistry.printTeacher();
    }
}