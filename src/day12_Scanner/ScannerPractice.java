package day12_Scanner;

import java.util.Scanner; //regular import: imports one class

//import java.util.*;
         // *means wild import: imports everything from the package
public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7: ");

        int num = scan.nextInt();
        String result = "";
        if (num>=1 && num<=7){  //should write 7
  result = (num==1)?"monday" :(num==2)?"tuesday" :(num==3)?"wedns" :(num==4)? "thurs"
          :(num==5)?"friday" :(num==6)?"satrdy":"sunday";

        }else {
            result = "invalid number";

        }
            System.out.println(result);



scan.close();




    }
}
