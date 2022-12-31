package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        //write a program that can merge two arrays of integer
        //int[] arr1 ={1,2,3};
        //int[] arr2={4,5};

        String[] group1={"Ali","Layan","Aysenur"};
        String [] group2={"Maria","Aygun","Duygu","Suat","Valeriy"};

        String[] students =new String[group1.length+group2.length]; //kabi secmek icin malzeme tanimliyouz ki kap yeterli olsun

        int i=0;
        for (String each : group1) {
           students[i++] =each;
        }
        for (String each : group2) {
            students[i++]=each;
        }
        System.out.println(Arrays.toString(students));

        System.out.println("-----------------------------------------------------------------------------");

        char[] ch1={'a','b','c'};
        char[] ch2={'d','e','f','g','h'};

        int j=0;
        char[] chars= new char[ch1.length+ch2.length];
        for (char ch : ch1) {
            chars[j]=ch;
            j++;
        }
        for (char ch : ch2) {
           chars[j]=ch;
           j++;
        }
        System.out.println(Arrays.toString(chars));






    }
}
