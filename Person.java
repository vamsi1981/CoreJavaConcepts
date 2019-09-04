
public class Person { //creating a Person Class

	String name; //creating member variables
	Person(){
		
	}
	Person(String name)   //creating methods
	{
		this.name=name;
	}
	public void greeting()
	{
		System.out.println("Hello"+name);
	}
	public static void main(String[] args) {
		Person p = new Person("John"); // Instantiation of object
		p.greeting(); //calling method on the object
	}
}
