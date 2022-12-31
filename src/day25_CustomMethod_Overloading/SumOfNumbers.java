package day25_CustomMethod_Overloading;

public class SumOfNumbers {
    public static void main(String[] args) {

        int sum2 = sumOf2Numbers(10, 20);
        System.out.println("sum2 = " + sum2);
        System.out.println("-----------------------------------------------------------");
        int sum3 = sumOf3Numbers(10, 20, 30);
        System.out.println("sum3=" + sum3);
        System.out.println("-------------------------------------------------------------");
        int sum4 = sumOf4Numbers(10,20,30,40);
        System.out.println("sum4= "+sum4);

    }

    //create a method that can find sum of two numbers ==>sumOf2Numbers
    public static int sumOf2Numbers(int num1, int num2) {
        return num1 + num2;
    }


    //create a method that can find sum of three numbers ==>sumOf3Numbers
    public static int sumOf3Numbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    //create a method that can find sum of four numbers ==>sumOf4Numbers
    public static int sumOf4Numbers(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

}
