package day34_Static_GarbageCollection_AccessModifier;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("main method");



    }
    static {
        System.out.println("Static Block");  // runs FIRST before anything, and only runs one time
    }

    //          1."Static Block"
    //          2."main method"

    static {
        System.out.println("Static Block2");
    }
    static {
        System.out.println("Static Block3");
    }

}
