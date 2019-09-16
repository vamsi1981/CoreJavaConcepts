import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Organisation{  
	
	 int deptNum;  
	 String deptName;  
	 void insertRecord(int r, String n){  
	  deptNum=r;  
	  deptName =n;  
	 }  
	 void displayInformation(){System.out.println(deptNum+" "+ deptName);}  
	}  
public class InstanceCreation{  
	
	 public static void main(String args[]) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, CloneNotSupportedException{  
	  Organisation s1 =  new Organisation();  // Instance creation using new Operator
	  Organisation s2 = (Organisation) Class.forName("Organisation").newInstance(); //Instance creation using Class.forName
	  Organisation s3 =  Organisation.class.newInstance(); // Instance Creation using 
	  Constructor<Organisation> constructor = Organisation.class.getConstructor();
	  Organisation s5 = constructor.newInstance(); 
	  InstanceCreation obj = new InstanceCreation();
	  InstanceCreation obj2 = (InstanceCreation) obj.clone();// Instance creation using clone
	  
	  s1.insertRecord(111,"IT");  
	  s2.insertRecord(222,"HR");  
	  s3.displayInformation();  
	 }  
	} 
