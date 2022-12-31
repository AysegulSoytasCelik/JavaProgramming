package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        //123Enter

        Scanner input = new Scanner(System.in); //enter key assigned this

        System.out.println("Enter your full name");
        String fullName = input.nextLine(); //wooden spoonEnter

        System.out.println("Enter your programming language: ");
        String programming = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();  //24Enter

        input.nextLine();//enter   // everytime you should use another method
        // -not nexLine scanner if you to clear scanners memory

        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine();

        System.out.println("full name: " + fullName);
        System.out.println("programming: " + programming);
        System.out.println("age: " + age);
        System.out.println("school name: " + schoolName);

        input.close();


    }
}
