package day12_Scanner;

import java.util.Scanner;

public class ShortVideosScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first sentence ");
        String firstSentence = input.nextLine();

        System.out.println("Enter your second sentence ");
        String secondSentence = input.nextLine();

        System.out.println("Enter your first sentence " + firstSentence);
        System.out.println("Enter your second sentence " + secondSentence);


        input.close();


    }
}
