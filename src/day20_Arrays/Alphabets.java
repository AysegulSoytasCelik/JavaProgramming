package day20_Arrays;

import java.util.Arrays;

public class Alphabets {
    public static void main(String[] args) {
        char[] alphabets = new char[26]; //26 Z~A
        alphabets[0]='Z';
        char ch= 'Z';
        for (char i = 0, j='Z'; i <alphabets.length ; i++, j--) {
            alphabets[i]=j;
        }

        System.out.println(Arrays.toString(alphabets));







    }
}
