package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
//index of the elements: 0 1 2     0 1 2 3 4     0 1  2  3  4 5
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};
//index of arrays:         0         1              2
       /* for (int[] each1DArray :arr2D ){
            for (int eachElement: each1DArray)
            System.out.println(eachElement);
        }*/

        for (int[]each1DArray: arr2D){
            for (int eachElement:each1DArray){
                System.out.println(eachElement);
            }
        }


    }
}
/*
task3 ??
output: 13 12 11 10 9
        8 7 6 5 4
        3 2 1
 */