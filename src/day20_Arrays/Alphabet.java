package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
/*
        // 1st way: easier way than the second
        char[] alphabets = new char[26]; //[Z~A] 26 characters

        alphabets[0] = 'Z';
        char ch = 'Z';
        for (int i = 0; i < alphabets.length; i++, ch--) {
            alphabets[i] = ch;
        }
         */
        //2nd way:
        char[] alphabets = new char[26]; //[Z~A] 26 characters
        for (char i = 0, j= 'Z'; i<alphabets.length; i++,j--){
            alphabets[i]=j;
        }



        //this print method for whole ways
        System.out.println(Arrays.toString(alphabets)); //print the whole array
        System.out.println(alphabets[0]); //printing the element of array



        //2nd way:







    }

}
