package day14_String;

import java.sql.SQLOutput;

public class StringMethods_5 {
    public static void main(String[] args) {
        String str =" ";
        boolean r = str.isEmpty();
        System.out.println(r);
        System.out.println("================================================================");
        String s1 ="CYDEO";
        String s2= "cydeo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("=========================================================");

        String sentence="My favourite programming Language is Java";
        boolean hasCSharp =sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJAva2= sentence.contains("java");
        boolean hasJava3= sentence.toLowerCase().contains("java");
        boolean r3 = sentence.contains("java") || sentence.contains("Java");



        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJAva2);
        System.out.println(hasJava3);
        System.out.println(r3);


        System.out.println("===============================================================");

        String input1 =" I love JAVA";
        String input2= "Java";

        System.out.println(input1.equals(input2)); //false
        System.out.println(input1.equalsIgnoreCase(input2)); //false
        System.out.println(input1.contains("Java")); //true
 //  System.out.println(input1.toLowerCase().contains("java"));  //if we change the letters =jAvA
 //       System.out.println(input1.toUpperCase().contains("JAVA"));

        System.out.println("=====================================================================");
        String  a ="Wooden Spoon";
        boolean x = a.startsWith("Woo"); //why not oo or den. because it starts with zero=W
                                        //true
        boolean y = a.endsWith("Spoon"); //true
        boolean z = a.toLowerCase().startsWith("wooden"); //true
        //--in order to ignore the case sensitivity we first create the lower case of upper case
        //and then compare it with lowercase/uppercase

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);






    }
}
