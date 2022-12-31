package day08_IfStatement;

public class NumberOfDays {
    public static void main(String[] args) {
       /*
       write a program that can print the number of days in a month

       ex:
            number = 1 ~ 12

      output:
            31 Days

      Hints:
            months that has 31 days: 1,3,5,7,8,10,12
            months that has 30 days: 4,6,9,11
            month that has 28 days : 2

        */
        int number = 5;
        boolean has28Days = number == 2; // for the month has 28 days
        boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11;
        boolean has31Days = !has28Days && !has30Days;
// boolean has31Days = number ==1 || number == 3 || number==5 || number==7 || number==8 || number==10 || number==12;

        if (has28Days){ //if the month has 28 days
            System.out.println("28 days"); }
        if (has30Days) {
            System.out.println(" 30 days");}

        if (has31Days) {
            System.out.println("31 days ");
        }







    }
}
