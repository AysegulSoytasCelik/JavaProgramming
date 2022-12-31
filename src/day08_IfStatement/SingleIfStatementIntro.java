package day08_IfStatement;

public class SingleIfStatementIntro {


    public static void main(String[] args) {
        int number = 300;

        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = number % 2 != 0;

        if (evenNumber) {
            System.out.println(number + " is even number");
        }
        //if you write single if code, if its true, console is shown it but if its false not show
        //but if you write opposite of"if" possibility

        if (!evenNumber) {                  //!evenNumber = not even
            System.out.println(number + " is odd number ");
        }
        //or

        if (oddNumber) {
            System.out.println(number + " is Odd number");
        }


        /*
        System.out.println(" Odd Number");
        System.out.println(" Even Number");
         */
        //-------------------------------------------------------------------------------------
        int n = 200;
        //positive

        if (n > 0) {
            System.out.println(n + " is positive");

        }
        //negative
        if (n < 0) {
            System.out.println(n + " is negative");

        }
        //zero
        if (n == 0) {
            System.out.println(n + " is zero");
        }


    }
}