package day17_While_DoWhile;

import java.util.Scanner;

public class WillYouMarryMe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you mary me?");
        String answer = scan.nextLine().toLowerCase();

        while (  !(answer.equals("yes") || answer.equals("no"))){
            System.err.println("Invalid answer, re-enter your answer");
            System.out.println("Will you mary me?");
            answer = scan.nextLine().toLowerCase();
        }

        if (answer.equals("yes")){
            System.out.println("Congratulation");
        }else{
            System.err.println("Good Bye");
        }
     scan.close();

    }
}
