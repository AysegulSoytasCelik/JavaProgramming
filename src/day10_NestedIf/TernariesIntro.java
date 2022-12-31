package day10_NestedIf;

import java.sql.SQLOutput;

public class TernariesIntro {
    public static void main(String[] args) {

        int n = 100;

        if (n % 2 == 0) {  // ==(n%2==0)?
            System.out.println("Even"); //string
        } else {
            System.out.println("Odd"); //String
        }

        //---------------------------------------------------------------------

        String result1 = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(result1);
        //---------------------------------------------------------------------------
        int age = 17;
        // String result2= (age>=21)? "Eligible" : "Not Eligible";
        // System.out.println(result2);

        System.out.println((age>=21)? "Eligible" : "Not Eligible");    //shorter way
        //------------------------------------------------------------------------------
        //if this number positive,negative or zero

        int number = 100;
        System.out.println((number>0)? "Positive" :(number<0)? "Negative" : "Zero");
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //if you want you can write:
        String result3 = (number>0)? "Positive" :(number<0)? "Negative" : "Zero" ;
        System.out.println(result3);
    }
}
