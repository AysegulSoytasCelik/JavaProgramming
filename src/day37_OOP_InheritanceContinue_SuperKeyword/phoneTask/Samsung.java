package day37_OOP_InheritanceContinue_SuperKeyword.phoneTask;

public class Samsung extends Phone {

    public Samsung(String model, String size, double prize, String color) {
        super("Samsung", model, size, prize, color);
    }

    public void freeze(){
        System.out.println(brand+" "+model+" is freezing");
    }


}
/*
Create a subclass of Phone named Samsung:
        Variables:
                brand, model, size, price, color

        Methods:
                call(long phoneNumber)
                text(long phoneNumber)
                freeze()
                toString()3
 */