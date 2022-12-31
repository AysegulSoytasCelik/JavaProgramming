package day09_IfStatement;

import java.util.MissingFormatArgumentException;

public class MedianNumber {
    public static void main(String[] args) {
        /*
        write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Possibility #1: a could be median number
			Possibility #2: b could be median number
			Possibility #3: c could be median number

         */
            int a = 10,
                b = 15,
                c = 20;

            boolean aIsMed = (a>b && a<c) || (a>c && a<b);
            boolean bIsMed = (b>a && b<c) || (b<a && b>c);
           // boolean cIsMed = (c>a && c<b) || (c<a && c>b);
            boolean cIsMed = !aIsMed && !bIsMed;

            boolean aIsMax = a> b && a>c;
            boolean bIsMax = b>a && b>c;
            boolean cIsMax = c>a && c>b;


            if (aIsMed){   //if a is the median number
                System.out.println(a+" is the median number.");
            }
            if (bIsMed){ //if b is the median number
                System.out.println(b+" is the median number.");
            }
            if (cIsMed){ //if c is the median number
                System.out.println(c+" is the median number.");
            }

if (aIsMax){
    System.out.println(a+ " is the maximum number");
}
if (bIsMax){
    System.out.println(b+" is yhe maximum number");
}
if (cIsMax){
    System.out.println(c+"is the maximum number");

}
    }
}
