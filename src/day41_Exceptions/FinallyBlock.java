package day41_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};


        try {

            System.out.println(arr[10]);
            System.out.println("Try Block");

        } catch (RuntimeException e) {

            System.out.println("Catch Block");
            e.printStackTrace();

        } finally {
            System.out.println("Finally Block");
        }

        //on the console --> Catch Block   &  Finally Block
        

        System.out.println("------------------------------------------------------------------------------");

        int[] arr2 = {1, 2, 3, 4};

        try {

            System.out.println(arr[10]);
            System.out.println("Try Block2");

        } catch (RuntimeException e) {

            System.out.println("Catch Block2");
            e.printStackTrace();
            System.exit(0); //important part-->stops the "Finally block" being executed

        } finally {

            System.out.println("Finally Block2");
        }

        //n the console --> Catch Block2

    }
}
