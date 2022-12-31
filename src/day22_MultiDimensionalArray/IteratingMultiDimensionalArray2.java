package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray2 {
    public static void main(String[] args) {

//index of the elements: 0 1 2   0 1 2 3   0 1 2 3 4 5
        int[][] arr2D={ {1,2,3} , {4,5,6,7,8} , {9,10,11,12,13} };
//index of arrays:         0         1              2

        for (int i = arr2D.length - 1; i >= 0; i--) { //i:index number of 1D arrays starting
                                                      //from last index to 0
            for (int j = 0; j < arr2D[i].length; j++) {//j:index number of elements
                System.out.print(arr2D[i][j]+" ");                                     //starting from 0 to last index
            }
            System.out.println();
        }
        System.out.println("----------------------------------------");

        for (int i = 0; i < arr2D.length; i++) {//i:index of 1 Darray started from 0
            for (int j = arr2D[i].length - 1; j >= 0; j--) {//j:index of each element,starting from last index
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------");




    }
}
/*
task1
output:  9 10 11 12 13
         4 5 6 7
         1 2 3

task2
output: 3 2 1
        8 7 6 5
        13 12 11 10 9
task3
output: 13 12 11 10 9
        8 7 6 5 4
        3 2 1
 */