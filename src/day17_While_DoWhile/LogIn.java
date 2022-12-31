package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter your username");
        String u = scan.next();

        System.out.println("Enter your password");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("Cydeo123")) {//if credentials are valid
            System.out.println("Logged in");
        } else{ //if credentials are not valid
            int attempts = 3;
            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts > 0) {
                if (attempts==1){ //if last chance
                    System.out.println("THIS IS YOUR LAST ATTEMPT"); //Attention
                }
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username:");
                u = scan.next();

                System.out.println("Enter your password");
                p = scan.next();
                attempts--;
            }

            if (u.equals("Cydeo")&& p.equals("Cydeo123")){
                System.out.println("Logged in");
            }else {
                System.out.println("Your account is locked");
            }
        }

        scan.close();
        //while(invalid && hasAttempts)





    }
}
/*
You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

 */