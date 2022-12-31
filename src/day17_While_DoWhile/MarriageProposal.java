package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me? Yes/No");

        String a = scan.nextLine();

        while (!(a.equalsIgnoreCase("Yes")||a.equalsIgnoreCase("No"))){
            System.out.println("invalid answer, please re-enter");
            a= scan.next();
        }

        if (a.equalsIgnoreCase("yes")){
            System.out.println("You win");
        }else {
            System.out.println("You lost :)");
        }

scan.close();





    }
}
