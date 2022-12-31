package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        //  > ,>= , < , <=
        //   >
        boolean result1 = 20 > 40; //false
        System.out.println("result1 = " + result1);
        
        boolean result2 = 300>=150; //if one is true, it gives true
        System.out.println("result2 = " + result2);

        //   >=
        boolean result3 = 100>=100; //true - not big but equal, if one is true
        System.out.println("result3 = " + result3);
        
        boolean result4 = 300>=500; // false, not greater and not equal
        System.out.println("result4 = " + result4);
        
        //credit score of 720 in order to be eligible
        
        int creditScore = 745;
        boolean isEligibleForLoan = creditScore >= 720; //if the credit score is 720 or greater
                                                        //its eligible for credit
        //  <
        boolean result5 = 100 < 120; //true
        System.out.println("result5 = " + result5);

        boolean result6 = 200 < 180; // false
        System.out.println("result6 = " + result6);

        // <=
        int score = 59;
        boolean hasFailed = score <= 59;
        //                   75<= 59 ==>false

        System.out.println("hasFailed = " + hasFailed); //true

        boolean result7 = 45 <= 60; //true (either one is true, answer is true)

        // ==
        int x = 100;
        int y = 200;
        boolean equal = x == y; //false
        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar" == "Good Guy"; //false
        System.out.println("result8 = " + result8);

        boolean result9 = 'A' == 'a'; //false  ====> java has the case sense language
        System.out.println("result9 = " + result9);

        boolean result10 = "Java" == "Java"; //true
                             // should completely each other, spaces, uppercases, lowercases
        System.out.println("result10 = " + result10);

        // !=

        boolean result11= 100 != 200.5; //true
        System.out.println("result11 = " + result11);

        boolean result12 = "Java" != "Break"; //true (means these are not equal)
        System.out.println("result12 = " + result12);

        boolean result13 = 300 != 300; //false
        System.out.println("result13 = " + result13);



        
        
    }
}
