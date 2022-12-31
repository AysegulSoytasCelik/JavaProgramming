package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray {


    public static void main(String[] args) {
       int[] arr1={1,2,3,4,5};
       int[] result = reverse(arr1);
        System.out.println(Arrays.toString(result));

    }
    //REVERSE

    //reverse the given array, returns a new array
    //                          {1,2,3,4,5} ==>starts with the last index
    //INT
    public static int[] reverse (int[] array){

        int[] result = new int[array.length];
        int j=0;
        for (int i = array.length-1; i >=0 ; i--) {
            result[j++]= array[i];

        }
     /*
      if you don't write tje "j" outside the for loop, you
       can write the method as this
        for (int i = array.length-1, j=0;  i >= 0;i--, j++) {
          result[j] =array[i];
        }
      */
        return result;

    }

    //reverse the given array, returns a new array
    //DOUBLE
    public static double[] reverse (double[] array){

        double[] result = new double[array.length];
        int j=0;
        for (int i = array.length-1; i >=0 ; i--) {
            result[j++]= array[i];

        }
        return result;

    }

    //CHAR
    public static char[] reverse (char[] array){

        char[] result = new char[array.length];
        int j=0;
        for (int i = array.length-1; i >=0 ; i--) {
            result[j++]= array[i];

        }
        return result;

    }
    //String
    public static String[] reverse (String[] array){

        String[] result = new String[array.length];
        int j=0;
        for (int i = array.length-1; i >=0 ; i--) {
            result[j++]= array[i];

        }
        return result;

    }

}
