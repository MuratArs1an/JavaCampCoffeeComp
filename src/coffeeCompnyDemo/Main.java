package coffeeCompnyDemo;

public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.dogumYili=1987;
		customer.id=1;
		customer.firstName="Murat";
		customer.lastName="Arslan";
		customer.nationalId=13390071734L;
		CustomerManager customerManager=new StarbucksCustomerManager(new MernisServiseAdapter());
		customerManager.save(customer);

	}

}
