package day08_IfStatement;

public class HW_NameOfTheDay {
    public static void main(String[] args) {

        //int n = 3; //between 1~7
        int n = 3;  //if there is 10 it change everything
        String day;

        if (n == 1) {
            //System.out.println("Monday");
            day = "Monday";

        } else if (n == 2) {
            //System.out.println("Tuesday");
            day = "Tuesday";

        } else if (n == 3) {
           // System.out.println("Wednesday");
            day = "Wednesday";

        } else if (n == 4) {
            //System.out.println("Thursday");
            day = "Thursday";

        } else if (n == 5) {
            //System.out.println("Friday");
            day = "Friday";

        } else if (n == 6) {
            //System.out.println("Saturday");
            day = "Saturday";

        } else   {
            //System.out.println("Sunday");
            day = "Sunday";
        }

        System.out.println("day = "+day);

        //} else {
            //System.out.println("Invalid");   // All other possibilities turn "invalid"
       //day = "Invalid";




     /*

        write a program that can display the name of the day
        number = 1 ~ 7
         */


    }
}
