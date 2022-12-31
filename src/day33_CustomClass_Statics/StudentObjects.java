package day33_CustomClass_Statics;

import javax.swing.text.Style;
import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {
        Student student1=new Student("Aysegul");

        Student student2=new Student("Yusuf",'M');

        Student student3=new Student("Zehra", 26);

        Student student4 = new Student("Betul",41,'A');

        Student student5= new Student("Emine",'F',8);

        Student student6= new Student("Nur",'F',12,261);

        Student student7= new Student("Gul",'F',41,61,'A');


        Student[] students={student1,student2,student3,student4,student5,student6,student7};

        System.out.println(Arrays.toString(students));

        System.out.println(student6==student1); //false

        System.out.println("---------------------------------------------------------------");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
        System.out.println(student7);






    }


}
