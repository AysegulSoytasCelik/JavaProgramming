package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Daniel";

        int age = 34;
        String citizen = "USA";
        boolean isEligible = age >= 18 && citizen == "USA";
        //                    18 >= 18 && "USA"    == "USA"
        //                     true   &&  true   ====> true

        System.out.println(name + " is eligible to vote: " + isEligible);
//----------------------------------------------------------------------------------------------------------
        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 42;
        int inCome = 40000;

        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && inCome >= 60000;
        System.out.println(name2 + " is eligible for loan: " + isEligible2);
        //--------------------------------------------------------------------------------------------
        String name3 = "Shay";
        char gender = 'F';
        int age3 = 21;
        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        //                     21 >= 18   && 'F' == 'M'
        System.out.println(name3 + " is eligible to register: " + isEligible3);

 //-----------------------------------------------------------------------------------------

        String name4 ="James";
        String countryOfBirth ="USA";
        boolean marriedToUSCitizen = false;
        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;
       //                             false           ||     false

        System.out.println( name4 + " is eligible to apply for US citizenShip: " +isEligible4);
//---------------------------------------------------------------------------------------------

        String student = "Anna";
        double gpa = 3.5;
        int familyIncome = 100000;

        boolean isEligible5 = gpa >=3.5 || familyIncome <= 60000;
        //                        true    || true   ====>true

        System.out.println( student + " is eligible for scholarship: " + isEligible5); //true

        //----------------------------------------------------------------------------------------

       int score = 85;
       boolean passed = score >= 60;
       boolean failed = !passed;

        System.out.println("passed = " +passed);
        System.out.println("failed= " + failed);









    }
}
