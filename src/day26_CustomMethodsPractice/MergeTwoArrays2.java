package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MergeTwoArrays2 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8, 9};

        int[] arr3 = merge(arr1, arr2);
        System.out.println(Arrays.toString(arr3));

        System.out.println("-----------------------------------------------");

        String[] a1 ={"A","B","Z","Y"};
        String[] a2 ={"G","E","N","C"};
        String[] result = ArraysUtility.merge(a1,a2);
        System.out.println(Arrays.toString(result));

    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};

        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (int each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }
    // Double
    //merges given two arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2){
        double[] result= {};

        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each); //we prepared this method before, after that we are using it now
        }
        for (double each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    //CHAR
    //merges given two arrays and returns the new array
    public static char[] merge(char[] arr1, char[] arr2){
        char[] result= {};

        for (char each : arr1) {
            result = ArraysUtility.addElement(result, each); //we prepared this method before, after that we are using it now
        }
        for (char each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    //STRING
    //merges given two arrays and returns the new array
    public static String[] merge(String[] arr1, String[] arr2){
        String[] result= {};

        for (String each : arr1) {
            result = ArraysUtility.addElement(result, each); //we prepared this method before, after that we are using it now
        }
        for (String each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

}
