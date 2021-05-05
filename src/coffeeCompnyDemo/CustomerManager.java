package coffeeCompnyDemo;

public abstract class CustomerManager implements CustomerServise{

	@Override
	public void save(Customer customer) {
		System.out.println("Save to db : "+ customer.firstName);
		
	}
	}

