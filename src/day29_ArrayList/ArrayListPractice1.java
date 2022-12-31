package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {
        String[] countries= {"Japan", "Korea","Turkey","United Kingdom","United States","Canada","Tanzania"};
        //converting array to arraylist
        ArrayList<String> list=new ArrayList<>(Arrays.asList(countries));

        list.removeIf(p -> p.length()>=10);
        //converting Arraylist back to array
        countries= list.toArray(new String[0]);
        System.out.println(Arrays.toString(countries));

    }
}
/*
1. create an Array of string called country names

2.
 */