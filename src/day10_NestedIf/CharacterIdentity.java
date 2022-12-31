package day10_NestedIf;

public class CharacterIdentity {
    public static void main(String[] args) {
/*
write a program that can identify if the given character is digit or
alphabetic character or special characters

ex: ch = '@'

output: Special Character

 */
        char ch = '@';

        if (ch>= '0' && ch<='9'){
            System.out.println("Digit");
        }else if ( (ch>= 'A' && ch<= 'Z') || (ch>= 'a' & ch<= 'z')){
            System.out.println("Alphabetic");
        }else{
        System.out.println("Special character");
        }

        //____________________________________________________

    System.out.println((ch>= '0' && ch<= '9')? "Digit" :(ch>= 'A' && ch<= 'Z' || ch>= 'a' &&
    ch<= 'z')? "Alphabetic" : "Special Character");




    }
}
