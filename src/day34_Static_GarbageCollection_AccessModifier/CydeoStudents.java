package day34_Static_GarbageCollection_AccessModifier;

public class CydeoStudents {
    public String studentName;
    public static String schoolName;

    public CydeoStudents(String studentName){
        this.studentName=studentName;
        schoolName = "Cydeo School";
    }
static {
        schoolName="Cydeo School";

}
}
class CydeoStudentObject{
    public static void main(String[] args) {
        CydeoStudents student1 = new CydeoStudents("Jimy");
        CydeoStudents student2 = new CydeoStudents("Kathy");

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);
    }
}
