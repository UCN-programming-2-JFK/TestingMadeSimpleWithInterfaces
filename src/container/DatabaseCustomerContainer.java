package container;

import java.util.List;

import interfaces.CustomerContainer;
import model.Customer;

public class DatabaseCustomerContainer implements CustomerContainer {

	@Override
	public List<Customer> getAllCustomers() {
		// TODO add code which interacts with Database
		return null;
	}

	@Override
	public void deleteCustomer(Customer customerToDelete) {
		// TODO add code which interacts with Database
	}

	@Override
	public void updateCustomer(Customer customerToUpdate) {
		// TODO add code which interacts with Database
	}

	@Override
	public void addCustomer(Customer customer) {
		// TODO add code which interacts with Database
	}

}
