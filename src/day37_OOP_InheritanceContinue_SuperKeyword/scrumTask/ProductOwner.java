package day37_OOP_InheritanceContinue_SuperKeyword.scrumTask;

public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender, int ID, double salary, String companyName) {
        super(name, age, gender, "Product Owner", ID, salary, companyName);
    }

}
