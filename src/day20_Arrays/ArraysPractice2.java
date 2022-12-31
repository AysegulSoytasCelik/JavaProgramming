package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        char[] letters=new char[26]; //alphabets letters

        /*
        letters[0]='A';
         letters[1]='B';
         */

        for (char i = 'A', j=0;  i <='Z' && j <letters.length; i++, j++) {
            letters [j]= i;   //first way
        }
        System.out.println(Arrays.toString(letters)); //A~Z

        System.out.println("-------------------------------------------------------");
        for (int i = 0, j = 'A'; i < letters.length ; i++, j++) {
            letters[i] = (char)j; //second way
        }
        System.out.println(letters);
        System.out.println("-------------------------------------------------------------");
        char ch='A';
        for (int i = 0; i < letters.length; i++) {
            letters[i] = ch++;
        }
        System.out.println(letters);
        System.out.println("-------------------------------------------------------------------");



    }
}
