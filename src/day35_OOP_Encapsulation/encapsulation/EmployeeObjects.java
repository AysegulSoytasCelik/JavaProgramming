package day35_OOP_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1= new Employee("Aysegul", 'F',41,125000);
employee1.setAge(32); //age turns 32
        /*
        we don't need this part because we create toString() method in the employee class
        System.out.println("employee1.getName() = " + employee1.getName());
        System.out.println("employee1.getGender() = " + employee1.getGender());
        System.out.println("employee1.getAge() = " + employee1.getAge());
        System.out.println("employee1.getSalary() = " + employee1.getSalary());
        */

        Employee employee2=new Employee("Yusuf",'M',42,130000);
        employee2.setName("Celik");
        employee2.setSalary(employee2.getSalary()+5000); //salary turns 135000


        System.out.println(employee1);
        System.out.println(employee2);



    }

}
