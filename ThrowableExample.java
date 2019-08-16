
import java.io.*; 

class ThrowableExample { 
  
    // Main Method 
    public static void main(String[] args) 
        throws Exception 
    { 
  
        try { 
  
            testException1(); 
        } 
  
        catch (Throwable e) { 
  
            // access to the stack trace 
            StackTraceElement[] trace = e.getStackTrace(); 
  
            System.out.println("Thrown "+trace[0].toString()); 
        } 
    } 
  
    // method which throws Exception 
    public static void testException1() 
        throws Exception 
    { 
  
        // create a new Exception 
        Exception ex = new Exception(); 
  
        StackTraceElement[] trace = new StackTraceElement[] { 
            new StackTraceElement("ClassNameOfExe", 
                                  "methodNameOfExe", 
                                  "fileNameOfExe", 
                                  10) 
        }; 
  
        // sets the stack trace elements 
        ex.setStackTrace(trace); 
  
        // throw the Throwable[ 
        throw ex; 
    } 
} 
