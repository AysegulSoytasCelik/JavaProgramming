package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {


    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // index 0  ,   // sout ==> [10]
        numbers.add(20); //index 1  ,   //sout ==> [10,20]
        numbers.add(30); //index 2  ,   // sout ==> [10,20,30]
        numbers.add(40); //3     ,  // sout ==> [10,20,30,40]
        numbers.add(50); //4  ,    //sout ==> [10,20,30,40,50]
        numbers.add(60); //5   ,   //sout ==> [10,20,30,40,50,60]

        numbers.add(2,25); // sout ==> [10,20,25,30,40,50,60]
        numbers.add(5,45); //sout ==> [10,20,25,30,40,45,50,60]
        numbers.add(8,65);  // sout ==> [10,20,25,30,40,45,50,60,65s]

        System.out.println(numbers);
        System.out.println(numbers.size());
        int lastIndex = numbers.size()-1;
        System.out.println("last index = " + lastIndex);
        
        int num = numbers.get(3);  //3 numarali index ==> 30
        System.out.println("num = " + num);

        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("---------------------------------------------------------------------------------");

        ArrayList<String> list =new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2,"JavaScript"); //replace  //when you set this, 2nd index turns to JavaScript
        list.set(3,"C++"); //replace


        System.out.println(list); //[Java, Python, Java, C#, Ruby]
                                    // [Java, Python, JavaScript, C#, Ruby]


    }
}
