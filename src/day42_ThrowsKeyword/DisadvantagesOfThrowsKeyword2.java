package day42_ThrowsKeyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantagesOfThrowsKeyword2 {

    public static void main(String[] args) throws InterruptedException{


        method1();
        method2();
        method3();
        method4();

        String str =null;
        try{
            System.out.println(str.charAt(0)); // null exception
        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }

    public static void method(){
        try{
            method1();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void method1() throws InterruptedException {
       // new FileInputStream("");
        Thread.sleep(3000);
    }
    //"    public static void method1() throws FileNotFoundException   "
    //      --> this is not the best way.


  public static void method2()throws InterruptedException{
 //you can NOT call method1, inside this method, so you CAN not use the exception, inside this method
      //if you don't write throws keyword
      method1();

  }


  public static void method3() throws InterruptedException{
        method2();
        Thread.sleep(1000);
  }

  public static void method4() throws InterruptedException {
                                                    //Exception{  //why I can use Exception?
                                                  // Because it's parent of the other exceptions
        method3();                               // but it's not usable, because it's unckecked exceptions
  }





}
