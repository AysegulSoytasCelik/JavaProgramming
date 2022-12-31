package day34_Static_GarbageCollection_AccessModifier;

public class Constructor_vs_StaticBlock {

    static {  //runs first , runs just one time
        System.out.println("Static Block");
    }
    public Constructor_vs_StaticBlock(){ //
        System.out.println("Constructor");
    }

    public static void main(String[] args) { //runs second
        //main method can NOT run outside the class

        new Constructor_vs_StaticBlock(); //1
        new Constructor_vs_StaticBlock(); //2
        new Constructor_vs_StaticBlock(); //3
        new Constructor_vs_StaticBlock(); //4
        new Constructor_vs_StaticBlock(); //5
    }
}
