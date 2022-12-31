package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Java";
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));
        //[J, a, v, a]


        for (char each : str.toCharArray()) {
            System.out.println(each); //prints each element line by line
        }

        String sentence = "Wooden Spoon";
        String[] words = sentence.split(" ");
        System.out.println(words);
        System.out.println("-----------------------------------------------------------");
        String email = "WoodenSpoon@cydeo.com";
        String[] arr = email.split("@");
        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------------------------------------");

        String s ="Today is nice day. Today is Monday. Today we learn Java";
        String[] sentences = s.split("\\. ");
        System.out.println(Arrays.toString(sentences));


    }
}
