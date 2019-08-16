
import java.io.FileReader;
import java.io.IOException;

public class UncheckedExceptionExample {
	public static void main(String[] args)
	{
	    try
	    {
	        FileReader file = new FileReader("pom.xml");
	         
	        file = null;
	         
	        file.read();
	    }
	    catch (IOException e)
	    {
	        //Alternate logic
	        e.printStackTrace();
	    }
	}
}
