package day08_IfStatement;

public class SwapTwoVariable_WithTemporaryVariable {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
//-------------------------------------------------------------------------------
        int c = b; //15

        b = a;
        a = c;


        // ---------------------------------------------------------------------------------------------
        System.out.println("a = " + a); //15
        System.out.println("b = " + b);//10





        /*
  Write a program that can swipe two variables' value by using a temporary variable
  ex:
      if a = 10, b=15
      output:
          a=15
          b=10
   */


    }
}
