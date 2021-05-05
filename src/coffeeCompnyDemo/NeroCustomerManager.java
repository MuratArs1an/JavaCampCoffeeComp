package coffeeCompnyDemo;

public class NeroCustomerManager extends CustomerManager{

	@Override
	public void save(Customer customer) {
		System.out.println("Save to db : "+ customer.firstName);
		
	}

}
