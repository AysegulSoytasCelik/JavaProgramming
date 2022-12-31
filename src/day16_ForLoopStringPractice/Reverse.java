package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
        //index:     0123456789..
        String result = "";//contain the reversed version of str

        for (int i = str.length() - 1; i >= 0; i--) {  //i: index numbers of str
            result += str.charAt(i);    //this plus means; adding each character to the result                                                   // (starting last index to index0)

        }
        System.out.println(result);

       /*
       don't write as long as this, use "loop for"
       result += str.charAt(11); //n
        result += str.charAt(10); //o
        result += str.charAt(9);  //o
        result+=str.charAt(8);    //p
        result+=str.charAt(7);    //S
        result+=str.charAt(6);    //' '
        result+=str.charAt(5);    //n
        result+=str.charAt(4);    //e
        result+=str.charAt(3);    //d
        result+=str.charAt(2);    //o
        result+=str.charAt(1);    //o
        result+=str.charAt(0);    //W
        */

        String str2 = "What a wonderful life?";
        String result2 = "";
        for (int i = str2.length() - 1; i >= 0; i--) {
            result2 += str2.charAt(i);

        }
        System.out.println(result2);

        String myName = "Aysegul Soytas";
        String result3 = "";
        for (int i= myName.length()-1; i>=0; i--){
            result3+=myName.charAt(i);
        }
        System.out.println(result3);

    }
}
/*
. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */