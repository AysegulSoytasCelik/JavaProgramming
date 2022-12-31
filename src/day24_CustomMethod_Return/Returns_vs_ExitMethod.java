package day24_CustomMethod_Return;

public class Returns_vs_ExitMethod {
    public static void main(String[] args) {
        nameOfTheMonths(50);
        System.out.println("Hello World");


    }

    public static void nameOfTheMonths(int number) {
        if (number < 1 || number > 12) {
            System.out.println("invalid");
           // return; //exits nameOfTheMonths method,remaining code fragments of the method never gets executed
            System.exit(0); //if result is "invalid", this exit statement will be terminated the
                                    // print statement which is in the main method.
            //***you should pay attention when you use this statement.
            //if its really necessary, in that time you can use
        }

        //ternary
        String name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "March"
                : (number == 4) ? "April" : (number == 5) ? "May" : (number == 6) ? "June"
                : (number == 7) ? "July" : (number == 8) ? "Aug" : (number == 9) ? "sep"
                : (number == 10) ? "oct" : (number == 11) ? "nov" : "dec";


        System.out.println("Months name = " + name);

    }

}
