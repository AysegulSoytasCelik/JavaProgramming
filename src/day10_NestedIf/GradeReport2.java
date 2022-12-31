package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {
        int score = 95;
        String result = ""; //temporary

        if (score>=0 && score<=100) { //if the score is valid
            //5 possibilities //THIS IS MAD

            if (score>=90){ //false: if the score<90
                result = "Excellent";

            } else if (score>=80) {
                result= "Great";

            } else if (score>=70) {  //false; if the score <70
                result= "Good";

            } else if (score>=60) {
                result= "Passed";

            }else{
                result= "Failed";
            }

        }else {  //if the score is Not valid
            result= "Invalid Score";

        }

        System.out.println(result);












    }
}
