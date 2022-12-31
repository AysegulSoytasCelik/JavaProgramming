package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1= new Student();
        student1.setInfo("Aygun",'F',39,2210,'A');
        System.out.println(student1);

        Student student2= new Student();
        student2.setInfo("Aysegul",'F',41,2529,'B');

        Student student3= new Student();
        student3.setInfo("Zehrabetul",'F',20,2530,'A');

        Student student4 =new Student();
        student4.setInfo("Yusuf",'M',42,2531,'B');

        Student student5 =new Student();
        student5.setInfo("Serkan",'M',15,2528,'C');

        Student[] students ={student1,student2,student3,student4,student5};
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("-------------------------------------------------------------------------");
        ArrayList<Student> earlyBirds =new ArrayList<>(); //gradeA
        ArrayList<Student> angryBirds =new ArrayList<>();

        for (Student student : students) {
            if (student.grade == 'A') {

                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }
        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);

    }
}
