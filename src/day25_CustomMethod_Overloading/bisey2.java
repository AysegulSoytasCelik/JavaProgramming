package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class bisey2 {
    public static void main(String[] args) {
        double [] doub = new double[4];
        doub[0]=1.0;
        doub[2]=42.1;
        doub=new double[4];
        doub[1]=17.2;
        doub[3]=doub.length;
        System.out.println(Arrays.toString(doub));
    }
}
