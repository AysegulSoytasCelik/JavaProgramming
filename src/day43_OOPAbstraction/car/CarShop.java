package day43_OOPAbstraction.car;

public class CarShop {
    public static void main(String[] args) {

        //     Car car1= new Car("Cydeo","10","Blue",2023,1000000);
        //we can not create an object from abstract class, because abstract class is not concrete

        Honda honda = new Honda("Accord", "Black", 2019, 30000);

        Audi audi = new Audi("Q7", "Blue", 2020, 45000);

        Tesla tesla = new Tesla("Model3", "White", 2021, 60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("------------------------------------");

        honda.setColor("Red");
        audi.setColor("Purple");
        tesla.setColor("Green");

        honda.setPrice(250000);  //change the prices
        audi.setPrice(40000);
        tesla.setPrice(55000);


        System.out.println(honda);  //was Black, now Red
        System.out.println(audi);  //was blue, now Purple
        System.out.println(tesla);   //was white, now green

        System.out.println("-----------------------------------------------------");
    }


}
