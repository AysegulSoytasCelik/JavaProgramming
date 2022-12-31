package day09_IfStatement;

public class MinimumNumber {
    public static void main(String[] args) {
       int num3= 396;
        int num4= 369;

        boolean num3IsMin = num3 < num4;
        boolean num4ISMin= num4 < num3;


        if (num3IsMin){
            System.out.println(num3 + " is minimum number");
        }else{
            System.out.println(num4+ " is minimum number");
        }




    }
}
