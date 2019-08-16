
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {
	public static void main(String[] args)
	{
	    try
	    {
	        FileReader file = new FileReader("somefile.txt");
	    }
	    catch (FileNotFoundException e)//without enforcing FileNotFoundException code, compiler
	    //will throw compiler error as jvm will force you to add exception blocks
	    {
	        //Alternate logic
	        e.printStackTrace();
	    }
	}
}
