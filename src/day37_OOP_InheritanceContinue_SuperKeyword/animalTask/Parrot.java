package day37_OOP_InheritanceContinue_SuperKeyword.animalTask;

public class Parrot extends Animal{

   // public String parrotWingColor; ==> if you create new, you can add with " this. "

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
        //  this.parrotWingColor= parrotWingColor;
    }

    public void sing(){
        System.out.println(name+" is singing");
    }
}
