package utilities;

import day34_Static_GarbageCollection_AccessModifier.AccessModifiers;

public class AccessModifiers_Test2 {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);


   //    System.out.println(AccessModifiers.defaultData);
       //Default access modifier is not visible 
        // only reachable within the same class and same package

  //      System.out.println(AccessModifiers.privateData);
        //NOT reachable outside the class

      AccessModifiers.method1();
  //    AccessModifiers.method2(); // ==> DEFAULT modifier not reachable outside the PACKAGE
 //     AccessModifiers.method3(); // ==> PRIVATE modifier not reachable outside the CLASS




    }


}
