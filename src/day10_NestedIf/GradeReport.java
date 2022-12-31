package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

      /*
      90~100 : excellent
      80~89 : great
      70~79: good
      60~69: passed
      0~59: failed

       */
        int score = 95;
        if (score >= 0 && score <= 100) { //if the score is valid
            //5 possibilities
            if (score >= 90) { //false: if the score<90
                System.out.println("Excellent");
            } else if (score >= 80) {
                System.out.println("Great");
            } else if (score >= 70) {  //false; if the score <70
                System.out.println("Good");

            } else if (score >= 60) {
                System.out.println("Passed");

            } else {
                System.out.println("Failed");
            }

        } else {  //if the score is Not valid
            System.out.println("Invalid Score");

        }
//=========================================================================


        System.out.println((score >= 0 && score <= 100) ? (score >= 90) ? "A"
        : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "E" : "InvalidScore");



//_________________________________________________________________________

        String result = (score >= 0 && score <= 100) ? (score >= 90) ? "A"
                : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "E" : "InvalidScore";
        System.out.println(result);
    }
}
