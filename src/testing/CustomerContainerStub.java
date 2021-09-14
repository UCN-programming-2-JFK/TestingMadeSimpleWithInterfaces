package testing;

import java.util.ArrayList;
import java.util.List;

import container.DatabaseCustomerContainer;
import interfaces.CustomerContainer;
import model.Customer;

public class CustomerContainerStub extends DatabaseCustomerContainer {

	
	List<Customer> customers = new ArrayList<Customer>();

	@Override
	public List<Customer> getAllCustomers() {
		return customers;
	}
	
	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customers.add(customer);
	}	
}