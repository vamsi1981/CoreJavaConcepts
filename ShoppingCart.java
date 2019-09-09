

/**
 * 1. Create a new ShoppingCart object inside the main() method
 * 2. Add some products like "phone", "milk", and "chocolate" to the shoppingCart variable of the object you created in Step 1
 * 3. Loop the shoopingCart and use the prices given in the code to compute the total cost of all items in the cart
 * 4. Print the total value of goods to the console
 */
public class ShoppingCart {
	
	private double PRICE_OF_PHONE = 425.0;
	private double PRICE_OF_CHOCOLATE = 7.5;
	private double PRICE_OF_MILK = 2.50;
	private String[] shoppingCart;
	
	public String[] takeShoppingItems(String... values)
	{
		shoppingCart=new String[values.length];
		for(int i=0;i<values.length;i++)
		{
			shoppingCart[i]=values[i];
		}
		return shoppingCart;
	}
	
	public static void main(String[] args) {
    	ShoppingCart sc1 = new ShoppingCart();
    	sc1.takeShoppingItems("IPhone","SamsungPhone","VanillaChocolate","SugarlessChocolate","LowFatMilk","CreamMilk");//All the items that were shopped can be added here or
    	//through command line arguments as well
    	
    	double cost=0.0;
    	for(String s:sc1.shoppingCart)
    	{
    		String itemName = s.toLowerCase();
    		String item = itemName.toLowerCase().contains("phone")?"phone":itemName.toLowerCase().contains("chocolate")?"chocolate":itemName.toLowerCase().contains("milk")?"milk":"No Item";
    		
    		switch(item)
    		{
    		case "phone":
    			cost+=sc1.PRICE_OF_PHONE;
    			break;
    		
    		case "chocolate":
    			cost+=sc1.PRICE_OF_CHOCOLATE;
    		    break;
    		
    	case "milk":	
    		cost+=sc1.PRICE_OF_MILK;
		    break;
		
		    default:cost+=0.0;
    	}
    	
	}
    	System.out.println("The total cost of shopping is "+cost);
}
}
