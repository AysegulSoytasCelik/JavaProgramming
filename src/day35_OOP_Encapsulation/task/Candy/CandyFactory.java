package day35_OOP_Encapsulation.task.Candy;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {


        ArrayList<Candy> candies = new ArrayList<>();
        Candy candy1 = new Candy("Milka", 5, 2.49, true);
        Candy candy2 = new Candy("Haribo", 4, 3.5, false);

        Candy candy3 = new Candy("Ulker", 4, 2.50, false);

        Candy candy4 = new Candy("Cadburry", 3, 1.9, true);
        Candy candy5 = new Candy("Helvaaci", 5, 1.5, false);


        candies.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));
        System.out.println(candies);

        for (Candy each: candies){
            System.out.println(each.getBrand()+": "+each.getPrice());
        }


    }

}
/*
   1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy

 */