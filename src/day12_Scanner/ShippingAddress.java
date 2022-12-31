package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //enter

        System.out.println("Enter your full name");
        String fullName = scan.nextLine(); //Java ProgrammingEnter

        System.out.println("Enter your building number");
        String building = scan.next(); //7925A

        scan.nextLine();

        System.out.println("Enter your street name");
        String street = scan.nextLine();

        System.out.println("Enter your city name");
        String cityName = scan.nextLine();

        System.out.println("Enter your state name");
        String state = scan.next(); //VAEnter

        System.out.println("Enter your zip code");
        String zipCode = scan.next();

        scan.nextLine();

        System.out.println("Enter your country");
        String countryName = scan.nextLine();


        System.out.println("");

        scan.close();

        System.out.println(fullName);


    }

}

/*
1. Enter your full name ( nextLine() )
2. Enter your building number ( next() )
        //should add nextLine method
3. Enter your Street name ( nextLine() )
4. Enter your city name ( nextLine() )
5. Enter your state ( nextLine() )
6. Enter your zip code ( next() )
Display the shipping address
John Smith
7925 Jones Branch Dr
McLean, VA 22012

 */
