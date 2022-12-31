package day09_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Alex";
        int age = 20;
        String citizen = "UK";

        /*
        boolean eligibleToVote= age>=21 && citizen=="UK";
        boolean notEligibleToVote = age<21 && citizen != "UK";
         */
        //if you want not create a boolean

        if (age>=21 && citizen=="UK"){
            System.out.println(name+" is eligible to vote");
        }else{
            System.out.println(name+" is NOT eligible to vote");
        }




















    }
}
