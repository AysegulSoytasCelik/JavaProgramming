package day37_OOP_InheritanceContinue_SuperKeyword.animalTask;

public class Dog extends Animal {


    //          "Max",      "
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

        public void bark() {
            System.out.println(name + " is barking");
        }


}