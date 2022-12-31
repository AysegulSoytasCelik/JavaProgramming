package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

       /*
       you can NOT use the remove method inside the loop or if

       for (int i = 0; i < list.size(); i++) {
            if (list.get(i) %2 !=0){
                list.remove(i);
            }
        } */
        System.out.println(list);     //[1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        list.removeIf( p -> p< 5); //Lambda Expression
        System.out.println(list);     //[5, 6, 7, 8, 9, 5, 6, 7, 8, 9, 5, 6, 7, 8, 9]
        System.out.println("----------------------------------------------------------------------");

        ArrayList<Integer>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(each -> each %2==0);
        System.out.println("list2 = " + list2);

        System.out.println("----------------------------------------------------------------------");

        ArrayList<String>list3=new ArrayList<>();
        list3.addAll(Arrays.asList("Java","Python","JavaScript","C#","C++","Java","Java"));
        list3.removeIf(p -> p.startsWith("J") ); //["Python","C#","C++"]
        System.out.println("list3 = " + list3);
        System.out.println("------------------------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Racecar","Level","Eye","Java","Python","Cydeo"));
        names.removeIf(name -> StringUtility.isPalindrome(name)); //it removes all palindromes
        //this is an address to StringUtility class we prepared before
        //  and we are using that method now
//*** names.removeIf(name -> !StringUtility.isPalindrome(name)); ==>if you want to remove which is not palindrome
        System.out.println("names = " + names); //names = [Java, Python, Cydeo]



    }



}
