package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
        //age: 38 years old
        byte age = 38;
     /*
      weight: 160 pounds
      byte weight = 160;        160 is out of 'byte' range
    byte num = -129      -129 is out of 'byte' range
      */
        short weight = 160;  //160 with in the range of 'short'
        //salary: 100000$
        // short salary = 100000; //100000 is out of 'short' range
        int salary = 100000; //preffered data type for integer numbers

        long asset = 3_333_333_333L;

     //for decimal numbers: Float point number
       // double> float
        //tax: 0.26
        float tax = 0.26F;
        double PI = 3.14;
        System.out.println("--------------------------------------------------------------");
        String cityOne = "Chicago";
        String cityTwo = "Virginia";
        double basePrice = 152.40;
        double milesBetweenCities = 739.8;
        double rate = 3;
        double ticketPrice = (basePrice +milesBetweenCities)/ rate;

        System.out.println("The ticket price is $" +ticketPrice);

        System.out.println("------------------------------------------------------");





    }


}
