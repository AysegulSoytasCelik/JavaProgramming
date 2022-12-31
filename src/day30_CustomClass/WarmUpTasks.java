package day30_CustomClass;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {
    public static void main(String[] args) {
    // SWAP(takas)
    //1. Write a program that can swap the first and last elements of an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println("numbers = " + numbers);

        //2. Write a program that can move the zeros to the last index of Arraylist
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        int size =list.size(); // list size =8

        list.removeAll(Arrays.asList(0));
        System.out.println(list); //[1,2,3,4]

        int newSize= list.size(); // new size=4
        int totalNumberOfZero = size -newSize; // 8-4= 4
        System.out.println("totalNumberOfZero = " + totalNumberOfZero); //4
        for (int i = 0; i < totalNumberOfZero; i++) {
            list.add(0);  //  [1, 2, 3, 4, 0, 0, 0, 0]
        }
        System.out.println(list);
        System.out.println("-----------------------------------------------------------");

        // 2.question, alternative answer

        ArrayList<Integer>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result =new ArrayList<>();

        for (Integer each: list2) {
            if (each!=0){
                result.add(each); // [1,2,3,4]
            }
        }

        for (Integer each:  list2){
            if (each==0){
                result.add(each); // [1,2,3,4,0,0,0,0]
            }
        }
        System.out.println(result);

        System.out.println("-----------------------------------------------------------");

        String  str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        ArrayList<Character>letters =new ArrayList<>(chars); //add all the characters
        letters.removeIf(p-> !Character.isLetter(p)); // remove the characters that are nOT letters

        System.out.println("letters = " + letters); //[ A,B,C,D,E,F,G]

        ArrayList<Character> digits=new ArrayList<>(chars); //all characters
        digits.removeIf(p-> !Character.isDigit(p)); //remove the characters that are ! NOT digits

        System.out.println("digits = " + digits); // [1, 2, 3, 4, 5, 6]

        ArrayList<Character> specialChar = new ArrayList<>(chars);
        specialChar.removeAll(letters);
        specialChar.removeAll(digits);


        //second way to solve the last part
        // specialChar.removeIf(p-> !Character.isLetterOrDigit(p));

        System.out.println("specialChar= "+ specialChar);


    }
}
/*
1. Write a program that can swap the first and last elements of an ArrayList

2. Write a program that can move the zeros to the last index of Arraylist
        Ex:
        list:   {1,0,2,0,3,0,4,0}
        output: [1,2,3,4,0,0,0,0]

3. Write a program that can extract the special characters, digits and letters from a String and
store them into separate Array

       ex:          str="ABCD123$%#@&456EFG!"

       OUTPUT:      list1={1,2,3,4,5,6}
                    list2 ={A,B,C,D,E,F,G}
                    list3={$,%,#,@,&,!}
 */
