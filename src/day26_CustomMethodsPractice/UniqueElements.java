package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 7};
        int[] unique = uniqueElements(array);
        System.out.println(Arrays.toString(unique));
        //if the array doesn't have unique element, console writes ==> []
        System.out.println("-------------------------------------------------------------");
        double[] arr2 = {1.5, 2.5, 1.5, 3.5, 4.5, 4.5, 4.5, 5.5, 5.5};
        double[] unique2 = uniqueElements(arr2);
        System.out.println(Arrays.toString(unique2));
        System.out.println("--------------------------------------------------------------");
        char[] arr3 = {'A', 'B', 'C', 'C', 'F', 'F', 'Z', 'C', 'C', 'Y'};
        char[] unique3= uniqueElements(arr3);
        System.out.println(Arrays.toString(unique3));
        System.out.println("--------------------------------------------------------------");
        String [] arr4={"Ayse", "Betul","Hosaf","Hosaf","Zehra","Yusuf","Celik","Celik"};
        String[] unique4 = uniqueElements(arr4);
        System.out.println(Arrays.toString(unique4));

    }

    //returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array) {
        int[] result = {};  //new int[0]

        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { //if the frequency is 1, than the element is unique
                result = ArraysUtility.addElement(result, each); //its include unique elements
                //this is new created array
            }
        }
        return result;

    }

    //returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array) {
        double[] result = {};  //new int[0]

        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { //if the frequency is 1, than the element is unique
                result = ArraysUtility.addElement(result, each); //its include unique elements
                //this is new created array
            }
        }
        return result;

    }
    //returns the unique elements of the array as a new array

    public static char[] uniqueElements(char[] array) {
        char[] result = {};  //new int[0]

        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { //if the frequency is 1, than the element is unique
                result = ArraysUtility.addElement(result, each); //its include unique elements
                //this is new created array
            }
        }
        return result;

    }

    public static String[] uniqueElements(String[] array) {
        String[] result = {};  //new int[0]

        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) { //if the frequency is 1, than the element is unique
                result = ArraysUtility.addElement(result, each); //its include unique elements
                //this is new created array
            }
        }
        return result;

    }
}

