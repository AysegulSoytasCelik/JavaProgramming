package day31_CustomClass_Constructors.scrumTask;

public class Tester {
    public String name;
    public int employeeID;
    public String JobTitle;
    public double Salary;

    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        JobTitle = jobTitle;
        Salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", JobTitle='" + JobTitle + '\'' +
                ", Salary= $" + Salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name+" is smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating testing");
    }
    public void dailyStandUp(){
        System.out.println(name+" is daily Stand Up");
    }


}
/*
Scrum Task:
	create a class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary

	        Add A constructor that can set all the fields

	        Actions:
	           smokeTesting(),  creatingTicket(), dailyStandUp() toString()
	           */

    /*

	create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary

	          Add A constructor that can set all the fileds

	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()

	create a class called ScrumTeam
	           Attributes:
	                String PO, BA, SM;
	                ArrayList<Tester> testersList = new ArrayList<>();
	                ArrayList<Developer> devopsList = new ArrayList<>();
	                int daysOfSprint;

	               Add A constructor that can set the fileds PO, BA, and SM

	             Actions:
	                  addTester(Tester tester): adds the given tester to the testers ArrayList

	                  addTesters(Tester[] testers): adds the given testers to the testers ArrayList

	                  addDeveloper(Developer developer): adds the given developer to the developers ArrayList

	                  addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList

	                  removeTester(long employeeID): removes the given tester from the testers ArrayList

	                  removeDeveloper(long employeeID): removes the developer from the developers ArrayList

	                  toString(): prints number of tester,& developers,  PO name, SM name, BA name


 */