package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        //store the elements
        int[] numbers = {10, 20, 50, 70}; //4 elements
        System.out.println(Arrays.toString(numbers));

        System.out.println("-----------------------------------------");
//create a variable that can contain 5 scores

        int[] scores = new int[5]; //5 elements

        scores[1] = 85;
        scores[scores.length - 1] = 95;
        scores[3] = 75;
        scores[0] = 65;
        scores[2] = 55;

        System.out.println(Arrays.toString(scores));
        System.out.println("-----------------------------------------------------------------");

        String[] months = {"January", "February", "March", "April", "MAy", "June", "July",
                "August", "September", "October", "November", "December"};
        System.out.println(months[0]);
        System.out.println(months[1]);
        System.out.println(months[2]);
        System.out.println(months[4]);
        //...........
        //for loop is the easier way

        for (int i = 0; i < months.length; i++) { //i:represents the index numbers of array starting from 0
            System.out.println(months[i]);
        }
        System.out.println("---------------------------------------------------------------");

        for (int i = months.length-1; i >=0 ; i--) { //i:represents the index numbers of array starting from last index
            System.out.println(months[i]);
        }

    }
}
