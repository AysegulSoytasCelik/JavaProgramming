package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {
    public static void main(String[] args) {

    //    System.out.println(AccessModifiers_Test4.name1);
        //because default is NOT visible outside the package or any subclass

        System.out.println(AccessModifiers_Test4.name2);
        //protected is visible outside the package if it's subclass

      // AccessModifiers_Test4.method1;

       AccessModifiers_Test4.method2();




    }





}
