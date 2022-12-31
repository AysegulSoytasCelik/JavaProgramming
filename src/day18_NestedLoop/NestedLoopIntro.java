package day18_NestedLoop;

public class NestedLoopIntro {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        } //if you want to print the wooden spoon for 5times, you can use this loop or
        //another times which you can write and repeat it, can use loop.

        for (int i = 0; i < 12; i++) {
            System.out.println("Wooden Spoon");
        }  //this is another times
        System.out.println("--------------------------------------------------------------------");
        //but if you want to repeat this, more than 5 times, you should use nested loop.
        //outer loop executed 1time, inner loop will execute 5times.

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Wooden spoon");
            }
        }





    }
}
