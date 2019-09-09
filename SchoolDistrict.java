
class School
{
static int totalStudentsEnrolled;	
String name;
int numberOfStudentsEnrolled;
School(String name,int numberofStudentsEnrolled)
{
this.name=name;
this.numberOfStudentsEnrolled=numberofStudentsEnrolled;
totalStudentsEnrolled+=this.numberOfStudentsEnrolled;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNumberOfStudentsEnrolled() {
	return numberOfStudentsEnrolled;
}
public void setNumberOfStudentsEnrolled(int numberOfStudentsEnrolled) {
	this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
}

}
public class SchoolDistrict {

	public static void main(String[] args) {
		School s1[] = {new School("Xavier",200),new School("MileStone",500),new School("Tutor Time",300)};
		
		System.out.println("Total Number of Schools "+s1.length);
		
		System.out.println("Name of School and Students in order:");
		System.out.println("-----------------------------------");

		for(School s:s1)
		{
			System.out.println("-----------------------");	
		System.out.println("Name of School "+s.getName());
		System.out.println("Number os studnets in School "+s.getNumberOfStudentsEnrolled());
		System.out.println("-----------------------");
		}
		System.out.println("-----------------------------------");
		System.out.println("Total Students enrolled in School District "+School.totalStudentsEnrolled);
		
	}
}
