package day09_IfStatement;

public class MaximumNumber {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 9;

        boolean num1IsMax= num1>num2;
        boolean num2IsMax = num2>num1;

        if (num1IsMax){
            System.out.println(num1+ " is the maximum number.");
        }else{
            System.out.println(num2+ " is the maximum number.");
        }










    }
}
