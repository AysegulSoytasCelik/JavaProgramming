package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test1 started");

        try {

            System.out.println(9 / 0);

            System.out.println("Try block");

        } catch (ArithmeticException e) {

            System.out.println("Catch block");

            System.out.println("Arithmetic exception was occurred");

        }


        System.out.println("Test1 completed");

        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("Test2 started");

        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[200]); //.ArrayIndexOutOfBoundsException

        } catch (
                RuntimeException e) { // because RuntimeException is a parent class which contains all RUN EXCEPTIONS ERRORS

            e.printStackTrace(); //says what's and where is wrong in this code

            //   System.out.println( e.getMessage());
        }


        System.out.println("Test2 completed");


        System.out.println("-----------------------------------------------------------------");

        System.out.println("Test 3 started");


        try {
            System.out.println("Cydeo".substring(2, 0));
        } catch (RuntimeException e) {
            e.printStackTrace();

        }

        System.out.println("Test3 started");

        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Hello");
        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Cydeo");

        System.out.println("_____________________________________________________________________________");

        //      FileInputStream file = new FileInputStream("File path");
        //     -->when you write like this, "FileInputStream" gives an error named "FileNotFoundException"
        //     --> click the error sign which is underlined by red color, it shows th shortcut to do try&catch method


        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}