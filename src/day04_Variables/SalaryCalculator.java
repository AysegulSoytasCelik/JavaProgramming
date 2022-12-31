package day04_Variables;

public class SalaryCalculator {
    //hourlyRate, weeklyHours
    public static void main(String[] args) {

        int hourlyRate = 50;
        int weeklyHours = 40;
        int numberOfWeeks = 52;

        int salary = hourlyRate * weeklyHours * numberOfWeeks;



        System.out.println(salary); //dont use""if you use it means, this is only text"salary"
        System.out.println("weeklyHours = $" + weeklyHours);
        System.out.println("hourlyRate = " + hourlyRate);
        System.out.println("salary = $" + salary);

        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = $" + salary);





        /* first write the short cut sout,
            after add it, letter 'v'
            it makes the code different and shows you some choises
             click your choise (which you write them before this code neat "int"
             int hourlyRate = 50 ......
         */





    }

}
