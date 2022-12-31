package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6}; //7
        numbers = addElement(numbers,7);

        char[] chars = {'A', 'B', 'C', 'D'};//'E'
        chars = addElement(chars,'E');

        String[] names = {"Ayse", "Zehra", "Betul", "Yusuf"}; //"Serkan"
        names = addElement(names, "Serkan");

        double[] doubles= {1.4, 2.8, 9.4, 10.5};//85.4
        doubles =addElement(doubles,85.4);

        System.out.println("names "+ Arrays.toString(names));
        System.out.println("chars "+  Arrays.toString(chars));
        System.out.println("numbers "+ Arrays.toString(numbers));
        System.out.println("doubles "+Arrays.toString(doubles));



    }

    // 1.adds the given integer element to array, returns a new array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    //2.create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;//element need to be assigned to the last index
        return result;


    }

    //3. Create a return method called addString that can add a String after the last index of a String array
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;//element need to be assigned to the last index
        return result;
    }

    //  4. create a return method called addChar that can add a char after last index of a char array
    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;//element need to be assigned to the last index
        return result;
    }


}
