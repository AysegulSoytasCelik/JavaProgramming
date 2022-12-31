package day15_ForLoop;

import java.security.SecureRandom;

public class ReplaceX {

    public static void main(String[] args) {

        String str ="xcodeX";
        String result = str.replace("x","a").replace("X","a");
        System.out.println(result);


        String str1= "zahmet";
        String result1 = str1.replace("z","R");
        System.out.println(result1);

    }
}
/*
2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */