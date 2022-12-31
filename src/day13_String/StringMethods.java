package day13_String;

import java.sql.SQLOutput;

public class StringMethods {
    public static void main(String[] args) {

        String word = "Cydeo";
        //index:  01234
        char thirdChar = word.charAt(2);

        System.out.println("thirdChar= " + thirdChar);

        //char tenthChar= word.charAt(9); //didnt works
        // System.out.println("tenthChar="+tenthChar)
        //===================================================================================

        String s1 = "Batch 25 is the best batch."; //this has 27 character
        int totalChars = s1.length();
        System.out.println("total chars= " + totalChars);
        char lastChar = s1.charAt(s1.length() - 1);
        System.out.println("last char =" + lastChar);
//=================================================================================================
        String str = "wooden spoon"; //its all lower case
        str = str.toUpperCase(); //"WOODEN SPOON"
        System.out.println(str);
//=================================================================================================

        String s = "java";
        s = s.toUpperCase();
        System.out.println(s);
//============================================================================================
        String sentence = "today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();
        System.out.println(sentence);


    }
}
