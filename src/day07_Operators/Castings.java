package day07_Operators;

import java.sql.SQLOutput;

public class Castings {
    public static void main(String[] args) {
        float averageScore = 20.5f;

        byte num1 = (byte) averageScore; //explicit casting  larger to smaller
        short num2 = (short) averageScore; //explicit casting float >short
        int num3 = (int) averageScore; // explicit casting
        float num4 =averageScore; //float to float =>there is NO CASTING!!!
        double num5 = averageScore; //implicit casting smaller to larger
        long num6 =(long) averageScore; //explicit casting


        System.out.println("num1 = " +num1);
        System.out.println("num2 = "+ num2);
        System.out.println("num3= "+num3);
        System.out.println("num4= "+num5);
        System.out.println("num5= "+num5);
        System.out.println("num6= "+num6);




//    20/6=3 in the int.  ==> 20.0/6=3.333...




    }
}
/*
1.1 declare a variable of float named averageScore and initialize it to 20.5
1.2 declare the following variables and assign averageScore to each of them:
                             byte num1;
                             short num2;
                             int num3;
                             long num4;
                             float num5
                             double num6;

 */