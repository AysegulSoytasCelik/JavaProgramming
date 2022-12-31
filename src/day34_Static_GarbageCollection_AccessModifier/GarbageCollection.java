package day34_Static_GarbageCollection_AccessModifier;

import day30_CustomClass.Dog;
import day32_CustomClass_Constructors.Car;
import day33_CustomClass_Statics.Iphone;
import day33_CustomClass_Statics.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {
/*
        String str=null;  // non primitives
       //   int n= null;  ==>you can NOT assign primitives to the null value
        //  null is only for non primitives

        System.out.println(str.toUpperCase());
*/

        String str = "Wooden Spoon"; //after line 14, "Wooden Spoon" will eligible for garbage collection
        str = null;
        System.out.println(str); //null

        Car car1= new Car("Toyota");
        car1 = null; //eligible for garbage collection

        System.out.println(car1);

        System.out.println("---------------------------------------------------------------------");

        Dog dog1= new Dog();
        dog1.name="Lucy";

           dog1 =      new Dog();
        dog1.name="Max";
        System.out.println(dog1); //max

        System.out.println("------------------------------------------------------------------------");

        String language = "Python";
               language=  "Java";
        System.out.println(language); //Java
        System.out.println("--------------------------------------------------------------");

        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(100);
        ArrayList<Integer> list2= list1;
        list2.addAll(Arrays.asList(200,300,400));
        System.out.println("list1 = " + list1); //200,300,400
        System.out.println("list2 = " + list2); //200,300,400
        System.out.println(list2==list1); //true

        System.out.println("-------------------------------------------------------------------------");

        Student student1=new Student("Aysegul", 'F',41,26,'A');
        student1.grade ='B';

        Student student2= student1;
        student2.name="Cigdem";

        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);

        System.out.println("---------------------------------------------------------------------");

        ArrayList<String> l1=new ArrayList<>();
        l1.add("Java");

        ArrayList<String>l2= new ArrayList<>();
           l2.add("Python");


    }


}
