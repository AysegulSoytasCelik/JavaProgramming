package day12_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerReplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!\n" +
                "Please enter your personal information");

        System.out.println("Enter your first name");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = scan.nextLine();

        System.out.println("Enter your email: ");
        String email = scan.nextLine();

        System.out.println("Enter your street: ");
        String street = scan.nextLine();

        System.out.println("Enter your city: ");
        String city = scan.nextLine();

        System.out.println("Enter your state: ");
        String state = scan.next();

        System.out.println("Enter your zip code: ");
        int zipCode = scan.nextInt();

        System.out.println("Enter your personal phone number: ");
        long personalPhoneNumber = scan.nextLong();

        System.out.println("Enter your work phone number: ");
        long workPhoneNumber = scan.nextLong();

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("Enter your height: ");
        double height=scan.nextDouble();

        System.out.println("Enter your weight: ");
        double weight=scan.nextDouble();

        System.out.println(" Are you married? ");
        boolean married =scan.nextBoolean();

        System.out.println("Patient personal information");
        System.out.println("Full name: "+ firstName+" "+lastName);
        System.out.println("Address: "+street+ " "+city+" \n"+state+" "+zipCode);
        System.out.println("Contact: \n work phone number: "+workPhoneNumber+" \npersonal number: "+personalPhoneNumber+" email: "+email);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight+" pounds");
        System.out.println("Married: "+ married);

/*
Welcome to the patient portal!
Please enter your personal information
Enter your first name
  James
Enter your last name
  May
Enter your email
  jamesmay@gmail.com
Enter your street
  7925 Jones Branch Dr
Enter your city
  McLean
Enter your state
  VA
Enter your zip code
  22102
Enter your work phone number
  7896542314
Enter your personal phone number
  2406542314
Enter your age
  35
Enter your height
  5.10
Enter your weight
  173.2
Are you married?
  true
 */



    }
}
