package day11_Switch_Statement;

public class Grade2 {
    public static void main(String[] args) {
        char ch = 'F';
        String result ="";
        switch (ch) {
            case 'A':     //   If the grade is A or
            case 'B':     //    B or C
            case 'C':     //    or D===>passed
            case 'D':
                //System.out.println("passed");
                result= "passed";
                break;

            case'F':
            default:
                //System.out.println("failed");
                result = "failed";
        }

        System.out.println(result);




        /*
        If the grade is A or B or C or D===>passed
        otherwise ==> failed
         */


    }
}
