package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {
        //create a variable that's capable enough to contains 5 names

        String[] myGroup = new String[5];
        myGroup[0] = "yusuf";
        myGroup[1] = "aysegul";
        myGroup[2] = "serkan";
        myGroup[3] = "zehra";
        myGroup[4] = "betul";


        //  System.out.println(myGroups); => hashcode
        //because this is not  a legal way to write the arrays statement

        System.out.println(Arrays.toString(myGroup));

        System.out.println("-------------------------------------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(days));

        int number = 5; //its friday
        if (number<1 ||number>7){
            System.out.println("invalid number");
            System.exit(0);
        }
        System.out.println(days[number-1]); //because it starts 0, and I want to know 5th day


    }
}
