package day43_OOPAbstraction.Employee;

public abstract class Employee extends Person{
    private final int id;
    private  String jobTitle;
    private double Salary;

    //constructor
    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
       if (id<=0){
           throw new RuntimeException("invalid ID "+id);
       }
       this.id=id;
        setJobTitle(jobTitle);
        setSalary(salary);
    }


    //getter-setter
    public int getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                " name=" + getName() +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
