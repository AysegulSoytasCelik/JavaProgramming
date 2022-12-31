package day37_OOP_InheritanceContinue_SuperKeyword.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1= new Dog("Rocky","Husky",'M',1,"Small","White");
        System.out.println(dog1);
        dog1.bark();

        Cat cat1= new Cat("Love","Siamese",'F',2,"Large","Brown");
        System.out.println(cat1);
        cat1.scratch();
     // NOT   cat1.sing();

        Parrot parrot1=new Parrot("King","Macaw",'M',3,"Small","Blue");
        System.out.println(parrot1);
        parrot1.sing();
     // NOT   parrot1.bark();

    }


}
