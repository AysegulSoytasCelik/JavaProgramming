package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
     //  oddOrEven(); ==>the method demands additional info to complete its task
        oddOrEven(10);
        ageOfThePerson(1981);
        printNumbers(100,200);

    }

    //create a function that can check if a number is odd number or even number==>oddOrEven
    public static void oddOrEven(int number){ //10
        if (number%2==0){
            System.out.println(number+" is an even number");
        }else{
            System.out.println(number+" is an odd number");
        }
    }

// create a function that can display the age of the person==> ageOfThePerson
    public static void ageOfThePerson(int birthYear){
        int age =2022-birthYear;
        System.out.println("Your age is: "+ age);
    }



    //create a function that can print all the numbers between 10 and 50
    public static void printNumbers(int x, int y){


    }



}
