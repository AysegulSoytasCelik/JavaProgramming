package day41_Exceptions;

import day39_Recap.cydeoTask.Cydeo;
import day39_Recap.cydeoTask.Student;
import day39_Recap.shapeTask.ShapeObjects;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {


    public static void main(String[] args) {

        //unchecked exception:

        int a =10;
        int b=0;

      //   System.out.println(a/b); -->this part crashes your program so "wooden spoon" can not run

      //  System.out.println("wooden spoon");


        char[] characters ={'A','B','C'};
        //                   0   1    2
        // System.out.println(characters[99]);

        Student student =null; //because student is null

      // System.out.println(student.getName()); -->NullPointerException
      //  student.study(); --> NullPointerException

       final String str="Wooden Spoon";
       // str=null; //again, str is nothing now
        // System.out.println(str.toUpperCase()); -->

        String str2 =""; //object != null
        System.out.println(str2.isEmpty()); //false



        //  CHECKED EXCEPTION:

        System.out.println("Hello");

        //  Thread.sleep(3000); // InterruptedException ==>checked exception
        // --> this is InterruptedException -->build output window, not run window

        System.out.println("Cydeo");


    //    FileInputStream file = new FileInputStream("path of the file"); -->FileNotFoundException

      //  System.out.println("java".charAt(20000)); -->unchecked exception  IndexOutOfBoundsException



    }

}
