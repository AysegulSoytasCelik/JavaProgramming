package day29_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.concurrent.Callable;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        // sort()
        Collections.sort(list); // sort the list, smallest to the largest order
        System.out.println(list); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println("-----------------------------------------------------------------------");
        // reverse()
        ArrayList<Character>list2=new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','C','D','E'));
        System.out.println("list2 = " + list2);  //list2 = [A, B, C, D, E]
        Collections.reverse(list2);
        System.out.println("list2 = " + list2);  //list2 = [E, D, C, B, A]
        System.out.println("---------------------------------------------------------------");

        // swap()
        ArrayList<Integer> list3 =new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));
        Collections.swap(list3,1,4);
        System.out.println("list3 = " + list3); //list3 = [10, 50, 30, 40, 20, 60, 70]
        System.out.println("-------------------------------------------------------------------");

        // max()  min()
        ArrayList<Integer>list4=new ArrayList<>();
        list4.addAll(Arrays.asList(10,20,24,65,87,43,23,47,26));
        int max = Collections.max(list4);
        int min = Collections.min(list4);
        System.out.println(max);
        System.out.println(min);
        System.out.println("-----------------------------------------------------------------");
        // replaceAll()
        ArrayList<Integer>list5= new ArrayList<>();
        list5.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));

        Collections.replaceAll(list5,10,1000);
        System.out.println("list5 = " + list5);
        System.out.println("---------------------------------------------------------------");

        // frequency()

       int frequency=  Collections.frequency(list5,1000);

        System.out.println("frequency = " + frequency);
        System.out.println("---------------------------------------------------------------");

        ArrayList<String>words=new ArrayList<>();
        words.addAll(Arrays.asList("Java","Python", "JavaScript","Python","C#","C++","Python","Java","Java"));

        int countJava =Collections.frequency(words,"Java");
        int countPython = Collections.frequency(words,"Python");

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);

        if (countPython==countJava){
            System.out.println("equal");
        }else{
            System.out.println( "not equal");
        }

    }



}
/*
Collections: utility class of collection

	sort()
	reverse()
	swap()
	max()
	min()
	replaceAll()
	frequency()
 */