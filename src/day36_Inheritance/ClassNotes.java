package day36_Inheritance;

public class ClassNotes {

}
/*
Java Day36
Topic: Inheritance Intro

package name: day36_Inheritance
*/
    /*
warmup tasks:
	1. Create a class named Student:
			private variables:
				name, age, gender, grade, schoolName

			Encapsulate all the fileds (at least encapsulate two fields manually)
					requirments:
						1. age should not be set less than 5 or greater than 90
						2. gender should not be set to any chanarcter other than: 'M' and 'F'
						3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

			Add a constructor that can set all the fields when the object is created
						(requirements of fields in the above must be applied)


			Methods:
				study()
				toString()
*/

/*

Encapsulation: hiding the fileds by giving private access modifiers

			  use getter/setter to read/write the private data


			  Getter (Read Only): public instance method
			  					  Return type is not void
			  					  Return type must match with private instance variable' data type
			  					  Does not pass any parameter
			  					  Returns the private instance variables value

			  Setter (Write Only): public instance method
			  					   Return type is void
			  					   Passes a parameter
			  					   Parameter' data type must match with private instance variable' data type
			  					   reassigns the private instance variable to given argument





use the data:
	1. read
	2. write
*/

    /*


Inheritance Topic:
		Is A relation ==>day36
		extends keyword ==>day36
		super keyword & constructor ==>day37
		Types of Inheritance  ==>day37
		Is A relation vs Has A relation  ==>day38
		Method Overriding  ==>day38

		Next Friday: day39
	implement both Inheritance and Encapsulation




Today:
	Is A relation
	extends keyword

Tomorrow:
		super keyword & constructor
		Types of Inheritance


Next Thursday:
	Is A relation vs Has A relation
	Method Overriding


Next Friday:
	implement both Inheritance and Encapsulation





Task:

	Animal:
		name, breed, gender, size, age, color
		setInfo(), eat(), drink(), move(), sleep(), toString()


	Dog extends Animal:
			bark()

	Cat extends Animal:
			scratch()

	Tiger extends Animal:
			roar()

	Fish extends Animal:
			swim()

	...

import vs extends:
		import: borrowing
		extends: owning


	inherit ->pass it through
	import -> let using


lunch task:

	Employee:
		name, gender, age, jobTitle, id, salary, companyName
		setInfo(), work(), toString()


	Tester

	Developer

	Driver

	Teacher
 */