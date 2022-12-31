package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {
        String str="123";
       int num =  Integer.parseInt(str); // int to int
        System.out.println(num+1); //124
        System.out.println(str+1); //1231

        String str2= "10.5";
        double num2 = Double.parseDouble(str2); //double
        System.out.println(num2); //10.5
        System.out.println(num2+15); // 10.5+15 ==> 25.5

        int max= Integer.MAX_VALUE;
        int min= Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        
        long max2=Long.MAX_VALUE;
        long min2=Long.MIN_VALUE;

        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);

        String s1= "true";

        boolean r1= Boolean.parseBoolean(s1);
        System.out.println(r1);

        System.out.println("====================================================================");

        String s2="123";
         Integer x= Integer.valueOf(s2); //Integer ==>
        int y = Integer.valueOf(s2); // integer ==>unboxing

        System.out.println(x);
        System.out.println(y);

        String s3="1.5";
        Double z = Double.valueOf(s3); //double

        System.out.println(z);

        System.out.println("---------------------------------------------------------------------------");

        //isDigit()
        char ch1= '0';
      boolean r2=  Character.isDigit(ch1); // because 0 is a digit number, this boolean comes true
                                            //but if we write a letter to ch1, r2 comes false, because NOT digit
        //isLetter()
        char ch2 ='A';
        boolean r3= Character.isLetter(ch2); //it's a method for letters

        // special char
        char ch3 ='!';
        boolean r4 = !Character.isLetterOrDigit(ch3);// ikisi de degilse

        //upperCase  (use ch2 variable for example)
        boolean r5= Character.isUpperCase(ch1); //'A' is upper case ==> true

        // lowerCase()
        boolean r6= Character.isLowerCase(ch2); //false


        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("--------------------------------------------------------------------");

        String s= "ab1cde2efg3hi4";
        int sum= 0;

        for (char each : s.toCharArray()) {
            if (Character.isDigit(each)){
                sum+= Integer.parseInt(""+each);
            }

        }
        System.out.println("sum:" +sum);


    }
}
