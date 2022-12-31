package day31_CustomClass_Constructors;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setInfo("Aysegul Celik", 1234556);
        System.out.println(account1);

        account1.deposit(900000);
        account1.checkBalance();
        account1.withdraw(9000);
        account1.checkBalance();
        account1.deposit(567000);
        account1.checkBalance();

        System.out.println("---------------------------------------------------------");
        BankAccount account2 = new BankAccount();
        account2.setInfo("Yusuf Celik",1234567);

        account2.deposit(10000);
        account2.checkBalance();
        account2.withdraw(100000);
        account2.checkBalance();
        account2.deposit(250000);
        account2.checkBalance();


    }
}
