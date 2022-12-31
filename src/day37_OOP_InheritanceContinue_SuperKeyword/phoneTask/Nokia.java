package day37_OOP_InheritanceContinue_SuperKeyword.phoneTask;

public class Nokia extends Phone {

    public Nokia(String model, String size, double prize, String color) {
        super("Nokia", model, size, prize, color);
    }

    public void selfDefense(){
        System.out.println("You can use " +brand+" "+model+" as self defense tool");
    }

}
/*
Create a subclass of Phone named Nokia:
        Variables:
                brand, model, size, price, color

        Methods:
                call(long phoneNumber)
                text(long phoneNumber)
               selfDefense()
                toString()3
 */