
/**
 * 1. write some methods for this class that print out the instance variables to the console
 * (example - printName(), printDepartment(), etc.).
 * 2. create a new test class with a main() method. You can call the test class as EmployeeTest.java.
 * 3. inside this test class, instantiate an object from this class and call its methods
 * (hint - use the 'new' operator to create an object).
 */
 class Employee {
	String name;
	String department;
	int age;
	Employee(String name,String department,int age)
	{
		this.name=name;
		this.department=department;
		this.age=age;
	}
	void printName(){
		System.out.println(name);
	} 
	void printDepartment(){
		System.out.println(department);
		
	}
	void printAge(){
		System.out.println(age);
	}
}
public class EmployeeTest {
public static void main(String[] args) {
	Employee ee =new Employee("John", "HR", 23);
	ee.printDepartment();
	ee.printAge();
	ee.printName();
}
}
