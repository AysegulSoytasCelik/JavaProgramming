package day37_OOP_InheritanceContinue_SuperKeyword.phoneTask;

public class Phone { //parent class:only contains the common features of all the subclass
    public String brand;
    public String model;
    public String size;
    public double prize;
    public String color;

    public static boolean hasBattery = true;

    public Phone(String brand, String model, String size, double prize, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.prize = prize;
        this.color = color;
    }
    public void call(long phoneNumber){
        System.out.println(brand+" "+ model+" is calling"+ phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(brand+" "+ " is texting"+ phoneNumber);
    }


    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", prize= $" + prize +
                ", color='" + color + '\'' +
                ", has battery='" + hasBattery + '\'' +
                '}';
    }
}
/*
1.1 Create a class named Phone:
            Variables:
                    brand, model, size, price, color
            Add Constructor to set all the fields

            Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    toString()
 */