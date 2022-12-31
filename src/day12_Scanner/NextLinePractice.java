package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine(); //if you dont put this method, concole cant ask your full name

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("enter your GPA"); //3.5Enter
        double gpa = input.nextDouble();//method is change again, you need to fix it after this line

        input.nextLine(); //important

        System.out.println("enter your school name");
        String schoolName = input.nextLine(); //enter


        System.out.println("age: " + age);
        System.out.println("full name: " + fullName);
        System.out.println("gpa: "+gpa);
        System.out.println("school name: "+schoolName);

input.close();
    }
}
/*
1.enter the user to enter age (nextInt)
2.ask the user to enter full name (nextLine)
 */