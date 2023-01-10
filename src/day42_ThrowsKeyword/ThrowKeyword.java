package day42_ThrowsKeyword;

import day11_Switch_Statement.ScannerIntro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {


    public static void main(String[] args) {

        System.out.println("Enter your age:");
        int age = new Scanner(System.in).nextInt();

        if (age<0){
           throw new InputMismatchException("age can not be negative: "+age);
        }

        if (age>21){
            System.out.println("You are eligible");
        }else {
            throw new RuntimeException("You might be at least 21 years old");
        }


    }

}
