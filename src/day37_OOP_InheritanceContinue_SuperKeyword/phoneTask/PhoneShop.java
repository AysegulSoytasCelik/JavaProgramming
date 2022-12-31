package day37_OOP_InheritanceContinue_SuperKeyword.phoneTask;

public class PhoneShop {


    public static void main(String[] args) {

        IPhone iPhone=new IPhone("Iphone 12", "6.7 inches",1000,"Black");

        Samsung samsung = new Samsung("Galaxy S19", "6 inches",900, "White");

        Nokia nokia= new Nokia("Brick","4 inches",50, "Gray");

        System.out.println(iPhone);

        System.out.println(samsung);

        System.out.println(nokia);

        iPhone.call(911);
        iPhone.text(123456789);
        iPhone.faceTime(123456789);
        iPhone.faceTime("yahoo@gmail.com");

        System.out.println("----------------------------------------------------------------------");

        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();

        System.out.println("-------------------------------------------------------------");

        nokia.call(35282292);
        nokia.text(274727372);
        nokia.selfDefense();
        System.out.println("--------------------------------------------------------------");
        System.out.println(Phone.hasBattery);
        System.out.println(IPhone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);

    }
}
