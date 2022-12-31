package day37_OOP_InheritanceContinue_SuperKeyword.scrumTask;

public class BusinessAnalyst extends Employee{ //BusinessAnalyst IS A Eployee

    public BusinessAnalyst(String name, int age, char gender, int ID, double salary, String companyName) {
        super(name, age, gender,"Business Analyst", ID, salary, companyName);
    }
    public void analyze(){
        System.out.println(jobTitle+" "+name+" is analyzing the documents ");
    }
}
