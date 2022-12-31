package day37_OOP_InheritanceContinue_SuperKeyword.phoneTask;

public final class IPhone  extends Phone{

    public IPhone(String model, String size, double prize, String color) {
        super("Apple", model,size,prize,color);
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand+" "+model+" "+"is having a Face Time with phone number: "+phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand+" "+model+" "+"is having a Face Time with email: "+email);
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
                    faceTime(long phoneNumber)
                    faceTime(String email)
                    toString()
 */