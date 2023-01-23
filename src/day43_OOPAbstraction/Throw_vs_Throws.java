package day43_OOPAbstraction;

import java.util.Scanner;

public class Throw_vs_Throws {

    public static void main(String[] args) {
        System.out.println("Enter your score: ");
        int score= new Scanner(System.in).nextInt();

        if (score<0 || score>100){
            throw new RuntimeException("Invalid score: "+score); // if this condition TRUE, exit code will be exit(1)
        }

        if (score>=90){
            System.out.println("A");
        } else if (score>=80) {
            System.out.println("B");
        } else if (score>=70) {
            System.out.println();
        } else if (score>=60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }

    }

    public static void method1() throws InterruptedException { //--->faster and shorter
        Thread.sleep(5000);
    }


}
