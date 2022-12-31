package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        /*
        Write a programme that can divide two positive
        numbers without using /(division) and *(multiplication)
        and %(reminder) operators
        20 / 6
         */
        int a = 1953;
        int b = 22;
        int count =0;


        while (a>=b){
            a-=b;
           count++;
        }
        System.out.println(count + "with a reminder of "+a); // a's new value is reminder











    }
}
