package day15_ForLoop;

import java.util.Locale;

public class FormatFullName {
    public static void main(String[] args) {
        String firstName = "cyDEo";
        String lastName = "SCHOOL";

    //    firstName=firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase();
                    //C                       +         ydeo =======>Cydeo
      //  System.out.println(firstName);
 firstName= (""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();
           //when you put an empty  //"C"
        //double quote "", it turns a String
        System.out.println(firstName);

        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println(lastName);

        String fullName= firstName+" "+lastName;
        System.out.println(fullName);

        String baby1 = "zeHRa";
        baby1 = baby1.substring(0,1).toUpperCase()+baby1.substring(1).toLowerCase();
        System.out.println(baby1);

        String baby2 = "betul";
        baby2= (""+baby2.charAt(0)).toUpperCase()+baby2.substring(1).toLowerCase();
        System.out.println(baby2);
        String myBabies= baby1+" "+baby2;
        System.out.println("My sweetest babies "+myBabies);



    }
}
/*
3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */