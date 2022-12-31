package day17_While_DoWhile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "AAABBBCAAAA";
        char ch = 'A';

        int frequency = 0;
        for (int i = 0; i < str.length(); i++) { //i:indexes of str
            char eachChar = str.charAt(i);   //eachChar:each character of str
            if (ch == eachChar) {
                //if given ch is matching with the eachChar, then ch is appeared in the string
                frequency++;// same ==>frequecy+=1;
            }
        }

        System.out.println(frequency);
    }
}
/*
 Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */