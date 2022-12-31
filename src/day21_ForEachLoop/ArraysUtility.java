package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(nums));
        System.out.println("----------------------------------------------------------");

        int[] scores = {95, 100, 55, 65, 85, 78};

        System.out.println(Arrays.toString(scores)); //prints 95, 100, 55, 65, 85, 78

        Arrays.sort(scores); //this makes the print, ascending order(smallest to largest)
        //System.out.println(Arrays.toString(scores));//prints 55, 65, 78, 85, 95, 100
        System.out.println("min= " + scores[0]);
        System.out.println("max= " + scores[scores.length - 1]);

        String[] names = {"Anna", "Zuhal", "Ahmet", "Gunay", "Maria", "Sinem"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        String[] words = {"Anna", "ANNA"};
        Arrays.sort(words); //uppers case's values in the ASGII table are smallest then to the lower case's
        System.out.println(Arrays.toString(words));
//upper case starts 65, lowercase starts 97
        System.out.println("----------------------------------------------------------------");

        int[] arr1 = {1, 3, 2};
        int[] arr2 = {1, 2, 3};

        boolean r1 = Arrays.equals(arr1, arr2); //false
        System.out.println(r1);

        Arrays.sort(arr1);//1,2,3
        Arrays.sort(arr2);//1,2,3
        boolean r2 = Arrays.equals(arr1, arr2);
        System.out.println(r2);
        System.out.println("--------------------------------------------------------");

        char[] ch1 = {'a', 'c', 'b'};
        char[] ch2 = {'b', 'a', 'c'};

        Arrays.sort(ch1); //a, b, c
        Arrays.sort(ch2); // a, b, c

        boolean anagram = Arrays.equals(ch1, ch2);
        System.out.println("Are these characters anagram? "+ anagram);

    }
}
