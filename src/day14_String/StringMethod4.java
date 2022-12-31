package day14_String;

public class StringMethod4 {
    public static void main(String[] args) {
        //

        String str = "Cydeo";
        String str2 = str.repeat(4); //CydeoCydeoCydeoCydeo
        System.out.println(str);

        String s1 = " Wooden Spoon";
        String s2 = s1.repeat(100);

        System.out.println(s2);

        System.out.println("=========================================================");
        String s3 = " What a wonderful life ";
        String s4 = s3.repeat(10000);
        System.out.println(s4);
        System.out.println("======================================================");

        String name1 ="Java";
        String name2 = ":)";
        System.out.println((name1+ " ").repeat(5)+(name2+" ").repeat(8));

    }
}
