

/**
 * Evaluate a simple interest equation to find the accrued amount that includes
 * principal plus interest. The formula for the accrued amount is A = P(1 + rt)
 * P = principal amount
 * r = rate of interest in %
 * t = time in years
 * Get these three values from the user as command line arguments and calculate the accrued amount
 */
public class SimpleInterest {
	public static void main(String[] args) {
    //args[0] is principal args[1] is Rate of interst and args[1] is Time in years
	if(args.length>=3 &&  args[0].matches("[0-9]+") && args[1].matches("[0-9]+") &&
			args[2].matches("[0-9]+"))
	{
	Double Principal = Double.parseDouble(args[0]);
	Double rateOfInterest = Double.parseDouble(args[1])/100;
	Double Years = Double.parseDouble(args[2]);
	Double SimpleInterest = Principal*(1+rateOfInterest*Years);
	System.out.println("Simple Interst is "+SimpleInterest);
	}
	else{
		System.out.println("provide Proper input");
	}
	
	
	}
}
