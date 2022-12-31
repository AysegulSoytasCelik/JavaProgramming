package day14_String;

import java.lang.module.FindException;

public class MyExerciseaboutSubstring {
    public static void main(String[] args) {

        String s = "I'm from Turkey but I love Tanzania";
        String country = s.substring(s.indexOf("T"), s.indexOf("y")+1);
        System.out.println(country);

        String love = s.substring(s.lastIndexOf("T"));
        System.out.println(love);
        System.out.println("=======================================================================");

String daughter = " Zehram Betulum";
String realName1 = daughter.substring(daughter.indexOf("Z"), daughter.indexOf("m"));
String realName2 = daughter.substring(daughter.indexOf("B"),daughter.lastIndexOf("l")+1);
        System.out.println(realName1);
        System.out.println(realName2);





    }
}
