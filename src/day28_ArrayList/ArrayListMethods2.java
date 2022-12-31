package day28_ArrayList;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list);

        // list.remove(200); //boyle yazinca sayiyi int yani primitive olarak algiliyor. hata veriyor
        // o yuzden non-primitive ceviriyoruz ve objectin ismini yaziyoruz
        //burada oldugu gibi
        Integer num = 200; //objecti non primitive olarak tanimladik
        // list.remove(200);
        list.remove(num);
        System.out.println(list);

        boolean r = list.remove(num); //
        System.out.println(r);

        System.out.println("--------------------------------------------------------");
        System.out.println(list.size()); //size of the ArrayList ==> 5

        list.clear();
        System.out.println(list.size()); // 0
        System.out.println(list);  // []
        System.out.println("-----------------------------------------------------------");
        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A'); //0  it gives us which index of
        int b = characters.lastIndexOf('A'); //4
        System.out.println(a);
        System.out.println(b);
        System.out.println("--------------------------------------------------------");

        boolean r3 = characters.contains('A'); //true
        boolean r4 = characters.contains('Z'); //false
        boolean r5 = characters.contains('a'); //false ==> case sensitivity

        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        System.out.println("r5 = " + r5);

        System.out.println("----------------------------------------------------------------");
        //equals

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);
        //  list1.add(100); if you add 1 more or 1 different element, it runs false

        boolean result = list1.equals(list2);
        System.out.println("result = " + result); //true
        //OR
        System.out.println(list1.equals(list2)); //true

        System.out.println("------------------------------------------------------------------");

        boolean r6 = list1.isEmpty(); //false
        System.out.println("r6 = " + r6);

        list1.clear();         //simdi listeyi bosalttik
        boolean r7 = list1.isEmpty();
        System.out.println(r7);
        System.out.println("-----------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();

        //Bulk operation : CollectionType
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9)); // ==> [1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(numbers);

        numbers.removeAll(Arrays.asList(2,4,6,8)); // ==> [1, 3, 5, 7, 9] (remove you match)
        System.out.println(numbers);

        numbers.retainAll(Arrays.asList(1,3)); // ==>[1,3] (remove you didnt match)
        System.out.println(numbers);




    }
}
