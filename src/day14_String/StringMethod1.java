package day14_String;

public class StringMethod1 {
    public static void main(String[] args) {
        String str1 = "   batch  25      ";
        str1 = str1.trim();        //"batch 25"

        System.out.println(str1);

        String str2 = "Cydeo School";
        int n1 = str2.indexOf('h');
        System.out.println("n1 = " + n1); // 8

        int n2 = str2.indexOf("o");
        System.out.println("n2= " + n2);

        //but if it's the second 'o'? how can we make it specific?

        int n3 = str2.indexOf("ool");
        System.out.println("n3= " + n3);
//----------------------------------------------------------------------------------------------
        String str3 = "Java Programming language";
        int n4 = str3.indexOf("am");
        System.out.println("n4=" + n4);

        int n5 = str3.indexOf("g ");
        System.out.println("n5= " + n5);

        int n6 = str3.lastIndexOf("g");
        System.out.println("n6= " + n6);
        //-----------------------------------------------------------------------------------

        String s = "Java Nova Cava Wawa orange";
        int firstA = s.indexOf("a");
        System.out.println("first a= " + firstA);

        int lastA = s.lastIndexOf("a");
        System.out.println("last a= " + lastA);

        int secondA = s.indexOf("a ");
        System.out.println("second a= " + secondA);

        int thirdA = s.indexOf("a C");
        System.out.println("thirdA= " + thirdA);

        //int fourthA = s.indexOf("ava W");
        //int fourthA = s.lastIndexOf("av");
        int fourthA =s.indexOf("Ca") +1;  //alternative way
        System.out.println("fourth A= " + fourthA);

        //int fifthA = s.lastIndexOf("")





    }
}
