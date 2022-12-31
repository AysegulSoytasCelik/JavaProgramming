package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {
        for (int i = 15; i <= 45; i++) {
            // System.out.print(i+"\n"); //all numbers in a new line
            System.out.print(i + " ");//all numbers in the same line
        }
        System.out.println("===========================================");
        for (int i = 100; i > 49; i--) {   // i:100,99,98,97,96,....50.
            System.out.print(i + "\n");
            // System.out.print(i+" ");
        }
        System.out.println("=========================================================");
        for (int i1 = 1; i1 <= 55; i1++) {
            if (i1 % 2 == 0) {
                System.out.print(i1 + " ");
            }
        }
        System.out.println("===================================================================");
//print all the even numbers betveen 1~55: 2-4-6-8-..54
        //second way

        for (int i1 = 2; i1 <= 54; i1 += 2) {
            System.out.print(i1 + " ");
        }
        System.out.println("===============================================================");
/*A~Z
a~z
Z~A
z~a
 */
        //A~Z ===> char
        for (char a = 65; a <= 90; a++) {
            System.out.print(a + " ");
        }
        System.out.println();
        //a ~ z

        for (char a = 97; a <= 122; a++) {
            System.out.print(a + " ");
        }
        System.out.println();
        //z~a
        for (char a = 90; a >= 65; a--) {
            System.out.print(a + " ");
        }
        //Z~A
        System.out.println();
        for (char a = 122; a >= 97; a--) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("============================================");
        for (char i = 1; i<=40000; i++){
            System.out.print(i+" ");
        }






    }
}
