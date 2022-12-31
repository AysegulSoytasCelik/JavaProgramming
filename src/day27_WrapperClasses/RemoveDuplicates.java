package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr1= {1,1,2,2,3,3,4,4,4,5,5,5,6,6,6};
       arr1=removeDuplicates(arr1);
        System.out.println(Arrays.toString(arr1));

        String[] words ={"Java", "Ruby","Java","Ruby","C#", "Ruby"};
        words= removeDuplicates(words);
        System.out.println(Arrays.toString(words));

        System.out.println("------------------------------------------------------------");
       //  int[] numbers ={1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,5};
       // numbers= Arrays.stream(numbers).distinct().toArray();
        // System.out.println(Arrays.toString(numbers));


    }

   // removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){
        int[] result={};
        for (int each : array) {
            if (!ArraysUtility.contains(result,each)){
             result=  ArraysUtility.addElement(result,each);

            }
        }
        return result;
    }
    // removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array){
        double[] result={};
        for (double each : array) {
            if (!ArraysUtility.contains(result,each)){
                result=  ArraysUtility.addElement(result,each);

            }
        }
        return result;
    }

    // removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array){
        char[] result={};
        for (char each : array) {
            if (!ArraysUtility.contains(result,each)){
                result=  ArraysUtility.addElement(result,each);

            }
        }
        return result;
    }

    // removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array){
        String[] result={};
        for (String each : array) {
            if (!ArraysUtility.contains(result,each)){
                result=  ArraysUtility.addElement(result,each);

            }
        }
        return result;
    }

}
