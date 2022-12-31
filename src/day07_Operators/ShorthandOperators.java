package day07_Operators;

public class ShorthandOperators {


    public static void main(String[] args) {
        //assignment : = //it makes update the value
        int number = 100;
        System.out.println("number =" + number); //100

        number = 200;
        System.out.println("number= " + number); //200
//if you give new variable, you should change the name. because all name must be unique


        System.out.println("--------------------------------------------------------------");

        //1
        String word = "Java Programming"; //Java Programming
        System.out.println("word =" + word); // word = Java Programming
        //2
        word = "Wooden Spoon";
        System.out.println("word= " + word); // word= Wooden Spoon
        //3
        word = "Cydeo";
        System.out.println("word= " + word); // word= Cydeo
        word = "123";
        // word="123";this is not a number because on the top I gave data variable which is String
        // System.out.println("123"+ 1); //1231
        word = "Java Programming";
        //it's turned first word
        System.out.println("----------------------------------------------------------");

        //Addition Assignment:
        int x = 100;
        System.out.println("x=" + x); //x=100
        System.out.println(x + 200); //=300
//but if I want to change the value I should give new value from x
        // x = x + 200;
        x += 200;  //now x # 100,  x = 300
        System.out.println("x=" + x); // x=300

        System.out.println("=================================================================");

        String str = "Wooden";
        str += " Spoon";

        System.out.println("str = " + str); // str= wooden Spoon
        System.out.println("==============================================================");


        double num1 = 2.5;
        System.out.println("num1 = " + num1);

        num1 += 5.5;
        System.out.println("num1= " + num1); //num1=8.0

        System.out.println("-------------------------------------------------------");

        double availableBalance = 1000.50;
        //deposit 300$
        availableBalance += 300;
        System.out.println(" availableBalance= " + availableBalance); //1300.5
        System.out.println("=========================================================");
        //SUBSTRACTION ASSIGNMENT

        //withdrawing 500$

        //availableBalance+= 500; ==> it means addition==> 1300+500 but we dont need this 
        availableBalance -= 500;
        System.out.println("availableBalance = " + availableBalance); // =800.5$

        //withdrawing 200$, then depositing 400$

        availableBalance -= 200; //avilablebalance= 600.5
        availableBalance += 400; // availableBalance = 100.5$
        System.out.println("===============================================================");

        //MULTIPLICATION ASSIGNMENT
        double salary = 50000.5;
        System.out.println("salary = " + salary); // salary= 50000.5
        salary *= 2;
        System.out.println("salary = " + salary); // salary = 100001.0

        double doge = 0.00000001;
        doge *= 1000000;
        System.out.println("doge = " + doge); // doge= 0.01

        System.out.println("=======================================================");

        //DIVISION ASSIGNMENT  /=

        double num2 = 25000;
        // num2 = num2/2; 
        num2 /= 2;
        System.out.println("num2 = " + num2);

        System.out.println("----------------------------------------------");


        //REMAINDER ASSIGNMENT %=
        double num3 = 100;
        num3 %= 3; //to find reminder
        System.out.println("num3 = " + num3); //num3=1.0
        System.out.println("--------------------------------");
        int amount = 127; // cents how many quarters does have 127cents?
        // reminder?
        int quarters = 127 / 25; //5 quarters
        int cents = 127 % 25; //reminder is 2
        System.out.println("quarters= " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("----------------------------------------------------------");
        int cents2 = 127;
        cents2 %= 25;  //reminder is 2
        //127 % 25 = %=25 ===> same result
        System.out.println("cents2 = " + cents2);
        System.out.println("-------------------------------------------------------------");

        int y = 300;
        y %= 16;  //reminder is 12. this is not answer to 300/16. answer to whats reminder 300/16
        System.out.println("y = " + y);

        System.out.println("____________________________________________________");
        int balance = 3500;
        //insurance fee ; $153
        balance %= 153;
        System.out.println("balance = " + balance);

    }

}

