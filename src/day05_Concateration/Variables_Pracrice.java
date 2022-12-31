package day05_Concateration;

/*
                           num1 = 100;
                           num2 = 10000;
                           num3 = 3.5;
                           num4 = 2.5f;
                           num5 = 999999999999L;
                           num6 = 850000;
                    print each of the variables above on the console
       */
public class Variables_Pracrice {
    public static void main(String[] args) {
        byte num1 = 100;
        short num2 = 10000;
        double num3 = 3.5;
        float num4 = 2.5f;
        long num5 = 999_999_999_999L;  //you can put _, for make readable
        int num6 = 850000;

        // "123" + 1 = "1231" in java
        //123 + 1 = 124 in java
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);




    }

}
