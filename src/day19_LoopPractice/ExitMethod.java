package day19_LoopPractice;

import com.sun.security.jgss.GSSUtil;

public class ExitMethod {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            if (i==3){
              //  break; ==>terminates the loop
                //continue; ==>terminates the current iteration of the loop
                System.exit(0); //it terminates entire the program
            }
            System.out.println(i);
        }




    }
}
