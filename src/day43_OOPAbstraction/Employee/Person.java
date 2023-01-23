package day43_OOPAbstraction.Employee;

public abstract class Person {

    private  String name;
    private  int age;
    private char gender;


    //constractor
    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }


    //getter-setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            throw new RuntimeException("Invalid age: "+age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    //methods
    public abstract void sleep();

    public  void eat(){
        System.out.println(name+ " is eating baklava");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
Employee task:
		abstract Person:
			name, age, gender(final)

			eat();
			sleep();

		abstract Employee extends Person:
			 id(final), jobTitle, salary...

			work();


		Tester
			work(): testing


		Developer
			work(): developing


		Teacher
			work(): teaching


		Driver
			work(): driving

 */


