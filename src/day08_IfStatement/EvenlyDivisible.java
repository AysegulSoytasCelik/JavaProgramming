package day08_IfStatement;

public class EvenlyDivisible {
    public static void main(String[] args) {
        /*
        Create a class called EvenlyDivisible,and write a program that can check if a number is evenly divisible by 2, 3, 5
    		Ex:
				number = 65;

			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true

         */
        int number = 100;
        boolean divisibleBy2 = number % 2 == 0; // if reminder of a number divided by 2 is zero,
        boolean divisibleBy3 = number % 3 == 0; // then it's evenly divisible by 2.
        boolean divisibleBy5 = number % 5 == 0;

        System.out.println(number + " is divisible by 2: " + divisibleBy2);
        System.out.println(number + " is divisible by 3:" + divisibleBy3);
        System.out.println(number + " is divisible by 5:" + divisibleBy5);
        System.out.println("----------------------------------------------------------");

        //my extra exercise

        int number2 = 99;
        boolean divisibleBy4 = number2 % 2 == 0;
        boolean divisibleBy6 = number2 % 6 == 0;
        boolean divisibleBy9 = number2 % 9 == 0;
        System.out.println(number2 + " is diviible by 4:" + divisibleBy4);
        System.out.println(number2 + "is divisible 6:" + divisibleBy6);
        System.out.println(number2 + " is divisible by 9: " + divisibleBy9);





        int year = 2000;
        boolean isLeapYear = year % 4 ==0;
        System.out.println(year + " is leap year: " +  isLeapYear);


    }
}
