package day34_Static_GarbageCollection_AccessModifier;

import static day34_Static_GarbageCollection_AccessModifier.Circle.*;

import static utilities.MathUtility.*;

public class Test {

    public static void main(String[] args) { //MAIN METHOD CAN RUN INSIDE THE CLASS.
        //We wrote this in the Circle class. so this main method CAN NOT run in this class in the same values.
        // But if static method is active in the circle class, this main method CAN run.
        //                             inactive static     active static block
        System.out.println(Circle.pi); //      0.0              3.14
        System.out.println(Circle.name);//     null             Circle
        System.out.println(Circle.numbers);//  null             [10,20]

        System.out.println("---------------------------------------------------------------------");

        //find the sum of 10,20
       int r1= sum(10,20);
        System.out.println(r1);
        //find the sum of 100,200
      int r2=  sum(100,200);
        System.out.println(r2);

       int r3= subtract(100,50);
        System.out.println(r3);

       int r4= max(100,400);
        System.out.println(r4);

    }
}
