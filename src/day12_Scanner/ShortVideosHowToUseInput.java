package day12_Scanner;

import java.util.Scanner;

public class ShortVideosHowToUseInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score ");
        int score = 85;

        //when you want to use write String, you CAN NOT
        //because input is full
        //you should write a new one when you change the data type
        // was ==>int, now ==>String
        System.out.println("Enter your full name ");
        String fullName= input.nextLine(); //nextLine is important

        System.out.println("score = "+ score);
        System.out.println("full name = "+fullName);


input.close();












    }
}
