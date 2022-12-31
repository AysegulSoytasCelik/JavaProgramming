package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.setInfo("Max","Husky",'M',"Small","White",2);
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
      //  dog.hunt(); we can NOT use
        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Tarcin","Siame",'M',"Small","Brown",2);
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.scratch();
        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan","Bengal",'M',"Large","White",4);
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.hunt();
        tiger.roar();
        System.out.println(tiger);
    }
}