package day06_PrimitiveTypeCasting;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(10 + 20);
        System.out.println(100 - 50);
        System.out.println(10 * 6);
        System.out.println(10 / 4); //it gives us 2, because its integer number
        System.out.println(10.0 / 4);
        System.out.println(10 / 4.0); //answer is same
        System.out.println(100 / 3);

        int a = 100;
        double b = a / 6;
        System.out.println(b);
        double c = a / 6.0; // integer/decimal=decimal. you can write " double c = (double) a/6;
        System.out.println(c);
        System.out.println("-------------short videos--------------------");

        //+
        System.out.println(1000 + 2000 ); //without " " !!!!
        System.out.println(2.5 + 3.5 );

        // -
        System.out.println(100 - 30 );

        int p = 300 - 100;
        System.out.println( p );

        System.out.println(20 * 6);
        System.out.println(5.5 * 7);


        System.out.println(10 / 4); //2
        System.out.println(10.0 / 4 ); //2.5
        System.out.println(10 / 4.0); //2.5
        System.out.println(10d / 4 ); //2.5

        System.out.println(20/6); //3(because both num. are int)

        System.out.println(20d/6); //3.333333...... (letter "d" is important


        System.out.println(10 % 4 ); // 2
        /*
        in math: 10/4=2.5

        remainder: numerator - (denimanator * integer result)
        10 / 4 = 2 (and reminder is 2)
        10 - (4*2)
        10-  8
                =2 (is reminder)
        20 / 3 = 6 (and reminder is 2)
        20 - (3* 6)
        20 - 18
                =2 (reminder is 2)

        34 / 6 = 5.6666... (4 is reminder)
        34 - ( 6 * 5)
        34 - 30
                =4

         */

        System.out.println(34.0 / 6 ); //console shows 5.666...
        System.out.println(34 % 6 ); //console shows just reminder = 4




    }


}
/*
    + : addition
    - : substract
    * : multiplication
    / : division
    % : remainder
 */