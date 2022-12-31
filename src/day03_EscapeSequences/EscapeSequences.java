package day03_EscapeSequences;

/*
escape sequences: MUST be given with double quote
   1  \n: starts a new line
   2  \t: paragraph space (tab)
   3  \\: single back slash
   4   \": double quote

 */
public class EscapeSequences {
    public static void main(String[] args) {

        System.out.println("Java \nPython \nC#");

        System.out.println("---------------------------------------------");

        System.out.println("Hello Cydeo. \nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next week?");
        System.out.println("-----------------------------------------------");

        System.out.println("\tJava is Cool Programming Language");

        System.out.println("------------------------------------------------------");

        System.out.println("/ \\");  // in order to print one backward slash we need to give two backward slashes

        System.out.println("/ \\\\");

        System.out.println("-----------------------------------------------------------");

        System.out.println("\tMy favourite TV show is \n\t\"Game of Thrones\"");


    }


}
