package day31_CustomClass_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaObjects {

    public static void main(String[] args) {

        ArrayList<Pizza> pizzas= new ArrayList<>();
        //create 100 pizza objects : size 'S', cheese topping-2, pepperoni topping-3
        //create 100 pizza objects : size 'M', cheese topping-3, pepperoni topping-4
        //create 100 pizza objects : size 'L', cheese topping-4, pepperoni topping-5

        for (int i = 0; i < 100; i++) {
            Pizza smallPizza =new Pizza('S',2,3);
            Pizza mediumPizza = new Pizza('M',3,4);
            Pizza largePizza =new Pizza('L',4,5);

            pizzas.addAll(Arrays.asList(smallPizza,mediumPizza,largePizza));

        }
        System.out.println("Total  number of pizza: "+pizzas.size()); //how many pizza?

        double totalPrice =0;

        for (Pizza pizza : pizzas) {
           totalPrice += pizza.calculateCost();
        }
        System.out.println(totalPrice);






    }
}
/*
Pizza Task:
    	Attributes:
    		size, numberOfCheeseTopping, numberOfPepperoniTopping

    		Add a constructor that can set all the fields

		Actions:
			calcCost(): returns the totalCost of the pizza
			toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */