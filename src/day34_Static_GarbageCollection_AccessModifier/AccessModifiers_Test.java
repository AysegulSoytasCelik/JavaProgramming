package day34_Static_GarbageCollection_AccessModifier;

public class AccessModifiers_Test {

    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
    //System.out.println(AccessModifiers.privateData); only reachable within the same class, not outside the class


        AccessModifiers.method1();
        AccessModifiers.method2();
        //   AccessModifiers.method3(); //==> private is not visible outside the class


    }

}
