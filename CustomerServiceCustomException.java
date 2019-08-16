class Customer
{
	String name;
	Customer(){}
	Customer(String name)
	{
		this.name=name;
	}
	}

class NameNotFoundException extends Exception {

    public NameNotFoundException(String message) {
        super(message);
    }

}
public class CustomerServiceCustomException {

    public Customer findByName(String name) throws NameNotFoundException {

        if ("".equals(name)) {
            throw new NameNotFoundException("Name is empty!");
        }

        return new Customer(name);

    }

    public static void main(String[] args) {

        CustomerService obj = new CustomerService();

        try {

            Customer cus = obj.findByName("");

        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }

    }
}
