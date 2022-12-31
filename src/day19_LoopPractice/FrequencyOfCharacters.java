package day19_LoopPractice;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

/*
1. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1

 */
        String str ="aabbcccd";
        String result=""; //a2b1c3d1
        for (int j = 0; j < str.length(); j++) { //this is outer loop
            char ch =str.charAt(j); //'a' //each character from string
            int count = 0;
            for (int i = 0; i < str.length(); i++) {  //to find the frequency of each character
        //   ^  this one is inner loop
                char each = str.charAt(i); //each character of str
                if (ch == each) {
                    count++;
                }
            }
            if (result.contains(""+ch)){
                continue;
            }
            result+=ch;
            result+=count;

        }
        System.out.println(result);












    }
}
