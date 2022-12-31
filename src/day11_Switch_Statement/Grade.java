package day11_Switch_Statement;

public class Grade {
    public static void main(String[] args) {
        /*
         a char variable named grade is given. use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid
         */

        char ch = 'B';
        String result = "";
        switch (ch) {
            case 'A':
                //System.out.println("Excellent");
                result = "excellent";
                break;

            case 'B':
                //System.out.println("great job");
                result = "great job";
                break;

            case 'C':
                //System.out.println("good");
                result = "good";
                break;

            case 'D':
                // System.out.println("passed");
                result = "passed";
                break;

            case 'F':
                //System.out.println("failed");
                result = "failed";
                break;

            default:
                //System.out.println("invalid");
                result = "invalid";

        }
                System.out.println(result);

    }
}
