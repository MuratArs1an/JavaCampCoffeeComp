package coffeeCompnyDemo;

public class StarbucksCustomerManager  extends CustomerManager {
	private CustomerCheckServise customerCheckServise;
	
	public StarbucksCustomerManager(CustomerCheckServise customerCheckServise) {
		this.customerCheckServise=customerCheckServise;
	}
	
	@Override
	public void save(Customer customer) {
		if(customerCheckServise.CheckIfRealPerson(customer))
		{
			System.out.println("Save to db: "+ customer.firstName);
		}else {
			System.out.println("Not a Valid Person");
		}
		
	}
	

}
