package day09_IfStatement;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {

        int age = 25;
        boolean hasId =true;

       if (hasId){  //if thr person has ID


           if (age>=21){ //if the person is 21 years old or older
               System.out.println("Eligible to buy alcohol");
           }else { //if the person is less than 21
               System.out.println("Not eligible to buy alcohol");
           }
       } else{ //if the person doesnt have ID
           System.out.println(" You must have an ID to buy alcohol");
       }



       /*boolean isEligibleToBuyAlcohol = age >= 21;
       boolean isNOTEligibleToBuyAlcohol = age<21;

        if (isEligibleToBuyAlcohol){
            System.out.println(name+ " is eligible to buy alcohol");
        }else{
            if (isNOTEligibleToBuyAlcohol){
                System.out.println(name+" is NOT eligible to buy alcohol");
            }
        }
*/
//=========================================================================================

        int number =3;
        if (number>=1 && number<=7 ) {   //if the number is a valid number
                //7 options
            if (number==1) {
                System.out.println("Monday");
            } else if (number==2) {
                System.out.println("Tuesday");
            } else if (number==3) {
                System.out.println("Wednesday");
            } else if (number==4) {
                System.out.println("Thursday");
            } else if (number==5) {
                System.out.println("Friday");
            } else if (number==6) {
                System.out.println("Saturday");
            }else {
                System.out.println("Sunday");

            }
            //    } else { //if the number is not valid
           // System.out.println("Invalid Number");
            //if there is invalid number
        }











    }
}
