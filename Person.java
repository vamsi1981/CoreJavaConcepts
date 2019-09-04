
public class Person {

	String name;
	Person(){
		
	}
	Person(String name)
	{
		this.name=name;
	}
	public void greeting()
	{
		System.out.println("Hello"+name);
	}
	public static void main(String[] args) {
		Person p = new Person("John");
		p.greeting();
	}
}
