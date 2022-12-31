package day15_ForLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        System.out.println("Enter a word:");
        String word = new Scanner(System.in).next(); // input: xcodex

        if(word.charAt(0)=='x'){
            word = word.replaceFirst("x","a"); // "acodex"
        }
       /* System.out.println(word);
        System.out.println("enter your name:");
        String word2=new Scanner(System.in).next();
        if (word2.charAt(3)=='e'){
            word2= word2.replace("e","a");
        }
        System.out.println(word2);
        */
    }
}
/*
1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */