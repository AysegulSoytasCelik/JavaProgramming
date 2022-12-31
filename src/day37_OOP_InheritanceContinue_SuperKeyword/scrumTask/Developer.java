package day37_OOP_InheritanceContinue_SuperKeyword.scrumTask;

public class Developer extends Employee { //Developer IS A Employee

    public Developer(String name, int age, char gender, String jobTitle, int ID, double salary, String companyName) {
        super(name, age, gender, jobTitle, ID, salary, companyName);
    }
    public void fixBugs(){
        System.out.println(jobTitle+" "+name+" is crying");
    }

}
