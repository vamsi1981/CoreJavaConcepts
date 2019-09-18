interface Measurable{
	public double getMeasure();
}
public class Employee implements Measurable{
    String name;
	double sal;
	Employee(){}
	Employee(String name, double sal){
		this.name = name;
		this.sal = sal;
	}
	
	public double getMeasure() {
	    
		return sal;
	}
	double average(Measurable[] objects) {
		int num=objects.length;
		double totalSal=0.0;
		for(Measurable m:objects)
		{
			totalSal+= m.getMeasure();
		}
		return totalSal/num;
	}

	public static void main(String args[]) {
		Measurable[] mt= {new Employee("Bharani",5000d),new Employee("vamsi",6000d),new Employee("Hetanishi",7000d),new Employee("Shiva",8000d)};
		
		Employee measurable = new Employee();
		System.out.println("the average salary of employees is: "+measurable.average(mt));
		
	}
}
