package day25_CustomMethod_Overloading;

import utilities.StringUtility;

import java.sql.SQLOutput;

public class Test {

    public static void main(String[] args) {


        String str = "Java Programming Language" ;

        StringUtility.printEachChar(str);
        System.out.println("----------------------------------------------");

        String s1 = "Cydeo School" ;
        // First way
        String reverse = StringUtility.reverse(s1);
        System.out.println(reverse);

        //second way
        System.out.println(StringUtility.reverse(s1));

        System.out.println("--------------------------------------------------------------------");

        String word ="Civic";
        //1st way
        System.out.println(StringUtility.isPalindrome(word)); //true

        //2nd way
        boolean palindrome =StringUtility.isPalindrome(word);
        System.out.println("palindrome ="+palindrome);


        System.out.println("------------------------------------------------------------------------------------");
        String[] names = { "Ayse", "Mom", "Betul", "Anna", "Zehra", "racecar", "Yusuf"};
        int count=0;
        for (String each :names) {
           if (StringUtility.isPalindrome(each)){
               count++;

           }
        }
        System.out.println(count);

        System.out.println("---------------========================================");

        String s2 ="aaaaabbbbccccdddd";
        String nonDup = StringUtility.removeDuplicates(s2);
        System.out.println(nonDup); // "acbd"

    }
}
