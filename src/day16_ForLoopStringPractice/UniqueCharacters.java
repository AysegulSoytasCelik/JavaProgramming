package day16_ForLoopStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aaabccc";
        //           01234567
        String result = "";  //temporary value
//if the first and last index numbers of character are same,then the character is unique

        for (int i = 0; i <  str.length(); i++) {//i:index number of str(starting from0)
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) { //not equal first a's index n is 0, last a's index n is 2
                result += ch;
            }
        }
        System.out.println(result);




    }
}
/*
 Write a program that can return the unique characters from a String
             Ex:
				input:    AABCCD
                output:   BD
        Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique

        		  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1

                  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2
 */