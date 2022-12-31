package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {

        //example
        System.out.println(true == !false); // true
        System.out.println(!true != false); // false
        System.out.println(!false == true);  // true

        System.out.println(!!false); //false
        System.out.println(!!!true);  //false
        //example finish

        int score = 85;
        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && score <= 89; // ===>  boolean b = score >= 80 && !a;

    boolean c = score>= 70 && score <= 79;
        // boolean c = score >= 70 &&  !a && !b; //alternative type

    boolean d = score >=60 && score <= 69;
    // boolean d = !a && !b && !c;

    boolean f = score >= 0 && score <= 59;
    //boolean f = !a && b && !c && !d;

       if (a){   //if the student made A
            System.out.println("Excellent");
        }

        if (b) {
            System.out.println("Great");
        }

        if (c) {
            System.out.println("Good");
        }

        if (d) {
            System.out.println("Passed");
        }

        if (f) {
            System.out.println("Failed");
        }


/*
       a- 90 ~ 100 ==> Excellent
       b- 80 ~ 89 ==> Great
       c-  70 ~ 79 ==> Good
       d- 60 ~ 69 ==> Passed
       f- 0 ~ 59 ==> Failed
 */


    }
}
