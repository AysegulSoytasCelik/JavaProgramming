package day14_String;

public class EmailDomain_Substring {
    public static void main(String[] args) {
        String email = "Cydeo.School@gmail.com";
        //output: gmail
        //domain:
        int beginningIndex = email.indexOf("@") + 1;
        int endingIndex = email.lastIndexOf(".");

        /* DIFFICULT WAY IS THIS: DEFINE THE METHOD DIRECTLY
        EASY WAY IS DEFINE THE METHOD SEPARATELY

        String mail1 = email.substring(email.indexOf("@") +1 , email.lastIndexOf("."));
        System.out.println(mail1);


        and after that if you want to chance the word you can use

          // String mail2 = mail1.replace("gmail", "yahoo");
        //System.out.println(mail2);

        */
        String domain = email.substring(beginningIndex,endingIndex);
        System.out.println(domain);


        System.out.println("=======================================================");


        String str1= "Java is fun, Java is cool, I love Java";
        String s1 = str1.substring(0,10+1);

        System.out.println(s1); //Java is fun


        int beg= str1.indexOf(" J")+1;  //kelimeden secilecek olani tanimladik
        int end =str1.lastIndexOf(",");
        String s2= str1.substring(beg,end);    //Java is cool

        System.out.println(s2);


        String s3 =str1.substring(str1.lastIndexOf("I"));

        System.out.println(s3);







    }
}
