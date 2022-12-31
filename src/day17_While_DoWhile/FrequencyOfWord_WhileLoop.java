package day17_While_DoWhile;

import java.util.Scanner;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
        String str = "Java Java Python Python";
        int frequency=0;

        while (str.contains("Java")){
           str= str.replaceFirst("Java","");
           frequency++;
        }
        System.out.println(frequency);
        System.out.println("=================================================================");

        String sentence= "cat cat cat cat dog dog  dog cat cat";
        sentence=sentence.toLowerCase();
        int countCat=0;

        while (sentence.contains("cat")){
           sentence=sentence.replaceFirst("cat","");
           countCat++;
        }
        System.out.println(countCat);


        //=================================================

        String s= "java java java python python python";
        int countJava= 0;
        int countPyhton=0;
        while (s.contains("java") || s.contains("python")){
            if (s.contains("java")){
                s=s.replaceFirst("java","");
                countJava++;
            }
            if (s.contains("python")){
                s=s.replaceFirst("python","");
                countPyhton++;
            }
        }
        System.out.println(" countjava= "+countJava);
        System.out.println("countPython= "+countPyhton);




    }
}
