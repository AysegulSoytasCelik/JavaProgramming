package day43_OOPAbstraction.Employee;

public class EmployeeObjects {


    public static final Tester TESTER = new Tester("Ali", 30, 'M', 42, "SDET", 145000.00);

    public static void main(String[] args) {

        // Person person =new Person("Josh",35,'M'); ==>"Person" is abstract, can not be instantiated

        //   Employee employee = new Employee() ==>'Employee' is abstract; cannot be instantiated


        Tester tester = new Tester("Ali", 30, 'M', 42, "SDET", 145000.00);
        Developer developer = new Developer("Alex", 28, 'M', 32, "Web Developer", 155000.00);
        Teacher teacher = new Teacher("Angel", 28, 'F', 22, "English Teacher", 85000.00);
        Driver driver = new Driver("Jhon", 34, 'M', 42, "Lyft Driver", 75000.00);

        System.out.println(TESTER);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        tester.eat();
        tester.sleep();
        tester.work();
        tester.bugReport();

        System.out.println("--------------------------------------------------------------------------");

        developer.work();
        developer.sleep();
        developer.eat();
        developer.unitTest();
        // developer.bugReport(); --->because this is tester class's method


        System.out.println("--------------------------------------------------------------------------");

        teacher.work();
        teacher.sleep();
        teacher.eat();

        System.out.println("--------------------------------------------------------------------------");

        driver.work();
        driver.eat();
        driver.sleep();


    }


}
